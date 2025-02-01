import java.io.*;
import java.util.Scanner;
class Only
{
    public static void main(String[] arg)
    {
        int c=0,d=0,s=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the mixed string:");
        String str= obj.nextLine();
        boolean digits=true;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!(ch>='0' &&ch<='9'))
             {
                 digits=false;
                 break;
             }
             
        }
        if(digits)
        {
            System.out.println("ONLY DIGITS");
        }
        else
             {
                 System.out.println("CONTAINS ALL CHARACTERS");
             }
    }
}