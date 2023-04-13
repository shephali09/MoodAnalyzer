package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerException extends Exception {

	public enum ExceptionType {
		NULL_MESSAGE, EMPTY_MESSAGE, NO_SUCH_FIELD, NO_SUCH_METHOD, NO_SUCH_CLASS, OBJECT_CREATION_ISSUE
	}

	public ExceptionType type;

	public MoodAnalyzerException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
