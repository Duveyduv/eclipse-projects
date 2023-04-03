package cosc2425lab8sp23Test;

import java.util.Scanner;

import cosc2425lab8sp23.Person;

public class PersonDriver {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		char enterAnother = 'y';
		while (enterAnother == 'y') {
			System.out.print("Enter name of person:");
			String name1 = scanner.nextLine().trim();
			System.out.print("Enter address of person:");
			String address1 = scanner.nextLine().trim();

			System.out.print("Enter phone number of person:");
			String number1 = scanner.nextLine().trim();

			Person person = new Person(name1, address1, number1);
			System.out.println("You entered the following information: " + person.toString());

			System.out.print("Do you want to enter another peson information - y to continue?");
			enterAnother = scanner.next().charAt(0);
			scanner.nextLine().trim();
			if (enterAnother == 'n')
				System.out.println("bye");
			else
				continue;

		}
	}

}
