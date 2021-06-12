//Write a program to convert Number to Words using both American and Indian number system .
import java.util.Scanner;
 
class NewNumToWord
{
  static String numToWord(String str)
  {
    String[] digits = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thireteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  
    String ans = "";
    if (str.length() == 1) {            // for single digit no
      int u = Character.getNumericValue(str.charAt(0)); 
      ans += digits[u];
    }else if (str.length() == 2) {          // for two digit no
      int t = Character.getNumericValue(str.charAt(0));
      int u = Character.getNumericValue(str.charAt(1)); 

      if (t == 0 && u == 0) {
        return "end";
      }
      if (t == 1){
        ans += digits[u+10];
      }else {
        ans += tens[t] +" " + digits[u];
      }  
    }else if (str.length() == 3) {          // for three digit no
      int h = Character.getNumericValue(str.charAt(0));
      int t = Character.getNumericValue(str.charAt(1));
      int u = Character.getNumericValue(str.charAt(2)); 

      if (h == 0 && (t == 0 && u == 0)) {
        return "Zero";
      }
      if (h == 0) {
        if (t == 1){
          ans = digits[h] + digits[u+10];
        }else {
          ans = digits[h] + tens[t] +" " + digits[u];
        }
      }else{
        if (t == 1){
          ans = digits[h] + " Hundred " + digits[u+10];
        }else {
          ans = digits[h] + " Hundred " + tens[t] +" " + digits[u];
        } 
      }      
    }
    
    return ans;
  }
  
  static void convertUsingAmericanNumberSystem(String str)
  {
    String[] units = {"Thousand", "Million", "Billion", "Trillion", "Quardrillion", "Quintillion", "Sextillion", "Septillion", "Octillion", "Nonillion", "Decillion", "Undeillion", "Duodecillion", " Tredecillion", "Quatturordecillion", "Quindecillion", "Sexdecillion", "Septendecillion", "Octodecillion", "Novemdecillion", "Vigintillion"};
    String numWord = "";
    int count = 0;
    int len = str.length();
    int i = 0;
    int d = len / 3;

    if (len <= 3) {
      numWord = numToWord(str);     
      System.out.println(numWord);
    }else 
    {
      if (len % 3 == 1) {
        String s = Character.toString(str.charAt(0));
        System.out.print(" " + numToWord(s) +" "+ units[--d]);
        i = 1;
      }
      if (len % 3 == 2) {
        String s = Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)); 
        String result = numToWord(s);
        if (result == "end"){
          System.out.print(" ");
          d--;
        }
        else
          System.out.print(" "+ numToWord(s) +" "+ units[--d]);
        i = 2;
      }  
      if (len % 3 == 0) 
        d = d - 1;
      while (i < len)
      { 
        String s = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i+1)) + Character.toString(str.charAt(i+2));
        if (d == 0) 
          System.out.print(" "+ numToWord(s) +" ");
        else{
          String result = numToWord(s);
          if (result == "Zero")
            System.out.print(" ");
          else
            System.out.print(" "+ result +" "+ units[--d]);
        }
        i = i+3;                
      }
    }  
  }  
  
  static void convertUsingIndianNumberSystem(String str)
  {
    String[] units = {"", "Thousand", "Lakh", "Crore", "Arab", "Kharv", "Neel", "Padam", "Shankh"};
    String numWord = "";
    int count = 0;
    int len = str.length();
    int i = 0;
    int d;

    if (len <= 3) {
      numWord = numToWord(str);      
      System.out.println(numWord);
    }else 
    {
      if(len % 2 == 0)
        d = ((len - 3)/2)+2;
      else        
        d = ((len - 3)/2)+1;

      d--;

      if (len % 2 == 0 && d != 0) {
        String s = Character.toString(str.charAt(i++));
        System.out.print(" " + numToWord(s) +" "+ units[d--]);        
      }
      while(d > 0)
      {
        String s = Character.toString(str.charAt(i++)) + Character.toString(str.charAt(i++));
        String result = numToWord(s);
        if (result == "end"){
          System.out.print(" ");
          d--;
        }
        else
          System.out.print(" "+ numToWord(s) +" "+ units[d--]);
      }       
      if(d == 0){
        String s = Character.toString(str.charAt(i++)) + Character.toString(str.charAt(i++)) + Character.toString(str.charAt(i++));
        String result = numToWord(s);
        if (result == "Zero")
          System.out.print(" ");
        else
          System.out.print(" "+ result +" "+ units[d--]);
      }           
    }  
  }

  public static void main(String args[])
  {      
      Scanner in = new Scanner(System.in);
      int ch;
        System.out.print("\n Enter any number : ");
        String num = in.nextLine();
        String number = num;
        System.out.print("\n Count of Digits : "+num.length());  

        System.out.print("\n 1. Using American Number System ");
        System.out.print("\n 2. Using Indian Number System ");        
        System.out.print("\n 3. Both Number System ");
        System.out.print("\n 4. Exit ");

        System.out.print("\n Enter valid Choose :  ");
        ch = in.nextInt();

        switch(ch)
        {
          case 1 : System.out.print("\n Number in word is \n");
                   convertUsingAmericanNumberSystem(num);
                   break;

          case 2 : System.out.print("\n Number in word is \n");
                   convertUsingIndianNumberSystem(num);
                   break; 

          case 3 : System.out.print("\n Number in word is (American Number System)\n");
                   convertUsingAmericanNumberSystem(number);          
                   System.out.print("\n\n Number in word is (Indian Number System)\n");
                   convertUsingIndianNumberSystem(number);
                   break; 

          case 4 : System.out.println("BYE");
                   break; 

          default : System.out.println("Please enter valid Choose..");               
        }
  }
}
/*

--------------------- Output 1 ------------------------
Documents\Training\JavaPro>Javac NewNumToWord.java

Documents\Training\JavaPro>Java NewNumToWord

 Enter any number : 8765432346787654

 Count of Digits : 16
 1. Using American Number System
 2. Using Indian Number System
 3. Both Number System
 4. Exit
 Enter valid Choose :  3

 Number in word is (American Number System)
 Eight Quardrillion Seven Hundred Sixty Five Trillion Four Hundred Thirty Two Bi
llion Three Hundred Forty Six Million Seven Hundred Eighty Seven Thousand Six Hu
ndred Fifty Four

 Number in word is (Indian Number System)
 Eight Padam Seventy Six Neel Fifty Four Kharv Thirty Two Arab Thirty Four Crore
 Sixty Seven Lakh Eighty Seven Thousand Six Hundred Fifty Four

--------------------- Output 2 ------------------------

\Documents\Training\JavaPro>Java NewNumToWord

 Enter any number : 8900000000000

 Count of Digits : 13
 1. Using American Number System
 2. Using Indian Number System
 3. Both Number System
 4. Exit
 Enter valid Choose :  3

 Number in word is (American Number System)
 Eight Trillion Nine Hundred   Billion

 Number in word is (Indian Number System)
 Eighty Nine Kharv

--------------------- Output 3 ------------------------

\Documents\Training\JavaPro>Java NewNumToWord

 Enter any number : 670000000000000000000000000000000000000000000000000000000000
000000

 Count of Digits : 66
 1. Using American Number System
 2. Using Indian Number System
 3. Both Number System
 4. Exit
 Enter valid Choose :  1

 Number in word is
 Six Hundred Seventy  Vigintillion

*/