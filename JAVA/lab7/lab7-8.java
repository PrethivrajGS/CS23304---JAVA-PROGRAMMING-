import java.util.*;
import java.io.*;
interface pranesh
{
   public void add(float a);
}
class prem implements pranesh
{
    
   public void add(float a)
    {
     
      int b=5;
      float sum=a+b;
      System.out.println("SUM:"+ sum);
    }
     public void add(int a)
    {
     
      float b=5;
      float sum=a+b;
      System.out.println("SUM:"+ sum);
    }
}
class Main
{
   public static void main(String[] arg)
   {
       prem p= new prem();
       p.add(10.5f);
       p.add(10);
      
   }
}