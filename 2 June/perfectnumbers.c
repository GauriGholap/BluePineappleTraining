//Write a program to print all perfect numbers between 1 to n.

#include <stdio.h>

int main()
{
    int i, j, n, sum;

    printf("Enter upper limit : ");
    scanf("%d", &n);

    printf("All Perfect numbers between 1 to %d:\n", n);
    
    for(i=1; i<=n; i++)
    {
        sum = 0;
        
        for(j=1; j<i; j++)
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
	getch();
    return 0;
}

/*
 ----------------- Output 1 ------------------
Enter upper limit : 100000
All Perfect numbers between 1 to 100000:
         6,      28,     496,    8128, .
 
 ---------------------------------------------
*/
