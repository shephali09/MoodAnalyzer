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
		try {
			if (message.contains("Sad") || message.contains("SAD")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}