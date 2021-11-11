package com.naveen.JavaCodeChallenges.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.JavaCodeChallenges.service.ReadTextFileService;

/*
 * API to read a text file 
 */

@RestController
@RequestMapping("/read")
public class ReadTextFileController {

	@Autowired
	ReadTextFileService readTextFileService;

	@GetMapping()
	public StringBuilder readFile() {
		return readTextFileService.readFile();
	}

}
