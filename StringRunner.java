package com.zoho.runner;
import java.util.*;
import java.io.*;
import com.zoho.task.*;
public class StringRunner{
public static void main(String[] args){
	System.out.println("=========== String Tasks =============");
	System.out.print("1.Length of the String\n2.Convert String into char array\n3.Find penultimate character of a string\n4.No. of occurence of character\n5.Greatest position of a character\n6.Displaying last Few characters of a string\n7.Displaying first few characters of a string\n8.Replacing characters in a string\n9.check whether the string starts with the original string \n10.check whether the string ends with the original string\n11.UPPERCASE\n12.lowercase\n13.Reverse a string\n14.Multiple words in a single line\n15.Convert a string into string array using a seperator\n16.Comparing strings\n17.Removing extra spaces in the beginning and the end\n18.Merging strings with a character in between\n19.Exit\n");
boolean exit;
do{
	Scanner scanner = new Scanner(System.in);
	int selectOperation;
	String str="";
	boolean invalidIndex,emptyString;
	exit = true;
	do{	System.out.println();
		selectOperation=getValidIntegerInput(scanner,"Select an operation : ");
		if(0<selectOperation&&selectOperation<20){
			break;
			}
		System.out.println("Please select a valid number(1-18)");
	}while(true);
	scanner.nextLine();
	switch(selectOperation){
	case 1:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	System.out.println("Length of the entered String : " + word.getLength());
	break;
	}
	case 2:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	System.out.println("Converting String into char Array : "+ Arrays.toString(word.convertToArr()));
	break;
	}
	case 3:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	if(word.penultimateChar()=='\0'){
		System.out.println("Penultimate character does not exist");
		}
	else{
		System.out.println("Penultimate character of the entered string : " + word.penultimateChar());
	}
	break;
	}
	case 4:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	System.out.print("Enter a char to check its no. of occurrences : ");
	char character1 = scanner.next().charAt(0);
	System.out.println("No of occurence of the entered character :"+ word.noOfOccurences(character1));
	break;
	}
	case 5:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	System.out.print("Enter a char to find its greatest position : ");
	char character2 = scanner.next().charAt(0);
	if(word.greatestPosition(character2)==-1){
		System.out.println("The entered character is not present in the string");
		}
	else{
		System.out.println("Greatest position of the entered character :"+ word.greatestPosition(character2));
	}
	break;
	}
	case 6:{
	System.out.println("---------- Displaying last few characters ----------");
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	do{	
		int noOfLastFewChar = getValidIntegerInput(scanner,"Enter the No. of characters to be displayed :");
		String lastFewChar = word.lastFewCharacters(noOfLastFewChar);
		if(lastFewChar.equals("")){
			System.out.println("Invalid index number");
			}
		else if(lastFewChar.length()>noOfLastFewChar){
			System.out.println("Number exceeds the length of the string. Please try again.");
		}
		else{
			System.out.println("Last " + noOfLastFewChar+" characters of the given string : "+ lastFewChar);
			break;
		}
	}while(true);
	break;
	}
	case 7:{
	System.out.println("---------- Displaying first few characters ----------");
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	do{
		int noOfFirstFewChar= getValidIntegerInput(scanner,"Enter the No. of characters to be displayed :");
		String firstFewChar = word.firstFewCharacters(noOfFirstFewChar);
		if(firstFewChar.equals("")){
			System.out.println("Invalid index number");
		}else if(firstFewChar.length()>noOfFirstFewChar){
			System.out.println("Number exceeds the length of the string. Please try again.");
		}else{
			System.out.println("First "+noOfFirstFewChar+" characters of the given string :"+ firstFewChar);
			break;
		}
	}while(true);
	break;
	}
	case 8:{
	System.out.println("---------- Replacing Strings !! ----------");
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);	
	String replace = getValidInputString(scanner,"Enter the string to replace characters at the beginning :");
	System.out.println("ModifiedString : "+ word.replacingChar(replace));
	break;
	}
	case 9:{
	System.out.println("===== Checking if the string starts with the original string =====");
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	String enteredString = getValidInputString(scanner,"Enter a String to check : ");
	System.out.println("Entered string starts with the original string - "+ word.startWith(enteredString));
	break;
		}
	case 10:{
	System.out.println("===== Checking if the string ends with the original string =====");
	str = getValidInputString(scanner,"Enter original String : ");
	StringTask word = new StringTask(str);
	String enteredString = getValidInputString(scanner,"Enter a String to check : ");
	System.out.println("Entered string ends with the original string"+ word.endWith(enteredString));
	break;
	}
	case 11:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	System.out.println("UPPERCASE : "+ word.upperCase());
	break;
	}
	case 12:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	System.out.println("lowercase : "+ word.lowerCase());
	break;
	}
	case 13:{
	str = getValidInputString(scanner,"Enter a String : ");
	StringTask word = new StringTask(str);
	System.out.println("Reversed String : "+ word.reverse());
	break;
	}
	case 14:{
	String multiString;
	multiString = getValidInputString(scanner,"Enter a string with spaces : ");
	StringTask multiwords = new StringTask(multiString);
	System.out.println("strings with spaces in a single line after removing spaces : "+ multiwords.removeSpaces());
	break;
	}
	case 15:{
	System.out.println("===Converting string into string array using a seperator===");
	String multiString;
	multiString = getValidInputString(scanner,"Enter a String : ");
	StringTask removeSpace = new StringTask(multiString);
	String seperator = getValidInputString(scanner,"Enter seperator : ");
	System.out.println("spaced strings to String arr : "+ Arrays.toString(removeSpace.convertToStringArr(seperator)));
	break;
	}
	case 16:{
	System.out.println("Comparing two strings whether it is equal or not");
	String mainString,compareString;
	mainString = getValidInputString(scanner,"Enter String 1 : ");
	compareString = getValidInputString(scanner,"Enter String 2 : ");
	System.out.println("String1 is equal to String2 (case sensitive) - "+ StringTask.compareIncludeCase(mainString,compareString));
	System.out.println("String1 is equal to String2 (ignore case) - "+ StringTask.compareExcludeCase(mainString,compareString));
	break;
	}
	case 17:{
	System.out.println("====== Removing extra spaces in the beginning and end ======");
	String stringWithSpace = getValidInputString(scanner,"Enter a string which has spaces in the beginning and ending :");
	StringTask spacedString = new StringTask(stringWithSpace);
	System.out.println("String after removing extra spaces :" + spacedString.noSpacesBeginEnd());
	break;
	}
	case 18:{
	System.out.println("===Write multiple strings to merge them in a single line seperated by a character===");
	ArrayList<String> multipleStrings = new ArrayList<String>();
	int n=1;
	while(true){
	 	System.out.print("String "+n+ " : ");
	 	String toMerge= scanner.nextLine();
	 	n++;
	 	if (toMerge.isEmpty()){
	 		break;
	 		}
	 	multipleStrings.add(toMerge);
	 	}
	String mergingChar = getValidInputString(scanner,"Enter the character : ");
	System.out.println("Merged Strings with a character inbetween : "+ StringTask.mergingStrings(multipleStrings,mergingChar));
	break;
	}
	case 19:{
		exit = false;
		break;
	}
	}
	}while(exit);
}
public static String getValidInputString(Scanner scanner,String prompt){
	String str;
	boolean emptyString;
	do{	
		System.out.print(prompt);
		str = scanner.nextLine();
		emptyString = str.isEmpty();
		if(emptyString){
			System.out.println("Input cannot be empty");
			}
	}while(emptyString);
	return str;
	}
public static int getValidIntegerInput(Scanner scanner, String prompt) {
    int input = 0;
    boolean validInput = false;
    while (!validInput) {
        System.out.print(prompt);
        try {
            input = scanner.nextInt();  
            validInput = true;          
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); 
    }
	}
	return input;
}
}	
