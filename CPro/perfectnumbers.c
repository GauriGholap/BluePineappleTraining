//Write a program to print all perfect numbers between 1 to n.

#include <stdio.h>

void perfectNumber(int n, int m)
{
	int i, j, sum;
	for(i = n; i <= m; i++)
    {
        sum = 0;
        
        for(j = 1; j < i; j++)
        {
            if(i % j == 0)
            {
                sum += j;
            }
        }
 
        if(sum == i)
        {
            printf("\t %d, ", i);
        }
    }
    printf(".");
}

int main()
{
    int low, up;
	
	printf("Enter lower limit : ");
    scanf("%d", &low);

    printf("Enter upper limit : ");
    scanf("%d", &up);

    printf("All Perfect numbers between %d to %d:\n", low, up);
    perfectNumber(low, up);

    return 0;
}

/*
 ----------------- Output 1 ------------------
Enter lower limit : 1
Enter upper limit : 500
All Perfect numbers between 1 to 500:
         6,      28,     496, . 
 ---------------------------------------------
*/
