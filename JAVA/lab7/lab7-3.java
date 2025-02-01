import java.util.Scanner;
import java.lang.*;
class area
{
    static int cal(int a,int b)
    {
        return a*b;
    }
    static int cal(int a,int b,int c)
    {
        return a*b*c;
    }
    static int cal(int a,int b,int c,int d)
    {
        return a*b*c*d;
    }
}
class Main
{
    public static void main(String[] arg)
    {
        System.out.println(area.cal(20,4));
        System.out.println(area.cal(4,3,2)); 
        System.out.println(area.cal(4,3,2,1)); 
    }
}