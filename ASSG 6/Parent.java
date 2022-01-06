//Question 3 place both program in same folder
package pTwo;
import pOne.*;
class Child extends Parent
{
  int v3=3;
  int v4=4;
  void m3()
  {
    m1();
    System.out.println("v1="+V1);
  }
  void m4()
  {
    m2();
    System.out.println("v2="+v2);
  }
  public static void main(String[] args)
  {
    Child c=new Child();
    System.out.println("v3="+c.v3+"v4="+c.v4);
    c.m3();
    c.m4();
  }
}
