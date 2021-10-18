package com.tutorial.inheritanceexample;
class CurrentAccount extends Account
{
	double transactionfee;
	

void inputCurrentDetail()
{
	System.out.println("enter transaction fee");
	transactionfee = sc.nextDouble();
}
 void showCurrentDetails()
 {
	 System.out.println("transaction fee :"+transactionfee);
 }
}
public class Test {

	public static void main(String[] args) {
		CurrentAccount c = new CurrentAccount();
		SavingAccount s = new SavingAccount();
		System.out.println("Enter saving account details");
		s.input();
		s.inputsavingdetails();
		System.out.println("enter current account details"); 
		s.show();
		s.showSavingDetails();
		System.out.println("showing saving account");
		c.input();
		c.inputCurrentDetail();
		System.out.println("display current account");
		c.show();
		c.showCurrentDetails();

	}

}
