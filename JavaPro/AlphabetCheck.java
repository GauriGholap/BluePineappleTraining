//Write a program to check wether character is an alphabet or not.
import java.util.Scanner;

class AlphabetCheck
{
	static boolean checkAlphabet(char c)
  	{
	    int n = (int)c;
      	System.out.println("N  is : "+n);

	   	if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {
	   		return true;
	   	}
	    
	    return false;
  	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
      	System.out.println("Enter any Character : ");
      	char c = in.next().charAt(0);

      	boolean ans = checkAlphabet(c);

      	if (ans) {
      		System.out.println("Character "+c+" is alphabet.");
      	}else{
      		System.out.println("Character "+c+" is not alphabet.");
      	}
	}
}

/*
Output :
\Training\JavaPro>Javac AlphabetCheck.java

\Training\JavaPro>Java AlphabetCheck
Enter any Character :
A
N  is : 65
Character A is alphabet.

\Training\JavaPro>Java AlphabetCheck
Enter any Character :
%
N  is : 37
Character % is not alphabet.
*/
