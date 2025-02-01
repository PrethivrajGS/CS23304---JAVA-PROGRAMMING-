import java.io.*;
import java.util.Scanner;

class Reverse
 {
    public static void main (String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println ("enter the string:");
      String str=obj.next();
      String r="";
        char ch;
      
      System.out.print("Original word:");
      System.out.println(str);
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        r= ch+r; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ r);
    }
}