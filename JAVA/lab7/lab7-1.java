import java.util.Scanner;
import java.lang.*;
abstract class shape3d
{
    abstract double calvol(double r);
    abstract double calsa(double r);
}
class sphere extends shape3d
{
    double calvol(double r)
    {
      return (4.0/3.0) *3.14*r*r*r;
    }
    double calsa(double r)
    {
        return 4*3.14*r*r;
    }
}
class cube extends shape3d
{
    double calvol(double r)
    {
       return r*r*r; 
    }
    double calsa(double r)
    {
        return 6*r*r;
    }
}
class maths
{
public static void main(String[] arg)
{
    shape3d s= new sphere();
    shape3d c=new cube();
    Scanner obj=new Scanner(System.in);
    double r=obj.nextDouble();
    double a= s.calvol(r);
    double b=s.calsa(r);
    double x=c.calvol(r);
    double y=c.calsa(r);
    System.out.printf("volume of cube:%.2f",x);
    System.out.printf("\nsurface area of cube:%.2f",y);
    System.out.printf("\nvolume of sphere:%.2f",a);
    System.out.printf("\nsurface area of sphere:%.2f",b);
}
}