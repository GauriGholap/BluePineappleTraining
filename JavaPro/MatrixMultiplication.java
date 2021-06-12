//Write a program for 2D Matrix Multiplication
import java.util.Scanner;
 
class MatrixMultiplication
{     
  public static void main(String args[])
  {     
    static Scanner in = new Scanner(System.in);   
    int r1,c1,r2,c2;
      
    System.out.println("For Matrix 1 ");
    System.out.println("Row and Column size : ");
    r1 = in.nextInt();
    c1 = in.nextInt();

    int[][] m1 = new int[r1][c1];

    System.out.println("Enter Elements : ");
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        int no = in.nextInt();
        m1[i][j] = no;
      }        
    }
    System.out.println("Matrix 1");
    for (int i = 0; i < r1; i++) {
      System.out.print("\n");
      for (int j = 0; j < c1; j++) {
        int no = m1[i][j];
        System.out.print("\t "+no);
      }        
    }
    
    System.out.println("For Matrix 2 ");
    System.out.println("Row and Column size : ");
    r2 = in.nextInt();
    c2 = in.nextInt();    
    int[][] m2 = new int[r2][c2]; 

    System.out.println("Enter Elements : ");
    for (int i = 0; i < r2; i++) {
      for (int j = 0; j < c2; j++) {
        int no = in.nextInt();
        m2[i][j] = no;
      }        
    }
    System.out.println("Matrix 2");
    for (int i = 0; i < r2; i++) {
      System.out.print("\n");
      for (int j = 0; j < c2; j++) {
        int no = m2[i][j];
        System.out.print("\t "+no);
      }        
    }
    
    System.out.println("Matrix Multiplication ");
     // matrixMul(m1,m2,result);
  }
}