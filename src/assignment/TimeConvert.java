package assignment;

import java.util.Scanner;

public class TimeConvert {

	float sec,min,hr;
	
	Scanner sc = new Scanner(System.in);
	
	float sectohr()
	{
		System.out.println("Enter the value of second");
		sec =sc.nextFloat();
		hr= sec/3600f;
		return hr;
		
	}
	float sectomin()
	{
		System.out.println("Enter the value of second");
		sec=sc.nextFloat();
		min= sec/60f;
		return min;
		
	}
	float mintohr()
	{
		System.out.println("Enter the value of minute");
	    min=sc.nextFloat();
		hr= min/60f;
		return hr;
		
	}
	float hrtomin()
	
	{
		System.out.println("Enter the value of hour");
	     hr=sc.nextFloat();
		min= hr*60f;
		return min;
		
	}
	float hrtosec()
	{
		System.out.println("Enter the value of hours");
		hr=sc.nextFloat();
		sec=hr*3600f;
		return sec;
		
	}
	public static void main(String[] args) {
		

		TimeConvert obj=new TimeConvert();
		//float t=obj.sectomin();
		//System.out.println(t);
		
		System.out.println("sec to min is "+obj.sectomin());
		System.out.println("the value of hours is "+obj.sectohr());
		System.out.println("the value of hour is "+obj.mintohr());
		System.out.println("the value of min is "+obj.hrtomin());
		System.out.println("the value of sec is "+obj.hrtosec());
	
		

	}

}
