import java.util.Scanner;
import java.lang.*;
abstract class employee
{
    String name;
    double a;
    abstract void calcsalary(float amount);
    abstract void display();
}
class manager extends employee
{
    float m;
    public manager(String name,float m)
    {
        this.name =name;
        this.m=m;
    }
    void calcsalary(float m)
    {
         a=30*m;
       
    }
    void display()
    {
        System.out.println("name is:"+name);
        System.out.printf("salary is :%.2f\n",a);
    }
}
class programmer extends employee
{
    float n;
     public programmer(String name,float n)
    {
        this.name =name;
        this.n=n;
    }
    void calcsalary(float n)
    {
         a= 30*n;
    }
    void display() 
    {
       System.out.println("name is:"+name);
       System.out.printf("salary is :%.2f\n",a);
    }
}
class Main
{
  public static void main(String[] arg)
  {
      employee e=new manager("rasu",800);
     
      e.calcsalary(800);
      e.display();
       employee p=new programmer("aswin",780);
      p.calcsalary(780);
      p.display();
  }
}