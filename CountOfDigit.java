import java.util.Scanner;
 
class CountOfDigit
{
 
  static int countDigits(String str)
  {
      int count = 0;
   
      for (char c : str.toCharArray())
          count++;
   
      return count;
  }
   
  public static void main(String args[])
  {
      
      Scanner in = new Scanner(System.in);
      System.out.print("\n Enter any number : ");
      String num = in.nextLine();

      System.out.println("Count Of Digit is "+countDigits(num));
  }
}
/*
Output 
C:\Users\INTEL\Desktop\Documents\Training\JavaPro>Javac CountOfDigit.java

C:\Users\INTEL\Desktop\Documents\Training\JavaPro>Java CountOfDigit

 Enter any number : 123456789765435678654345678765432124567876543
Count Of Digit is 45

*/