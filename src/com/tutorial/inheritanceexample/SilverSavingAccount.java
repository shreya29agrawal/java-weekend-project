package com.tutorial.inheritanceexample;

// multilevel inheritance

public class SilverSavingAccount extends SavingAccount {
     
	String offerId;
     void inputSilverDetails()
     {
    	 System.out.println("enter offer id");
    	 offerId=sc.next();
     }
     
     void showSilverDetails()
     {
    	 System.out.println("offerid :"+offerId);
     }
	public static void main(String[] args) {
		SilverSavingAccount obj = new SilverSavingAccount();
		obj.input();
		obj.inputsavingdetails();
		obj.inputSilverDetails();
		obj.show();
		obj.showSavingDetails();
		obj.showSilverDetails();
		System.out.println(obj.id);

	}

}
