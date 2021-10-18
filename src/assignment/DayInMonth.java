package assignment;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		int m,y,day=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
	   y=sc.nextInt();
		System.out.println("enter a month value betwee 1 to 12");
	   m=sc.nextInt();
	   
	   if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
	   {
		   day=31;
	   }
		   else if (m==4||m==6||m==9||m==11)
		   { day=30 ;  
	        }
		         else if (m==2)
		       {
			       if(y%4!=0&&y%100!=0)
			       {
				   day=29;
			     }
				   
			    else
			      {
				   day=28;
			       }
		        }
	
	   System.out.println("no of day in month " +m+ " in year " +y+ " is :"+day);
	
	/*else
		{
		System.out.println("no of day in month " +m+ " in year " +y+ " is :" +day);
		}*/
	   sc.close();
	}

}