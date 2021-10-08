package bank;

import java.util.Scanner;

public class BankApplication {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	BankApplication(String cusName,String cid){
		customerName=cusName;
		customerId=cid;
	}
	void deposit(int amount) {
		if(amount !=0) {
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdraw(int amount) {
		if(amount !=0) {
			balance=balance+amount;
			previousTransaction=-amount;
		}
	}
	void getPreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposited:"+previousTransaction);
		}
		else if(previousTransaction<0) {
			System.out.println("Withdrawn:"+Math.abs(previousTransaction));
		}
	 
	 else {		
		 System.out.println("No Transaction Occured");
	 }
		
	}
	void showaccount() {
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Welcome :"+customerName);
		 System.out.println("ID :"+customerId);
		 System.out.println("\n");
		 System.out.println("1.Check Balance");
		 System.out.println("2.Deposit");
		 System.out.println("3.Withdrawn");
		 System.out.println("4.PreviousTransaction");
		 System.out.println("5.Exit");

	
	do {
		 System.out.println("Enter your choice:");
		 

option = scanner.next().charAt(0);
System.out.println("\n");

	
switch(option) {
case '1':
	 System.out.println("Balance="+balance);
	 System.out.println("\n");
break;


case '2':
	 System.out.println("Enter an amount to deposit:");
	 int amount=scanner.nextInt();
	 deposit(amount);
	 System.out.println("\n");
break;

case '3':
	 System.out.println("Enter an amount to Withdrawn:");
	 int amount2=scanner.nextInt();
	 withdraw(amount2);
	 System.out.println("\n");
break;

case '4':
	 getPreviousTransaction();
	 System.out.println("\n");
break;

}

	
	}
	while(option !='5');
	System.out.println("Thank you for using our srvices");

}
	
	public static void main(String[] args) {
		
BankApplication obj1=new BankApplication("Ragavi","10033A");
obj1.showaccount();
	}

}
