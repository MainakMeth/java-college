/*Create a class; make its instance variable and method.
 Use them from main, declared in different class
*/
class Test
{
  int x=6;
  void show()
     {
        System.out.println(x);
  }
}

class Test2
{ 
public static void main(String[] args)
{
 Test obj=new Test();
 obj.show();
}
}