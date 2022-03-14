package com.mood.MoodAnalyzer1;


public class MoodAnalyzer {

String message;
 public MoodAnalyzer() {
	 super();
 }
 public MoodAnalyzer(String message) {
	 super();
	 this.message=message;
 }
	
	public String enalyzeEmotion() {
		
		if(message.contains("I am in sad mood")) {
			return "sad";
		}
		
		else if(message.contains("I am in any mood")) {
			return "happy";
			
		}
		return null;
	}
	

}
