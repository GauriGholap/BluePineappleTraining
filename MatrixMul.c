#include<stdio.h>
float m1[10][10], m2[10][10], Result[10][10];
int r1, c1, r2, c2, r, c;

void acceptMatrix(int r, int c, float m[10][10])
{
    int i,j;
	for(i=0; i<r; i++){
		for(j=0; j<c; j++){
             scanf("%f",&m[i][j]);
		}
	}
}

void displayMatrix(int r, int c, float m[10][10])
{
    int i,j; 	 
	for(i=0; i<r; i++){
		printf("\n");	
		for(j=0; j<c; j++){
             printf("\t %0.1f",m[i][j]);
        }
    }
}

void matrixMul(int r, int c, float m1[10][10], float m2[10][10], float Result[10][10])
{
    int i, j, k; 	 
	for(i=0; i<r; i++)
	{			
 		for(j=0; j<c; j++)
		{
		    Result[i][j]=0;
		    for(k=0; k<c; k++)
	        {
				Result[i][j] = Result[i][j] + (m1[i][k] * m2[k][j]);
		    }
		}
	}
	displayMatrix(r, c, Result);
} 

int main()
{
 	printf("\n For Matrix 1 : ");
 	printf("\n Enter value row and cloumn : ");
 	scanf("%d%d",&r1,&c1);
 	acceptMatrix(r1,c1,m1);
 	displayMatrix(r1,c1,m1);
 	
 	printf("\n For Matrix 2 : ");
 	printf("\n Enter value row and cloumn : ");
 	scanf("%d%d",&r2,&c2);
 	acceptMatrix(r2,c2,m2);
 	displayMatrix(r2,c2,m2);
 	
 	printf("\n Matrix Multiplication : ");
 	if(r1 == c2 && c1 == r2)
 	{
	 	  r = r1;
	 	  c = c2;
 		  matrixMul(r, c, m1, m2, Result);
    }else
          printf("\n Sorry! Matrix Multiplication not possible as you enter invalid Matrix. "); 
 	
 	getch();
 	return 0;
}
/*
********************** Output 1************************

 For Matrix 1 :
 Enter value row and cloumn : 2 3
1
1 1
1 1 1

         1.0     1.0     1.0
         1.0     1.0     1.0
 For Matrix 2 :
 Enter value row and cloumn : 3 2
1 1
1 1
1 1

         1.0     1.0
         1.0     1.0
         1.0     1.0
 Matrix Multiplication :
         2.0     2.0
         2.0     2.0
         
********************** Output 2 ***********************
 For Matrix 1 :
 Enter value row and cloumn : 3 2
2 2
1 1
1 1

         2.0     2.0
         1.0     1.0
         1.0     1.0
 For Matrix 2 :
 Enter value row and cloumn : 3 2
2 1
1 1
1 1

         2.0     1.0
         1.0     1.0
         1.0     1.0
 Matrix Multiplication :
 Sorry! Matrix Multiplication not possible as you enter invalid Matrix.
*/
