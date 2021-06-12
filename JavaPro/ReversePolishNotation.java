//Write a program to Reverse Polish Notataion.

import java.util.Stack;
import java.util.Scanner;

class Solution {

	boolean isNumaric(String s)
	{
		int no;
		if (s == null || s.equals("")) {
			return false;
		}
		try {			
			no = Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}

	public int stacky(String[] tokens)
	{
		// Intialize the stack and the variable
		Stack<String> stack = new Stack<String>();
		int x, y;
		String result = "";
		int get = 0;
		String choice;
		int value = 0;
		String p = "";

		// Iterating to the each character in the array of the string
		for (int i = 0; i < tokens.length; i++) 
		{
			// If the character is not the special character ('+', '-' ,'*' , '/') then push the character to the stack
			if (isNumaric(tokens[i])) {
				stack.push(tokens[i]);
				continue;
			}
			else {
				// else if the character is the special	character then use the switch method to perform the action
				choice = tokens[i];
			}

			// Switch-Case
			switch (choice) 
			{
				case "+":
					// Performing the "+" operation by poping put the first two character and then again store back to the stack
					x = Integer.parseInt(stack.pop());
					y = Integer.parseInt(stack.pop());
					value = y + x;
					result = p + value;
					stack.push(result);
					break;

				case "-":
					// Performing the "-" operation by poping put the first two character and then again store back to the stack
					x = Integer.parseInt(stack.pop());
					y = Integer.parseInt(stack.pop());
					value = y - x;
					result = p + value;
					stack.push(result);
					break;

				case "*":
					// Performing the "*" operation by poping put the first two character and then again store back to the stack
					x = Integer.parseInt(stack.pop());
					y = Integer.parseInt(stack.pop());
					value = y * x;
					result = p + value;
					stack.push(result);
					break;

				case "/":
					// Performing the "/" operation by poping put the first two character and then again store back to the stack
					x = Integer.parseInt(stack.pop());
					y = Integer.parseInt(stack.pop());
					value = y / x;
					result = p + value;
					stack.push(result);
					break;

				default:
					continue;
			}
		}
		// Method to convert the String to integer
		return Integer.parseInt(stack.pop());
	}
}

class ReversePolishNotation 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	    System.out.print("\n Enter any Expression : ");
	    String exp = in.nextLine();

		String[] s = exp.split(" ");

		Solution str = new Solution();
		int result = str.stacky(s);
		System.out.println("Final Result : "+result);
	}
}

/*
Output :
\Training\JavaPro>Javac ReversePolishNotation.java

\Training\JavaPro>Java ReversePolishNotation

 Enter any Expression : 5 4 * 4 2 / +
Final Result : 22

\Training\JavaPro>Java ReversePolishNotation

 Enter any Expression : 6 2 / 3 +
Final Result : 6

\Training\JavaPro>Java ReversePolishNotation

 Enter any Expression : 5 2 + 8 3 - +
Final Result : 12

*/