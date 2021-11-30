//Question 2
abstract class MyClass {
   public void display() {
      System.out.println("Method of abstract class");
   }
}
class AbstractClass extends MyClass{
   public static void main(String args[]) {
	MyClass().display();
	//new AbstractClass().display();
   }
}