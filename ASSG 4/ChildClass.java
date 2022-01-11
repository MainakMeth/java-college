//Question 1
abstract class AbstractClass {
   public void display() {
      System.out.println("Concrete method of abstract class with no abstract method");
   }
}

class ChildClass extends AbstractClass{
   public static void main(String args[]) {
	    new ChildClass().display();
   }
}
