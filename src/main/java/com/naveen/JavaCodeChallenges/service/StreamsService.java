package com.naveen.JavaCodeChallenges.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StreamsService {

	public List<List<Integer>> getListOfFilteredOddAndEvenNumbers() {

		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> evenNumbers = new ArrayList<Integer>();
		List<Integer> oddNumbers = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {

			numbers.add(i);
		}
		numbers.stream().forEach(e -> {
			if (e % 2 == 0) {
				evenNumbers.add(e);
			} else {
				oddNumbers.add(e);
			}
		});

		List<List<Integer>> filteredList = new ArrayList<List<Integer>>();

		filteredList.add(oddNumbers);
		filteredList.add(evenNumbers);

		return filteredList;
	}

}
