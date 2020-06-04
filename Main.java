package cz.spsejecna.steiger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("LoginIn system mark I");

		Mechanism MM = new Mechanism();
		MM.firstStep();
		Scanner sc = new Scanner(System.in);
		boolean repeat = true, exce = false;
		String firstChoice = "";
		do {
			repeat = true;

			System.out.println("\nWhat do you want to do?");
			System.out.println("1.login \tlogin ");
			System.out.println("2.register \t register");
			System.out.println("3.close programm \tclose");
			do {
				try {
					firstChoice = sc.nextLine();
					exce = false;
					if (firstChoice.equalsIgnoreCase("login") || firstChoice.equalsIgnoreCase("register")
							|| firstChoice.equalsIgnoreCase("close")) {
						System.out.println(":)");
						exce = false;
					}
				} catch (Exception e) {
					System.err.println("\nWrong choice!");
					exce = true;
				}
			} while (exce == true);

			switch (firstChoice) {

			case "login":
				if (MM.Log() == true) {
					System.out.println("login was successful");
				} else {
					System.err.println("worng name or password!");
					repeat = true;
				}
				break;

			case "register":
				MM.Reg();
				break;

			case "close":
				System.exit(0);
				repeat = false;
				break;

			}

		} while (repeat == true);
	}

}
