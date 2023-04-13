package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	public String analysisMood(String message) {
		if (message.contains("happy") || message.contains("Happy")) {
			return "Happy";
		} else {
			return "Sad";
		}
	}
}
