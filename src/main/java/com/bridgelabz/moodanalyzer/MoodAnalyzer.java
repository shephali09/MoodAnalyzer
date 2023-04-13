package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {
		this.message = "";
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analysisMood() {
		if (message.contains("Sad") || message.contains("SAD")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}
}
