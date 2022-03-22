package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import app.core.services.AppService;

@RestController
public class AppController {

	@Autowired
	private AppService appService;

}
