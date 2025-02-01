import java.lang.*;
import java.util.Scanner;
class Repeat
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the word:");
        String s= obj.next();
        boolean d=true;
      for(char i:s.toCharArray())
      {
          if(s.indexOf(i)==s.lastIndexOf(i))
          {
               System.out.println("the first non-repeated character is:"+ i);
              d=false;
              break;
          }
      }
      if(d==true)
      {
       System.out.println("no non-repeating character");  
      }
    }
}