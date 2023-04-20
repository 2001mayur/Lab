package scenario;

import java.util.Scanner;

abstract class BankAccount
{
	protected int acc_number, balance;
	public BankAccount(int acc_number, int balance)
	{
		this.acc_number = acc_number;
		this.balance = balance;
	}
	abstract void deposits(int amount);
	abstract void withdraew(int amount);
}

class CheckingAccount extends BankAccount
{

	public CheckingAccount(int acc_number, int balance) {
		super(acc_number, balance);
	}

	@Override
	void deposits(int amount) {
		//System.out.println("Enter the amount you want to deposit: ");
		//int amount = sc.nextInt();
		System.out.println("Balance after deposit: "+(balance+amount));
	}

	@Override
	void withdraew(int amount) {
		if (amount<=balance)
		{
			System.out.println("Amount withdraw successfully!!");
			System.out.println("Your current balance is: "+(balance-amount));
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
}
public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckingAccount ca = new CheckingAccount(123465, 10000);
		do {
			System.out.println("Press\n\t1)deposit\n\t2)Withdraw\n\t3)Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount you want to deposit: ");
				int amount = sc.nextInt();
				ca.deposits(amount);
				break;
				
			case 2:
				System.out.println("Enter the amount you want to Withdraw: ");
				int wamount = sc.nextInt();
				ca.withdraew(wamount);
				break;
				
			case 3:
				System.out.println("Thank you!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!!");
				break;
			}
		}while(true);

	}

}
