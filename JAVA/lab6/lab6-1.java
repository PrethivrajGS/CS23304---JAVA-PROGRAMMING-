import java.util.Scanner;
import java.util.Arrays;
 class Anagram
{
    public static void main(String[] arg)
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the two strings:");
    String a= obj.nextLine();
    String b= obj.nextLine();
    if(a.length()==b.length())
    {
        char[] c1=a.toCharArray();
        char[] c2=b.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean result=Arrays.equals(c1,c2);
         if(result)
         {
        System.out.println(a + " and " + b + " are anagram.");
         }
      else
      {
        System.out.println(a + " and " + b + " are not anagram.");
      }
    }
    else 
    {
      System.out.println(a + " and " + b + " are not equal length.");
    }
  }
}