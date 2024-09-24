package com.zoho.task;
import java.util.*;
public class StringTask{
private String str;
	public StringTask(String str){
		this.str=str;
	}
	public void setStr(String str){
		this.str=str;
		}
	public String getStr(){
		return str; 
		}
	public int getLength(){
		return str.length();
		}
	public char[] convertToArr(){
		return str.toCharArray();
		}
	public char penultimateChar(){
		try{
		if(str==null||str.length()<2){
			throw new IllegalArgumentException("String is too short to find the penultimate character.");
			}
		return str.charAt(str.length()-2);
		}
		
		catch(IllegalArgumentException e){
			return '\0';}
			}
	public int noOfOccurences(char character){
		int noOfOcc=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==character)
				noOfOcc++;
				}
		return noOfOcc;
	}
	public int greatestPosition(char character){
		int greatPos = str.lastIndexOf(character);
		return greatPos;
		}
	public String lastFiveChar(){
		if(str.length()<5){
		return str;
		}
		String last_5 = str.substring(str.length() - 5);
		return last_5;	
	}
	public String firstThreeChar(){
		if(str.length()>=3){
			String first_3 = str.substring(0,3);
			return first_3;
		}
		else
			return str;
			}
	public String replace(String replaced) {
    
   	 if (str.length() < 3) {
        	return null;
    }
    	if (replaced.length() > 3) {
        	if (str.length() == 3) {
            	return replaced.substring(0, 3);
        } 	else {
            		return replaced.substring(0, 3) + str.substring(3);
        }
    }
    return replaced + str.substring(replaced.length());


    }
			
	public boolean endWith(String ends){
		return str.endsWith(ends);
		}
	public boolean startWith(String ends){
		return str.startsWith(ends,0);
		}
	public String upperCase(){
		return str.toUpperCase();
		}
	public String lowerCase(){
		return str.toLowerCase();
		}
	public String reverse(){
		String reversedString="";
		for(int i=str.length()-1;i>=0;i--)
			reversedString += str.charAt(i);
		 return reversedString;
		 }
	public String removeSpaces(){
		return str.replace(" ","");
		}
	public String[] convertToStringArr(){
		return str.split(" ");}
	public static boolean compareIncludeCase(String firstString,String SecondString){
		return firstString.equals(SecondString);
		}
	public static boolean compareExcludeCase(String firstString,String SecondString){
		return firstString.equalsIgnoreCase(SecondString);
		}
	public String noSpacesBeginEnd(){
		return str.trim();
		}
	public static String mergingStrings(ArrayList<String> stringArray){
		String mergedArray = String.join("-",stringArray); 	
		return mergedArray;
	}
		

}
