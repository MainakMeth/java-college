/*
Design a class to represent a Bank Account. Include the following things:
 Fields
 Name of the depositor
 Account number
 Type of account
 Balance amount in the account
 Methods
 To assign initial values
 To deposit an amount
 To withdraw an amount after checking balance
 To display the name and balance*/
public class Bank
{
 String depositor;
 int accountno;
 String account;
 int balance;

 Bank(String s,int an,String a,int b)
  {
    depositor=s;
    accountno=an;
    account=a;
    balance=b;
  }

  void deposit(int depo)
  {
    balance+=depo;
  }
  void withdraw(int with)
  {

    if(balance>with)
     balance-=with;
    else
    System.out.println("no balance");
  }
  void display()
  {
   System.out.println(depositor);
   System.out.println(balance);
  }

   public static void main(String[] args)
   {
     Bank bc=new Bank("Mainak",1234,"Savings",50000);
     bc.deposit(500);
     bc.display();
     bc.withdraw(50);
     bc.display();

   }
 }
