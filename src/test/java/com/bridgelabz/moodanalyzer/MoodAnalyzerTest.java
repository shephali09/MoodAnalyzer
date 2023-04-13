package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		try {
			String mood = moodAnalyser.analysisMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Any Mood");
		try {
			String mood = moodAnalyser.analysisMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		try {
			moodAnalyser.analysisMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL_MESSAGE, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisException() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
		try {
			moodAnalyser.analysisMood();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY_MESSAGE, e.type);
			System.out.println(e.getMessage());
		}
	}

}
