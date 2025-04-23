import java.util.Scanner;

// BROCODE Practice:
//

public class bank {

	//goals:
	/*
		java banking program beginners
		declare variables
		display menu
		get process user's choice
		showbalance()
		deposit()
		withdraw()
		exit message.
	*/

	
	// public class Bank {

	// }


	// CREATING class methods for bank class:

	
	static void showBalance(double balance) {
		System.out.printf("$%.2f\n\n", balance);
	}

	static double deposit() {
		double amount;

		System.out.print("Enter an amount to deposit: ");
		amount = scanner.nextDouble();

		if (amount < 0) {
			System.out.println("Amount can't be negative");
			return 0;
		} else {
			return amount;
		}

	}


	static double withdraw(double balance) {
		double newBal = 0;
		
		double amount;

		System.out.print("Enter amount to withdraw: ");

		amount = scanner.nextDouble();

		if (amount > balance) {
			System.out.println("Insufficient Funds");
			return 0;
		}
		else if(amount < 0) {
			System.out.println("Amount can't be negative.");
			return 0;
		}
		else {
			return amount;
		}

	}



	// static method to reuse Scanner() to accept user input:
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		

		double balance = 10.99;

		boolean isRunning = true;

		int choice;


		while(isRunning) {

			// display menu:
			System.out.println("***************");
			System.out.println("BANKING PROGRAM");
			System.out.println("***************");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("***************");


			// get process user's choice:
			System.out.print("Enter your choice (1-4): ");
			choice = scanner.nextInt();


			//using switch to handle choices:
			switch (choice) {
				// case 1 -> System.out.println("Show Balance\n\n");
				case 1 -> showBalance(balance);
				// case 2 -> System.out.println("Deposit\n\n");
				case 2 -> balance = balance + deposit();
				// case 3 -> System.out.println("Withdraw\n\n");
				case 3 -> balance = balance - withdraw(balance);
				case 4 -> isRunning = false;
				default -> System.out.println("Not a choice\n\n");
			}  

		}

		scanner.close();



	}

}