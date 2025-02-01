/*Create a class ArrayUser with a 1-D array and length of the array. Create functions to : 
add: Adds two array, avg: Find the average of array elements, print: Print the array */
import java.util.Scanner;
class ArrayUser
{
    static int[] sum=new int[50];
    static  float[] av= new float[50];
      public static void sum(int[] a,int[] b,int n)
      {
          System.out.println("SUM:");
      for(int i=0;i<n;i++)
      {
        sum[i]= a[i]+b[i]; 
        System.out.printf("%d ",sum[i]);
      }
      }
      public static void average(int n)
      {
          System.out.println("\nAVERAGE:");
      for(int i=0;i<n;i++)
      {
        av[i]=(float)(sum[i]/2.0);  
        System.out.printf("%.2f ",av[i]);
      }
      }
      
  public static void main(String[] arg)
  {
       Scanner obj=new Scanner(System.in);
      System.out.print("enter the size of array:");
      int n=obj.nextInt();
      int i;
       int[] a= new int[n];
      int[] b= new int[n];
     
      System.out.println("enter array1:");
      for(i=0;i<n;i++)
      {
          a[i]=obj.nextInt();
      }
      System.out.println("enter array2:");
      for(i=0;i<n;i++)
      {
          b[i]=obj.nextInt();
      }
      System.out.println("ARRAY1:");
      for(i=0;i<n;i++)
      {
          System.out.println(a[i]);
      }
      System.out.println("ARRAY2:");
      for(i=0;i<n;i++)
      {
          System.out.println(b[i]);
      }
      sum(a,b,n);
      average(n);
    
  }
}