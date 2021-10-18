package assignment;

public class OverloadAdd {

	int sum;
	float d;
	
	void add(int a,int b)
	{  
		sum=a+b;
		System.out.println(sum);
	}
	
	void add(int a,int b,int c)
	{
		sum = a+b+c;
		System.out.println(sum);
	}
		void add(float x , float y)
		{
			d=x+y;
			System.out.println(d);
		}
	
	public static void main(String[] args) {
		OverloadAdd obj = new OverloadAdd();
		obj.add(2, 3);
		obj.add(5, 6,8);
		obj.add(3.4f, 6.4f);
		
	}

}
