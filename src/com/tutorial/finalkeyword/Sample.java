package com.tutorial.finalkeyword;
//final->restriction
//final-> data member ->constant->mendatory to be intialized
//final->method-cannot be overload
//final-> class->cannot extent class
public class Sample {
	final int i;
	Sample()
	{
		i=60;
	}
	
    void show()
    {
    	System.out.println(i);
    }
	public static void main(String[] args) {
		
      Sample s= new Sample();
       s.show();  
	}

}
