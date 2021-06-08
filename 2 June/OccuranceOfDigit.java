import java.util.Scanner;
 
class OccuranceOfDigit
{
 
  static int countOccurrances(String str, int d)
  {
      int count = 0;
   
      for (char c : str.toCharArray())
      {   
          int n = Character.getNumericValue(c);
          count = (n == d) ? count + 1 : count;
      }
   
      return count;
  }
   
  public static void main(String args[])
  {
      
      Scanner in = new Scanner(System.in);
      System.out.print("\n Enter any number : ");
      String num = in.nextLine();

      for (int i = 0; i < 10; i++) 
        System.out.println("Occurance Of Digit "+(i)+" is "+countOccurrances(num, i));
  }
}
 /*
Output :
C:\Users\INTEL\Desktop\Documents\New folder>Javac OccuranceOfDigit.java

C:\Users\INTEL\Desktop\Documents\New folder>Java OccuranceOfDigit

 Enter any number : 98654321234567898765432
Occurance Of Digit 0 is 0
Occurance Of Digit 1 is 1
Occurance Of Digit 2 is 3
Occurance Of Digit 3 is 3
Occurance Of Digit 4 is 3
Occurance Of Digit 5 is 3
Occurance Of Digit 6 is 3
Occurance Of Digit 7 is 2
Occurance Of Digit 8 is 3
Occurance Of Digit 9 is 2

C:\Users\INTEL\Desktop\Documents\New folder>Java OccuranceOfDigit

 Enter any number : 345734567890987654356789087654356789087654325678909876543987
654
Occurance Of Digit 0 is 4
Occurance Of Digit 1 is 0
Occurance Of Digit 2 is 1
Occurance Of Digit 3 is 6
Occurance Of Digit 4 is 7
Occurance Of Digit 5 is 10
Occurance Of Digit 6 is 9
Occurance Of Digit 7 is 10
Occurance Of Digit 8 is 9
Occurance Of Digit 9 is 7

 */