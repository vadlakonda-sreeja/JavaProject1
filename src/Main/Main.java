package Main;

import java.util.Scanner;

import Controller.BankingController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankingController bc = new BankingController();
		while(true)
		{
			System.out.println("1.register");
			System.out.println("2.login");
			int opt = sc.nextInt();
			switch(opt){
			case 1:
			{
				bc.register();
			}
			case 2 :
			{
				bc.login();
			}
			}
		}

	}

}
