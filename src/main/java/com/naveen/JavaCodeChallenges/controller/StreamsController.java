package com.naveen.JavaCodeChallenges.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.JavaCodeChallenges.service.StreamsService;

@RestController
@RequestMapping("/numbers")
public class StreamsController {

	@Autowired
	StreamsService streamsService;

	@GetMapping("/filter")
	public List<List<Integer>> getListOfFilteredOddAndEvenNumbers() {

		return streamsService.getListOfFilteredOddAndEvenNumbers();
	}

}
