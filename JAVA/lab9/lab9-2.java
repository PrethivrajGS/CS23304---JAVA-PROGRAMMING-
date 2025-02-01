import java.util.Scanner;
class odd
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a:");
        int a=obj.nextInt();
         try 
         {
             check(a);
            
         } catch(OddNumberException e) 
         {
             System.out.println("it is odd");
         }
    }
    
    public static void check(int a) throws OddNumberException
    {
        if(a%2!=0)
        {
            throw new OddNumberException("the number "+a+"is odd");
            
        }
        else{
            System.out.println("IT IS EVEN");
        }
    }
}
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}