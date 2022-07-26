package app.core.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileStorageService {

	@Value("${file.upload-directory}")
	private String uploadDir;
	private Path fileStoragePath;

	@PostConstruct
	public void init() {
		this.fileStoragePath = Paths.get(this.uploadDir).toAbsolutePath().normalize();
		System.out.println("files storage path: " + fileStoragePath);
		try {
			// create the directory if needed
			Files.createDirectories(fileStoragePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// UPLOAD
	public String storeFile(MultipartFile file) {
		// normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		// check for name validity
		if (fileName.contains("..")) {
			throw new RuntimeException("file name contains invalid characters: " + fileName);
		}
		// copy file to target location
		try {
			Path tagetLocation = this.fileStoragePath.resolve(fileName);
			Files.copy(file.getInputStream(), tagetLocation, StandardCopyOption.REPLACE_EXISTING);
			return fileName;
		} catch (IOException e) {
			throw new RuntimeException("storeFile failed: " + fileName, e);
		}
	}

	// DOWNLOAD
	public Resource loadFileAsResource(String fileName) {
		try {
			// get path to the resource (file)
			Path filePath = this.fileStoragePath.resolve(fileName).normalize();
			// create a Resource object from the Path
			Resource resource;
			resource = new UrlResource(filePath.toUri());
			if (resource.exists()) {
				return resource;
			} else {
				throw new RuntimeException("file not found: " + fileName);
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException("file not found: " + fileName, e);
		}

	}

}
