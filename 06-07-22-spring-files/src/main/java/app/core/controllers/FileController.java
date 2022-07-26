package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import app.core.services.FileStorageService;

@RestController
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

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam MultipartFile file) {
		try {
			return this.fileStorageService.storeFile(file);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, generateErrorMsg(e));
		}
	}
}
