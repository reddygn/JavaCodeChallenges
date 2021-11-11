package com.naveen.JavaCodeChallenges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.JavaCodeChallenges.service.ReadTextFileService;

@RestController
public class ReadTextFileController {

	@Autowired
	ReadTextFileService readTextFileService;

	@GetMapping("/read")
	public StringBuilder readFile() {
		return readTextFileService.readFile();
	}

}
