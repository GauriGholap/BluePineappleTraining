import java.util.Scanner;
 
class NumberToWord
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

      if (t == 1){
        ans += digits[u+10];
      }else {
        ans += tens[t] +" " + digits[u];
      }  
    }else if (str.length() == 3) {          // for three digit no
      int h = Character.getNumericValue(str.charAt(0));
      int t = Character.getNumericValue(str.charAt(1));
      int u = Character.getNumericValue(str.charAt(2)); 

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
  
  static void convertNum(String str)
  {
    String[] units = {"Thousand", "Million", "Billion", "Trillion", "Quardrillion", "Sextillion", "Septillion", "Octillion", "Nonillion", "Decillion", "Undeillion", "Duodecillion", " Tredecillion", "Quatturordecillion", "Quindecillion", "Sexdecillion"};
    String numWord = "";
    int count = 0;
    int len = str.length();
    int i = 0;
    int d = len / 3;

    if (len <= 3) {
      numWord = numToWord(str);
    }else 
    {
      if (len % 3 == 1) {
        String s = Character.toString(str.charAt(0));
        System.out.print(" " + numToWord(s) +" "+ units[--d]);
        i = 1;
      }
      if (len % 3 == 2) {
        String s = Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)); 
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
          if (result == " ")
            System.out.print(" ");
          else
            System.out.print(" "+ result +" "+ units[--d]);
        }
        i = i+3;                
      }
    }  
  }  

  public static void main(String args[])
  {      
      Scanner in = new Scanner(System.in);

      System.out.print("\n Enter any number : ");
      String num = in.nextLine();
      
      System.out.println("Count of Digits : "+num.length());

      System.out.println("Number in word is ");
      convertNum(num);
  }
}
/*

--------------------- Output 1 ------------------------
\JavaPro>Java NumberToWord

 Enter any number : 9876543245
Number in word is
 Nine Billion Eight Hundred Seventy Six Million Five Hundred Forty Three Thousan
d Two Hundred Forty Five

--------------------- Output 2 ------------------------
\JavaPro>Java NumberToWord

 Enter any number : 80088293
Number in word is
 Eighty  Million Eighty Eight Thousand Two Hundred Ninety Three

--------------------- Output 3 ------------------------
\JavaPro>Java NumberToWord

 Enter any number : 987568324009890002337
Number in word is
 Nine Hundred Eighty Seven Sextillion Five Hundred Sixty Eight Quardrillion Three 
 Hundred Twenty Four Trillion  Nine Billion Eight Hundred Ninety  Million  Two
Thousand Three Hundred Thirty Seven

--------------------- Output 4 ------------------------
\JavaPro>Java NumberToWord

 Enter any number : 876578654387654313450009877890987498765678909
Count of Digits : 45
Number in word is
 Eight Hundred Seventy Six Quatturordecillion Five Hundred Seventy Eight  Tredec
illion Six Hundred Fifty Four Duodecillion Three Hundred Eighty Seven Undeillion
 Six Hundred Fifty Four Decillion Three Hundred Thireteen Nonillion Four Hundred
 Fifty  Octillion  Nine Septillion Eight Hundred Seventy Seven Sextillion Eight
Hundred Ninety  Quardrillion Nine Hundred Eighty Seven Trillion Four Hundred Nin
ety Eight Billion Seven Hundred Sixty Five Million Six Hundred Seventy Eight Tho
usand Nine Hundred  Nine

*/