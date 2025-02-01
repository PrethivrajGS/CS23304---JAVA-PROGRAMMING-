import java.util.*;
import java.io.*;
abstract class pranesh
{
    abstract void run();
}
class prem
{
    void run()
    {
        System.out.println("he is running on the floor");
    }
}
class Main
{
   public static void main(String[] arg)
   {
       prem p= new prem();
       p.run();
   }
}