package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void testHappyMood() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Any Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("HAPPY", mood);
	}

	@Test
	public void testSadMood() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		String mood = moodAnalyser.analysisMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void testNullMood() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		String mood = moodAnalyser.analysisMood();
		assertEquals("HAPPY", mood);
	}
}
