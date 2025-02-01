import java.util.Scanner;
 class Main
{
    static class Maths
    {
         static int add(int x,int y)
         {
             int sum=x+y;
             return sum;
         }
    }
    public static void main(String s[])
    { 
        System.out.println("SUM:"+Main.Maths.add(3,4));
    }
}