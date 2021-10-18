package com.tutorial.methodoverloading;

public class OverloadMainMethod {

	public static void main(int a) {
		
        System.out.println(a);
	}
     public static void main(float b) {
		
        System.out.println(b);
	}
      public static void main(String[] args)// String... varargs variable argument
      {
	
            System.out.println("execute first");
            main(89);
            main(4.3f);
}

}
