//question 4 place both program in same folder
package pkgTwo;
import pkgOne.*;
class pkgTwo{
	void m1(){
		System.out.println("m1()-method");
	}
	void m2(){
		System.out.println("m2()-method");
	}
	void m3(){
		System.out.println("m3()-method");
	}
	public static void main(String[] args){
		pkgTwo obj = new pkgTwo();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
