import java.io.*;
import java.util.Scanner;
class Check
{
    public static void main(String[] arg)
    {
        int c=0,d=0,s=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the mixed string:");
        String str= obj.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z')
            {
             c++;
            }
            else if(ch>='0' && ch<='9')
            {
                d++;
            }
            else
            {
                s++;
            }
        }
        System.out.println("THE COUNT OF ALPHABETS:"+c);
        System.out.println("THE COUNT OF DIGITS:"+d);
        System.out.println("THE COUNT OF SPECIAL CHARACTERS:"+s);
    }
}