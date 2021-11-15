/*Define a class named ParkingLot with the following description :
Instance variables/data members:
int vno — To store the vehicle number
int hours — To store the number of hours the vehicle is parked in the parking lot
double bill — Tb store the bill amount
Member methods:
void input( ) — To input and store the vno and hours.
void calculate( ) — To compute the parking charge at the rate of Rs.3 for the first hours or part thereof, and Rs. 1.50 for each additional hour or part thereof.
void display ( ) — To display the detail
Write a main method to create an object of the class and call the above methods.*/
class ParkingLot
{
  int vno;
  int hours;
  double bill;



ParkingLot()
{
  vno=0;
  hours=0;
  bill=0;
}

void input(int v,int h)
{
 vno=v;
 hours=h;
}

void calculate()
{

  if(hours<=1)
  {
    bill=3;
  }
  else
  {
    bill=3+((hours-1)*1.5);
  }
}

  void display()
  {
    System.out.println("Car no: " + vno);
   System.out.println("Hours: " + hours);
    System.out.println("Bill after calculating=" + bill);
}

public static void main(String[] args)
 {
  ParkingLot Park=new ParkingLot();
  Park.input(12345,4);
  Park.calculate();
  Park.display();
 }

}
