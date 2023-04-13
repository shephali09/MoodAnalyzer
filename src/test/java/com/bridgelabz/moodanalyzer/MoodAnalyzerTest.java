package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void testHappyMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = "I am in Happy Mood";
		String mood = moodAnalyzer.analysisMood(message);
		assertEquals("Happy", mood);
	}

	@Test
	public void testSadMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = "I am in Sad Mood";
		String mood = moodAnalyzer.analysisMood(message);
		assertEquals("Sad", mood);
	}

}
