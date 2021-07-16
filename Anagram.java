package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "potss"; 
		
		if(text1.length()==text2.length())
		{
			System.out.println("Both Anagram are Same");
		}
		else
		{
			System.out.println("Anagram are Not Same");
		}
		
		char[] str1 = text1.toCharArray();
		char[] str2 = text2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(Arrays.equals(str1,str2)==true)
		{
			System.out.println("Both the strings are anagram");  
		}
		
		else
		{
			System.out.println("Both the strings are not anagram"); 	
		}
	}

}
