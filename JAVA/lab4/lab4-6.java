/* Print the sum of two complex numbers by creating a class named 'Complex' with separate 
functions for sum and print whose real and imaginary parts are entered by the user. Initialize 
the objects using a constructor*/
class Complex
{
  int real,imag;
  Complex()
  {
      real=0;
      imag=0;
  }
  Complex(int x,int y)
  {
      real=x;
      imag=y;
  }
  public void add(Complex c1,Complex c2)
  {
    real= c1.real+c2.real;
    imag=c1.imag+c2.imag;
  }
  public void display()
  {
      if(imag>=0)
      {
          System.out.println("COMPLEX NUMBER IS:"+real+"+"+imag+"i");
      }
      else
      {
          System.out.println("COMPLEX NUMBER IS:"+real+""+imag+"i");
      }
  }
      public static void main(String s[])
      {
          Complex c1= new Complex(-2,3);
          Complex c2= new Complex(4,-5);
          Complex c3= new Complex();
          c3.add(c1,c2);
          c1.display();
          c2.display();
          c3.display();
      }
  
}
