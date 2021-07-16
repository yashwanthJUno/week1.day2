package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test = "changeme";
		
		char[] charArray = test.toCharArray();
		//StringBuffer strappend = new StringBuffer();
		for(int i=0; i<charArray.length; i++)
		{
		     //char k = charArray[i];
			 if(i%2 !=0)
		      {
				 charArray[i] = Character.toUpperCase(charArray[i]);
		      }
			 else
			 {
				 charArray[i] = Character.toLowerCase(charArray[i]); 
			 }
			// strappend.append(charArray[i]);
			 System.out.print(charArray[i]);
		}
		//System.out.println(strappend.toString());
	}

}
