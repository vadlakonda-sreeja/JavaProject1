package Controller;

import java.util.Scanner;

import Model.BankingModel;
import View.BankingEntity;
import View.TransactionEntity;

public class BankingController implements BankingModel{
	
	Scanner sc = new Scanner(System.in);
	BankingEntity e = new BankingEntity();

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("enter emai");
		String email = sc.nextLine();
		System.out.println("enter password");
		String password = sc.nextLine();
		if(e.getEmail().equals(email)&& e.getPassword().equals(password)){
			//System.out.println("login successfull");
			while(true){
				System.out.println("1.deposit");
				System.out.println("2.withdraw");
				System.out.println("3.balance");
				int opt=sc.nextInt();
				switch(opt){
				case 1: 
				{
					dept();
					break;
				}
				case 2:
				{
					with();
					break;
				}
				case 3:
				{
					balance();
					break;
				}
				case 4:
					System.exit(0);
				}
			}
		}
		else {
			System.out.println("enter correct login details");
		}
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("enter email");
		e.setEmail(sc.nextLine());
		System.out.println("enter username");
		e.setUsername(sc.nextLine());
		System.out.println("enter password");
		e.setPassword(sc.nextLine());
		System.out.println("register successfull");
		
	}
	
	TransactionEntity te = new TransactionEntity();
	
	@Override
	public void dept() {
		// TODO Auto-generated method stub
		System.out.println("enter deposit money");
		double d = sc.nextDouble();
		if(d<500){
			System.out.println("deposit amount must be above 500");
		}
		else{
		double t = d+te.getBalance();
		te.setBalance(t);
		}
	}

	@Override
	public void with() {
		// TODO Auto-generated method stub
		System.out.println("enter withdraw amount");
		double d = sc.nextDouble();
		if(te.getBalance()<d){
			System.out.println(te.getBalance()+"your account balance is less than withdraw amount");
		}
		else{
		double t= te.getBalance()-d;
		te.setBalance(t);
		}
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println(te.getBalance());
		
	}

}
