package cz.spsejecna.steiger;

import java.util.Scanner;

public class Node {

	private String nickName;
	private String password;

	public String getNickName() {

		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String help = "help";
		String passRegex = "^(?=.*[0-9]).{8,15}$";
		while (a != 1) {
			System.out.println("Set your password:");
			this.password = sc.nextLine();

			if (password.equalsIgnoreCase(help)) {
				Help();
			} else if (this.password.matches(passRegex)) {
				System.out.println("Password is valid!");
				System.out.println("You are registered");
				a = 1;
			} else {
				System.err.println("Password is not valid!");
				System.out.println("if you want to read a instructions writte \"help\"");
				System.out.println();
				a = 0;
			}

		}
	}

	public Node() {
		super();
	}

	public Node(String nickName, String password) {
		super();
		this.nickName = nickName;
		this.password = password;
	}

	public void Help() {
		System.out.println("===================================");
		System.out.println("Password must have:");
		System.out.println("at least one number, 8 characters lenght, one upper latter");
		System.out.println("===================================");
	}

}
