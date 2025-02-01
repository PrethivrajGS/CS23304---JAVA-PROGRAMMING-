import java.util.Scanner;
import java.util.Arrays;
class odd
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter size:");
        int s=obj.nextInt();
        int[] a= new int [s];
        System.out.println("enter the integers:");
        for(int i=0;i<s;i++)
        {
            a[i]=obj.nextInt();
        }
         try 
         {
             check(a);
             System.out.println("not found");
            
         } catch(DuplicateNumberException e) 
         {
             System.out.println(e.getMessage());
         }
    }
    
public static void check(int[] a) throws DuplicateNumberException
{
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
          {
            if(a[i]==a[j])
            {
            throw new DuplicateNumberException(" DUPLIACTE FOUND "+a[i]);
             }
            
          }
        }
}
}
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}