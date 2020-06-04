package cz.spsejecna.steiger;

import java.util.ArrayList;
import java.util.Scanner;

public class Mechanism {
	Scanner sc = new Scanner(System.in);
	ArrayList<Node> arr = new ArrayList<Node>();

	Node a = new Node("Dominik", "654321");
	Node b = new Node("Filip", "123456");
	Node c = new Node("Tomas", "password");

	public void firstStep() {
		arr.add(a);
		arr.add(b);
		arr.add(c);
	}

	public Mechanism() {
		super();
	}

	public boolean Log() {

		System.out.println("Nickname:");
		String nick = sc.nextLine();
		System.out.println("Password:");
		String pass = sc.nextLine();

		for (int i = 0; i < arr.size(); i++) {
			if (nick.equalsIgnoreCase(arr.get(i).getNickName())) {
				if (pass.equals(arr.get(i).getPassword())) {
					return true;
				}
			}
		}

		return false;
	}

	public void Reg() {
		Node F = new Node();
		boolean pom = false;
		String nick = "";
		do {
			System.out.println("\nSet your Nick:");
			nick = sc.nextLine();
			for (int i = 0; i < arr.size(); i++) {
				if (nick.equalsIgnoreCase(arr.get(i).getNickName())) {
					System.err.println("This nick is already taken!");
				} else if(nick.matches("[A-Z][a-z]*.{2,}")){
					System.err.println("Your name must be at least three letters long!");
				}else {
					pom = true;
				}
			}
		} while (pom == false);
		F.setNickName(nick);
		F.setPassword();
		arr.add(F);
	}

}
