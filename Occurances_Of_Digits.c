//Find total occurances of digits (0-9) without using function.

#include <stdio.h>

int main()
{
    long long number, n;
    int i, lastDigit;
    int digit[10];

    printf("Enter any number: ");
    scanf("%lld", &number);

    for(i=0; i<10; i++)
    {
        digit[i] = 0;
    }

    n = number; 

    while(n != 0)
    {
        lastDigit = n % 10;

        n /= 10;

        digit[lastDigit]++;
    }

    printf("Occurance of each digit in %lld is: \n", number);
    for(i=0; i<10; i++)
    {
        printf("Occurance of %d = %d\n", i, digit[i]);
    }
	getch();
    return 0;
}

/*
 ----------------- Output 1 ------------------
Enter any number: 8473285456943876762765235436
Frequency of each digit in 468899012701721836 is:
Frequency of 0 = 2
Frequency of 1 = 3
Frequency of 2 = 2
Frequency of 3 = 1
Frequency of 4 = 1
Frequency of 5 = 0
Frequency of 6 = 2
Frequency of 7 = 2
Frequency of 8 = 3
Frequency of 9 = 2

 ----------------- Output 2 ------------------ 
Enter any number: 1234567890987654321
Occurance of each digit in 1234567890987654321 is:
Occurance of 0 = 1
Occurance of 1 = 2
Occurance of 2 = 2
Occurance of 3 = 2
Occurance of 4 = 2
Occurance of 5 = 2
Occurance of 6 = 2
Occurance of 7 = 2
Occurance of 8 = 2
Occurance of 9 = 2

 ---------------------------------------------
*/
