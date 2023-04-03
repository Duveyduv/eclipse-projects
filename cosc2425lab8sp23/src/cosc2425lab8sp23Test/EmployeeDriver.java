package cosc2425lab8sp23Test;

import java.util.Scanner;

import cosc2425lab8sp23.Employee;


public class EmployeeDriver {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		char enterAnother = 'y';
		while (enterAnother == 'y') {
			System.out.print("Enter name of employee: ");
			String name1 = scanner.nextLine().trim();
			System.out.print("Enter home address of employee: ");
			String address1 = scanner.nextLine().trim();

			System.out.print("Enter home phone number of employee: ");
			String number1 = scanner.nextLine().trim();

			System.out.print("Enter employee id number: ");
			String empNumber1 = scanner.nextLine().trim();

			System.out.print("Enter department of employee: ");
			String dept1 = scanner.nextLine().trim();

			System.out.print("Enter employee email: ");
			String empEmail1 = scanner.nextLine().trim();

			System.out.print("Enter yes/no -- if employee exempt:");
			String answer = scanner.nextLine().trim();

			boolean exempt1 = (answer.equals("yes"));

			Employee employee = new Employee(name1, address1, number1, empNumber1, dept1, empEmail1, exempt1);

			System.out.println("You entered the following information: \n" + employee.toString());

			System.out.print("Do you want to enter another employee information - y to continue?");
			enterAnother = scanner.next().charAt(0);
			scanner.nextLine().trim();
			if (enterAnother == 'n')
				System.out.println("bye");
			else
				continue;

		}
	}

}
