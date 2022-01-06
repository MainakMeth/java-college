class Parent
{
 {
  System.out.println("Block-1");
 }
 {
   System.out.println("Block-2");
 }
}
class Child extends Parent
{
  {
    System.out.println("Block-3");
  }
  {
    System.out.println("Block-4");
  }
   public static void main(String[] args)
    { 
      Child c=new Child();

  }
}
