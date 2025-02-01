import java.util.Scanner;
class Swap {
    public static void main(String[] args) 
    {
      Scanner obj=new Scanner(System.in);
      System.out.println("enter the two strings to swap:");
      String str1=obj.next();
      String str2=obj.next();
        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        
        str1 = str1 + str2; 
        str2 = str1.substring(0, str1.length() - str2.length()); 
        str1 = str1.substring(str2.length());

        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
