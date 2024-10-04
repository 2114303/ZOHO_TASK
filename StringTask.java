package com.zoho.task;
import java.util.*;
import java.util.regex.Pattern;
public class StringTask{
private String str;
	public static boolean stringIsEmpty(String givenString){
		return givenString.isEmpty();
		}
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
		return (str!=null)? str.length():0;
		}
	public char[] convertToArr(){
		return (str!=null)? str.toCharArray():new char[0];
		}
	public char penultimateChar(){
		return (str!=null&&str.length()>=2)? str.charAt(str.length()-2):'\0';
		}
	public int noOfOccurences(char character){
		if(str==null){
			return 0;
			}
		int noOfOcc=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==character)
				noOfOcc++;
				}
		return noOfOcc;
	}
	public int greatestPosition(char character){
		return (str!=null)? str.lastIndexOf(character):-1;
		}
	public String lastFewCharacters(int noOfChar){
		if(str==null||noOfChar<0){
			return "";
			}
		return (str.length() < noOfChar)? str : str.substring(str.length() - noOfChar);
	}
	public String firstFewCharacters(int noOfChar){
		if(str==null||noOfChar<0){
			return "";
			}
		return (str.length() >= noOfChar) ? str.substring(0, noOfChar) : str;
			}
	public String replacingChar(String replaced) {
		if(str == null||replaced == null||replaced.equals("")){
   			return null;
   			}
   		return (replaced.length()< str.length()) ? replaced + str.substring(replaced.length()) : replaced;
   		}		
	public boolean endWith(String ends){
		return (ends!=null&&str!=null)? (str.endsWith(ends)? true:false): false;
		}
	public boolean startWith(String starts){
		return (starts!=null&&str!=null)? (str.startsWith(starts)? true:false): false;
		}
	public String upperCase(){
		return (str != null) ? str.toUpperCase() : null;
		}
	public String lowerCase(){
		return (str != null) ? str.toLowerCase() : null;
		}
	public String reverse(){
		if(str==null||str.isEmpty()){
			return null;
			}
		char[] charArray = str.toCharArray();
        	int left = 0;
        	int right = charArray.length - 1;
        	while (left < right) {
            		char temp = charArray[left];
            		charArray[left] = charArray[right];
            		charArray[right] = temp;
            		left++;
            		right--;
            		}
            	return new String(charArray);
		 }
	public String removeSpaces(){
		return (str != null) ? str.replace(" ", "") : null;
		}
	public String[] convertToStringArr(String seperator){
		String regexSeperator=Pattern.quote(seperator);
		return (str != null&&seperator!=null)?  str.split(regexSeperator):new String[0];
		}
	public static boolean compareIncludeCase(String firstString,String secondString){
		return (firstString!=null&&secondString!=null)? firstString.equals(secondString) : false;
		}
	public static boolean compareExcludeCase(String firstString,String secondString){
		return (firstString != null && secondString != null)? firstString.equalsIgnoreCase(secondString) : false;
		}
	public String noSpacesBeginEnd(){
		return (str != null) ? str.trim() : null;
		}
	public static String mergingStrings(ArrayList<String> stringArray,String mergingChar){
		return (stringArray != null && !stringArray.isEmpty())? String.join(mergingChar, stringArray) : "";
	}
}
