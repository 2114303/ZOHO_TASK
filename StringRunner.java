package com.zoho.runner;
import java.util.*;
import java.io.*;
import com.zoho.task.*;
public class StringRunner{
public static void main(String[] args){
	Console input= System.console();
	String str = input.readLine("Enter a string : ");
	StringTask word = new StringTask(str);
	System.out.println("Length of the entered String : " + word.getLength());
	System.out.println("Converting String into char Array : "+ Arrays.toString(word.convertToArr()));
	if(word.penultimateChar()=='\0'){
		System.out.println("Penultimate character does not exist");
		}
	else{
		System.out.println("Penultimate character of the entered string : " + word.penultimateChar());
	}
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a char to check its no. of occurrences : ");
	char character1 = scanner.next().charAt(0);
	System.out.println("No of occurence of the entered character :"+ word.noOfOccurences(character1));
	System.out.print("Enter a char to find its greatest position : ");
	char character2 = scanner.next().charAt(0);
	if(word.greatestPosition(character2)==-1){
		System.out.println("The entered character is not present in the string");
		}
	else{
		System.out.println("Greatest position of the entered character :"+ word.greatestPosition(character2));
	}
	System.out.println("Last five characters of the given string : "+ word.lastFiveChar());
	System.out.println("First three characters of the given string :"+ word.firstThreeChar());
	System.out.print("Enter a string to replace first three chatracters :");
	String replace = scanner.next();
	if(word.replace(replace)==null){
		System.out.println("The string is shorter than three characters, so it is not possible to replace the first three letters.");
		}
	else{
	System.out.println("Modified String :" + word.replace(replace));
	}
	System.out.print("Enter the String to check whether it ends with :");
	String endString = scanner.next();
	System.out.println(word.endWith(endString));
	System.out.print("Enter the String to check whether it starts with :");
	String startString = scanner.next();
	System.out.println(word.startWith(startString));
	System.out.println("UPPERCASE : "+ word.upperCase());
	System.out.println("lowercase : "+ word.lowerCase());
	System.out.println("Reversed String : "+ word.reverse());
	System.out.print("Enter multiple strings in a single line:");
	scanner.nextLine();
	String multiString = scanner.nextLine();
	System.out.println("Multiple strings entered in a line : "+ multiString);
	StringTask multiwords = new StringTask(multiString);
	System.out.println("Multiple strings in a single line after removing spaces : "+multiwords.removeSpaces());
	System.out.println("spaced strings to String arr : "+ Arrays.toString(multiwords.convertToStringArr()));
	System.out.println();
	System.out.println("Comparing two strings whether it is equal or not");
	System.out.print("Enter string1 :");
	String mainString = scanner.next();
	System.out.print("Enter string2 :");
	String compareString = scanner.next();
	System.out.println("String1 is equal to String2 (case sensitive) - "+ StringTask.compareIncludeCase(mainString,compareString));
	System.out.println("String1 is equal to String2 (ignore case) - "+ StringTask.compareExcludeCase(mainString,compareString));
	scanner.nextLine();
	System.out.print("Enter a string which has spaces in the beginning and ending :");
	String stringWithSpace = scanner.nextLine();
	StringTask spacedString = new StringTask(stringWithSpace);
	System.out.println("String after removing extra spaces :" + spacedString.noSpacesBeginEnd());
	System.out.println();
	System.out.println("Write mulitple strings to merge them in a single line seperated by (-)");
	ArrayList<String> multipleStrings = new ArrayList<String>();
	int n=1;
	while(true){
	 	System.out.print("String "+n+ " : ");
	 	String toMerge= scanner.nextLine();
	 	n++;
	 	if (toMerge.isEmpty()){
	 		break;}
	 	multipleStrings.add(toMerge);
	 	}
	System.out.println("Merged Strings with a - inbetween :"+ StringTask.mergingStrings(multipleStrings));
	}
	}
