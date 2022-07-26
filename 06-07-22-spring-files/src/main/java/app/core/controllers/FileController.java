package app.core.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import app.core.services.FileStorageService;

@RestController
@CrossOrigin
@RequestMapping("/files")
public class FileController {

	@Autowired
	private FileStorageService fileStorageService;

	private String generateErrorMsg(Exception e) {
		String msg = e.getMessage();
		Throwable t = e.getCause();
		while (t != null) {
			msg += " => " + t.getClass().getSimpleName();
			t = t.getCause();
		}
		return msg;
	}

	// /uploadFile?file=01010111101
	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam MultipartFile file) {
		try {
			return this.fileStorageService.storeFile(file);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, generateErrorMsg(e));
		}
	}

	@GetMapping("dowloadFile/{fileName}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
		Resource resource = this.fileStorageService.loadFileAsResource(fileName);
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException e) {
			System.out.println("failed to determine file type");
		}

		if (contentType == null) {
//			contentType = "application/octet-stream";
			contentType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
		}

		System.out.println("content type: " + contentType);

		return ResponseEntity

				.ok()

				.contentType(MediaType.parseMediaType(contentType))

				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")

				.body(resource);
	}

	@GetMapping("/one")
	public ResponseEntity<Resource> downloadFileParam(@RequestParam String fileName, HttpServletRequest request) {
		Resource resource = this.fileStorageService.loadFileAsResource(fileName);
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException e) {
			System.out.println("failed to determine file type");
		}

		if (contentType == null) {
//			contentType = "application/octet-stream";
			contentType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
		}

		System.out.println("content type: " + contentType);

		return ResponseEntity

				.ok()

				.contentType(MediaType.parseMediaType(contentType))

				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")

				.body(resource);
	}

	@DeleteMapping("/{fileName}")
	public boolean deleteFile(@PathVariable String fileName) {
		try {
			return this.fileStorageService.deleteFile(fileName);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, generateErrorMsg(e));
		}
	}

	@PutMapping("/{oldFileName}/{newFileName}")
	public boolean renameFile(@PathVariable String oldFileName, @PathVariable String newFileName) {
		try {
			return this.fileStorageService.renameFile(oldFileName, newFileName);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, generateErrorMsg(e));
		}
	}

	@GetMapping
	public String[] listFileNames() {
		return this.fileStorageService.listFileNames();
	}

	@DeleteMapping
	public void deleteAllFiles() {
		this.fileStorageService.deleteAllFiles();
	}

}
