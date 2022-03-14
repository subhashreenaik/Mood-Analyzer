package com.mood.MoodAnalyzer1;


public class MoodAnalyzer {

String message;

 public MoodAnalyzer() {
	 super();
 }
 /*
  * Parameterized constructor
  */
 public MoodAnalyzer(String message) {
	 super();
	 this.message=message;
 }
	/*
	 * This method is used to check the mood sad ,happy.
	 * If mood is null then it will throw null pointer exception
	 */
	public String enalyzeEmotion() {
		try {
		if(message.contains("I am in sad mood")) {
			return "sad";
		}
		
		else if(message.contains("I am in any mood")) {
			return "happy";
			
		}
		return null;
	}
		
		catch(NullPointerException e) {
			return "Invalid mood";
		}
	
	
	}
}
