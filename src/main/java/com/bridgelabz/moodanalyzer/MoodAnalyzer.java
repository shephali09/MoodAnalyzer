package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer  {

	private String message;

	public MoodAnalyzer() {
		this.message = "";
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analysisMood() throws MoodAnalyzerException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY_MESSAGE,
						"Mood should not be empty");
			}
			if (message.contains("Sad") || message.contains("SAD")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL_MESSAGE,
					"Mood should not be null");
		}
	}
}