/*Design a class name ShowRoom with the following description :
Instance variables/ Data members :
String name – To store the name of the customer
long mobno – To store the mobile number of the customer
double cost – To store the cost of the items purchased
double dis – To store the discount amount
double amount – To store the amount to be paid after discount
Member methods: –
ShowRoom() – default constructor to initialize data members
void input() – To input customer name, mobile number, cost
void calculate() – To calculate discount on the cost of purchased items, based on following criteria

Cost |	Discount (in percentage)
Less than or equal to ₹ 10000 |	5%
More than ₹ 10000 and less than or equal to ₹ 20000 |	10%
More than ₹ 20000 and less than or equal to ₹ 35000	| 15%
More than ₹ 35000 |	20%

void display() – To display customer name, mobile number, amount to be paid after discount
Write a main method to create an object of the class and call the above member methods.*/


class Showroom

{ String name;
  long mobno;
  double cost;
  double dis;
  double amount;



Showroom()
{
  name="";
  mobno=0;
  cost=0;
  dis=0;
  amount=0;
}

void input(String n,long m,double c)
{
  name=n;
  mobno=m;
  cost=c;
}
void calculate()
{
  if(cost<=10000)
  {
    dis=(5/100)*cost;
  }
  else if(cost>10000&&cost<=20000)
  {
      dis=(10/100)*cost;
  }
  else if(cost>20000&&cost<=35000)
  {
      dis=(15/100)*cost;
  }
  else
  {
    dis=(20/100)*cost;
  }
  amount=cost-dis;
}
void display()
{
  System.out.println("Customer Name: " + name);
 System.out.println("Mobile Number: " + mobno);
  System.out.println("Amount after the discount=" + amount);
}
public static void main(String[] args)
{
  Showroom obj=new Showroom();
  obj.input("Mainak",98044,10000);
  obj.calculate();
  obj.display();
}
}
