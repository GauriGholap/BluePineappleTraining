//Write a program to check wether given string is Palindrome String or not.
import java.util.Scanner;

class PalindromeString
{
	static int isPalindrome(String str)
	{
		int len = str.length();
		String revStr = "";

		for (int i = (len - 1); i >= 0; --i) {			//for reverse string
			revStr = revStr + str.charAt(i);			
		}

		if (str.toLowerCase().equals(revStr.toLowerCase())) {
			return 1;
		}else
			return 0;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter any String : ");
		String str  = in.nextLine();

		int ans = isPalindrome(str);
		if(ans == 1)
			System.out.println("String is Palindrome.");
		else
			System.out.println("String is not Palindrome");
	}
}

/*
Output :
\JavaPro>javac PalindromeString.java

\JavaPro>java PalindromeString
Enter any String :
abba
String is Palindrome.

\JavaPro>java PalindromeString
Enter any String :
Madam
String is Palindrome.

\JavaPro>java PalindromeString
Enter any String :
good
String is not Palindrome
*/