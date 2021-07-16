package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String palin1 = "madam";
		String palin2 = "";
        
		int stringLength = 5;
		
		for(int i=(stringLength-1); i>=0; --i)
		{
		   palin2=palin2 + palin1.charAt(i);
		}
		 if(palin1.equals(palin2))
		 {
			 System.out.println(palin1 + " it's a Palindrome");
		 }
		 else
		 {
			 System.out.println(palin1 + " Not a Palindrome"); 
		 }
	}

}
