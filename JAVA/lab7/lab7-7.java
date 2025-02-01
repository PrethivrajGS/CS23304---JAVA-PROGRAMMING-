import java.util.*;
import java.io.*;
abstract class pranesh
{
    int a=50;
    abstract void run();
     void speed(int a)
     {
         System.out.println("SPEED OF THE VEHICLE IS:"+a);
     }
}
class prem extends pranesh
{
    void show()
    {
     super.speed(a);
    }
    public void run()
    {
        System.out.println("SUZUKI DRIVES IN A HIGH SPEED");
    }
   
    
}
class Main
{
   public static void main(String[] arg)
   {
       prem p= new prem();
       p.run();
       p.show();
   }
}