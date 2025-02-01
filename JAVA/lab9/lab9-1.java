import java.util.Scanner;
class JAVA
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int x=0;
        assert x>0 :"x is negative";
         
         try {
             int result=divide(a,b);
             System.out.println("RESULT :"+result);
         } catch(ArithmeticException e) {
             System.out.println("CANNOT DIVIDE");
         }
    }
    
    public static int divide(int a,int b)
    {
        return a/b;
    }
}