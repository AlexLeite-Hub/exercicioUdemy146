package application;

import java.util.Locale;
import java.util.Scanner;

import model.intities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initil Balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double withdraw = sc.nextDouble();
		if (withdraw > withdrawLimit) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		} else if (withdraw > balance) {
			System.out.println("Withdraw error: Not enough balance");
		} else {
		account.withdrawn(withdraw);
		System.out.print(account);
		}
		
		
		sc.close();
	}

}
