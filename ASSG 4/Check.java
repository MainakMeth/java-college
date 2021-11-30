//Question 1
abstract class Parent{
	 abstract void m1();
	 abstract void m2();
	 abstract void m3();
}
class Child extends Parent{
	void m1(){
		System.out.println("C class in m1() method");
	}
   	void m2(){
		System.out.println("C class in m2() method");
	}
	void m3() {
		System.out.println("C class in m3() method");
	}
}
class Check{
	public static void main(String[]args){
		Parent p=new Child();
		p.m1();
		p.m2();
		p.m3();
	}
}
