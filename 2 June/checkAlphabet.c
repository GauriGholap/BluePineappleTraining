//Write a program to check whether character is an alphabet or not.

#include<stdio.h>
int main()
{
 	char c;
 	int n;
 	
 	printf("\n Enter any character : ");
 	scanf("%c",&c);
 	n = c;
 	
 	if((n >= 65 && n <= 90) || (n >= 97 && n <= 122))
 		printf("\n Character is an alphabet.");
 	else
 		printf("\n Character is not an alphabet.");
	 	  
 	printf("\n Integer values : %d",n);
 	
 	getch();
 	return 0;
}
/*
----------------- Output 1 ------------------
 Enter any character : A

 Character is an alphabet.
 Integer values : 65
 
 ----------------- Output 2 ------------------ 
 Enter any character : $

 Character is not an alphabet.
 Integer values : 36
 ----------------- Output 3 ------------------ 
 Enter any character : z

 Character is an alphabet.
 Integer values : 122
 ---------------------------------------------
*/
