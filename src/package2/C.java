package package2;
import package1.*;
//import package1.A;


public class C {
	public static void main(String[] args) {
		A a=new A();
		B b = new B();
		
		//package1.A a1 =new package1.A();
		//package1.B b2 = new package1.B();
		
		a.m1();
		b.m2();
		
		
	}

}
