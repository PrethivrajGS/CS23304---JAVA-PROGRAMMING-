/*Create a class for bank account that has name of the depositor, type of account, account 
number, and balance amount. The class should have methods that assigns initial values, to 
deposit an amount, to withdraw amount after checking balance and to display the name and 
balance. (Use Constructors also)*/
import java.util.Scanner;
class Bankaccount
{
   String name;
   String acctype;
   int accno;
   int bal=0;
   //int amount;
 public Bankaccount(String a,String b,int c)
 {
    name=a;
    acctype=b;
    accno=c;
 }
 public void deposit(int amount)
 { 
   if(amount>0) 
   {bal= bal+amount;}
   else
     System.out.println("invalid");
 }
 public void withdraw(int amount2)
 {
   if(amount2<=bal)
   {bal = bal-amount2;}
   
 }
 public void display()
 {
   System.out.println("NAME:"+name);
   System.out.println("BALANCE:"+bal);
 }
  public static void main(String[] arg)    
  {
     Scanner scan= new Scanner(System.in);
     System.out.print("Enetr the amount to be deposited:");
     int amount= scan.nextInt();   
     System.out.print("enter amount top be withdrawn:");
     int amount2= scan.nextInt();
     Bankaccount b= new Bankaccount("GSP","Savings",43528414);
     b.deposit(amount);
     b.withdraw(amount2);
     b.display();
 }
}