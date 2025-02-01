import java.util.Scanner;
class Remove
{
    public static void main(String[] s)
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter the string:");
     String line=obj.nextLine();
     System.out.println("enter the character to remove:");
     char ch=obj.next().charAt(0);
     String result= remove(line,ch);
     System.out.println("the string after removing is:"+result);
     obj.close();
    }
    public static String remove(String str,char c)
    {
        return str.replaceAll(Character.toString(c), "");
    }
}