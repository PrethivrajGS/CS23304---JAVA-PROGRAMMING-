import java.util.Scanner;
class ArrayUser
{
    static int[] sum=new int[50];
    static  float[] av= new float[50];
      public void add(int[] a,int[] b,int n)
      {
          System.out.println("\nSUM:");
      for(int i=0;i<n;i++)
      {
        sum[i]= a[i]+b[i]; 
        System.out.printf("%d ",sum[i]);
      }
      }
      public void average(int n)
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
          System.out.printf("%d ",a[i]);
      }
      System.out.println("\nARRAY2:");
      for(i=0;i<n;i++)
      {
          System.out.printf("%d ",b[i]);
      }
      ArrayUser array1= new ArrayUser();
      ArrayUser array2=new ArrayUser();
      array1.add(a,b,n);
      array2.average(n);
    
  }
}