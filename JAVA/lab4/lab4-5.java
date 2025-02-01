/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
by creating a class named 'Rectangle' with a function named 'Area' which returns the area. 
Length and breadth are passed as parameters to its constructor. */
class Rectangle
{
    int length,breadth;
    Rectangle(int x,int y)
    {
        length=x;
        breadth=y;
    }
    public int area()
    {
        return(length*breadth);
    }
    public static void main(String s[])
    {
        Rectangle r1= new Rectangle(4,5);
        Rectangle r2= new Rectangle(5,8);
        System.out.println("AREA 1:"+ r1.area());
        System.out.println("AREA 2:"+ r2.area());
    }
}