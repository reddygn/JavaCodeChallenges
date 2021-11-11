package com.naveen.JavaCodeChallenges.service;

import java.io.FileReader;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class ReadTextFileService {

	public StringBuilder readFile() {

		StringBuilder stringBuilder = new StringBuilder();
		Scanner scanner;

		try {

			scanner = new Scanner(new FileReader("src/main/resources/input.txt"));

			while (scanner.hasNextLine()) {

				stringBuilder.append(scanner.nextLine());
			}

			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(stringBuilder.toString());

		return stringBuilder;
	}

}
