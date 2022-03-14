package com.mood.MoodAnalyzer1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoodAnalyzer {
	/**
	 * UC1
	 * This test case to check whether the user is happy.
	 * If happy then it will be true ,if sad then it will be false
	 */
	
	@Test
	public void testMoodAnalyzerSad() {
		MoodAnalyzer mood=new MoodAnalyzer("I am in sad mood");
		assertEquals("sad",mood.enalyzeEmotion() );
	    
	}
	@Test
	public void testMoodAnalyzerHappy() {
		MoodAnalyzer mood=new MoodAnalyzer("I am in any mood");
		assertEquals("happy",mood.enalyzeEmotion() );
	    
	}

}

