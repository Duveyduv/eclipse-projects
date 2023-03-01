package asg1;

import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		
		Scanner madLib = new Scanner(System.in);
		System.out.print("Enter a place: ");
		String place = madLib.nextLine();
		System.out.print("Enter a persons name: ");
		String name = madLib.nextLine();
		System.out.print("Enter adjective: ");
		String adjective1 = madLib.nextLine();
		System.out.print("Enter noun: ");
		String noun1 = madLib.nextLine();
		System.out.print("Enter noun: ");
		String noun2 = madLib.nextLine();
		System.out.print("Enter adjective: ");
		String adjective2 = madLib.nextLine();
		System.out.print("Enter adjective: ");
		String adjective3 = madLib.nextLine();
		System.out.print("Enter noun: ");
		String noun3 = madLib.nextLine();
		System.out.print("Enter number: ");
		String number = madLib.nextLine();
		System.out.print("Enter noun: ");
		String noun4 = madLib.nextLine();
		System.out.print("Enter food: ");
		String food = madLib.nextLine();
		System.out.print("Enter verb: ");
		String verb = madLib.nextLine();
		madLib.close();

		System.out.println(" I went to the beach in " + place + " today with " + name +".\n" +
						   " We had a " + adjective1 + " time." + " We first built a " + noun1 + "\n" +
						   " and then we ran around in the " + noun2 + " for a little while.\n" +
						   " The water was a bit " + adjective2 +"." + " The sun was very " + adjective3 + "\n" +
						   " so we made sure to wear a lot of " + noun3 +"." + " We spent " + number + "\n hours there." +
						   " At the end of the day, we treated outselves to a\n " + noun4 + " and had " +
						   food + " for dinner. I definitely want to go\n to the beach again but next time I " +
						   "want to " + verb +".");
		
		
		
	}
}
