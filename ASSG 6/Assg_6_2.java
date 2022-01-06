class Test
{
 Test()
 {
   System.out.println("Constructor");
 }
 static
 {
   System.out.println("Static-block-1");
 }
 static
 {
   System.out.println("Static-block-2");
 }
public static void main(String[] args)
{
   Test t=new Test();   
 }

}
