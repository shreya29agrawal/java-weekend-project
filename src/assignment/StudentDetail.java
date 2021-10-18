package assignment;

public class StudentDetail {
	int age;
	String name;
	float marks;
	
	StudentDetail(int age, String name , Float marks)
	{
		this.age=age;
		this.name=name;
		this.marks=marks;
		
	}
	
	void show()
	{
		System.out.println("age :"+age);
		System.out.println("name :"+name);
		System.out.println("marks :"+marks);
		
	}
	
	StudentDetail compare(StudentDetail s2)
	{
		if(marks>s2.marks)
		return this;
		else
			return s2;
	}
	
	public static void main(String[] args) {
		StudentDetail s1=new StudentDetail(25,"abc",78f);
		//s1.show();
		StudentDetail s2 = new StudentDetail(24,"xyz",80.5f);
		//s2.show();
		StudentDetail s=s1.compare(s2);
		s.show();
		
		

	}

}
