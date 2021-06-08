//Write a program to check the number of digits in a given integer.

#include<stdio.h>
#include<string.h>

int main()
{
 	char s[30];
 	int n;
 	
 	printf("\n Enter any Integer Number : ");
 	scanf("%s",&s);
 	
 	n = strlen(s);
 	
 	printf("\n Number of Digits : %d",n);
 	
 	getch();
 	return 0;
}
/*
 ----------------- Output 1 ------------------

 Enter any Integer Number : 12345

 Number of Digits : 5
 
 ----------------- Output 2 ------------------ 
 
 Enter any Integer Number : 123456789067894

 Number of Digits : 15
 
 ---------------------------------------------
*/
