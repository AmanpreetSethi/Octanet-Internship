package octanet;

import java.util.Scanner;

class ATM{
	
	//Initial Balance = 0 
	float Balance;
	//Default PIN
	int PIN = 1234 ;
	
	
	//Validate PIN First 
	public void checkpin() {
		System.out.println("Enter Your Pin: ");
		Scanner scn = new Scanner(System.in);
		int enteredpin = scn.nextInt();
		if(enteredpin == PIN) {
			menu();
		}else {
			System.out.println("Invalid PIN . Please try again");
			menu();
		}
		
			}

	//Options Available at ATM 
	public void menu() {
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Change PIN");
		System.out.println("5. EXIT");
		
		
		//Select the option 
		Scanner scn = new Scanner(System.in);
		int opt = scn.nextInt();
		
		if(opt == 1){
			checkBalance();
		}
		else if(opt == 2) {
			withdrawMoney();
		}
		else if(opt == 3) {
			depositMoney();
		}
		else if(opt == 4) {
			changepin();
		}
		else if(opt == 5) {
			System.out.println("Thank You.Have a good day !!");
			return;
		}
		else {
			System.out.println("Enter a valid choice");
			menu();
		}
	}
	
	//Option 1 Check Balance 
	public void checkBalance() {
		System.out.println("Balance: " + Balance );
		menu();
	}
	
	
	//Option 2 Withdraw Money
	public void withdrawMoney() {
		System.out.println("Enter Amount to Withdraw: ");
		Scanner scn = new Scanner(System.in);
		float amount = scn.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount ;
			System.out.println("Cash Withdrawl Successful");
		}
		menu();
	}
	
	
	//Option 3 Deposit Money
	public void depositMoney() {
		System.out.println("Enter the Amount: ");
		Scanner scn = new Scanner(System.in);
		float amount = scn.nextFloat();
		Balance = Balance + amount ;
		System.out.println("Money Deposited Successfully ");
		menu();
	}
	
	//Option 4 Change PIN 
	public void changepin() {
		System.out.println("Enter Your Current PIN: ");
		Scanner scn = new Scanner(System.in);
		int currentpin = scn.nextInt();
		if (currentpin == PIN) {
			System.out.println("Enter New PIN: ");
			//Scanner scn = new Scanner(System.in);
			int newpin = scn.nextInt();
			System.out.println("Confirm New PIN: ");
			//Scanner scn = new Scanner(System.in);
			int confirmpin = scn.nextInt();
			if(newpin == confirmpin) {
				System.out.println("PIN Successfully Changed");
			}
			else {
				System.out.println("PINs DO Not Match");
			}
			
		}
		else {
			System.out.println("Incorrect Current PIN ");
		}
		menu();
		}
}
	
public class ATMMachine {

	public static void main(String[] args) {
		
		ATM obj = new ATM();
		obj.checkpin();
		

	}

}
