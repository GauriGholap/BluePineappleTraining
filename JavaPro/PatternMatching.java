//Write a program to find given input string contain an input pattern.
/*
1	[abc]	a, b, or c (simple class)
2	[^abc]	Any character except a, b, or c (negation)
3	[a-zA-Z]	a through z or A through Z, inclusive (range)
4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	d, e, or f (intersection)
6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
*/
import java.util.regex.*;
import java.util.Scanner;

public class PatternMatching
{  
	public static void main(String args[])
	{    
		Scanner in = new Scanner(System.in);

	    System.out.print("\n Enter any String : ");
	    String str = in.nextLine();

	    System.out.print("\n Enter any Pattern : ");
	    String patt = in.nextLine();
		 
		Pattern p = Pattern.compile(patt, Pattern.CASE_INSENSITIVE);		//. represents single character 
		Matcher m = p.matcher(str);  
		boolean b = m.find();  

		System.out.println(b);
		if (b) {
		  	System.out.println("Pattern matches Successfully..");
		  }else{
		  	System.out.println("Sorry..! Pattern is not match");
		  }  
		// //2nd way  
		// boolean b2=Pattern.compile(".s").matcher("as").matches();  
		  
		// //3rd way  
		//  boolean b = Pattern.matches(patt, str); 	  
	}
}  
/*Output :
\Training\JavaPro>Javac PatternMatching.java

\Training\JavaPro>Java PatternMatching

 Enter any String : abcpaqe

 Enter any Pattern : a?c
true
Pattern matches Successfully..

\Training\JavaPro>Java PatternMatching

 Enter any String : 1224abcpawejh

 Enter any Pattern : a*
true
Pattern matches Successfully..
*/
