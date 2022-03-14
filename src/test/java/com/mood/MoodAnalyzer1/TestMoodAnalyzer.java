package com.mood.MoodAnalyzer1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoodAnalyzer {
	/**
	 * 
	 * This test case to check whether the user is happy.
	 * If happy then it will be true ,if sad then it will be false
	 * @throws MoodAnalyzerException 
	 */
	
	@Test
	public void testMoodAnalyzerSad() throws MoodAnalyzerException {
		
		MoodAnalyzer mood=new MoodAnalyzer("I am in sad mood");
		assertEquals("sad",mood.enalyzeEmotion() );
	  
}
	@Test
	public void testMoodAnalyzerHappy() throws MoodAnalyzerException {
		
		MoodAnalyzer mood=new MoodAnalyzer("I am in any mood");
		assertEquals("happy",mood.enalyzeEmotion() );
	    
	
		
	}
	/*
	 * UC3 Inform user if enter invalid mood
	 */
	@Test
	public void testMoodAnalyzerNull() throws MoodAnalyzerException {
		try {
		MoodAnalyzer mood=new MoodAnalyzer(null);
		assertEquals("Invalid mood",mood.enalyzeEmotion() );
	    
	}
		catch(MoodAnalyzerException e) {
			System.out.println("empty mood");
		}
	}

}

