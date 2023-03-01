// Assignment-1 – COSC 2425-03 – Professor McCurry

//  Implemented by - Brandon Dove

package asg1;

public class Asg1Part1 {
	public static void main(String[] args) {
	
		int sumNums = 0;
		int sumDivide = 0;
		int sumSquares = 0;
		
		for(int i = 49; i <= 450; i += 9) {
			
			sumNums = sumNums + i;
		}
	
		System.out.println("The sum of numbers of 49 to 250 with an increment of 9 is: " + sumNums + "\n");
		
		
		System.out.println("The sum the numbers from 2445 to 3151 that are evenly divisible by 37 are: ");
		
		for(int i = 2445; i <= 3151; i++) {
			
			if (i % 37 == 0) {
				
				sumDivide = sumDivide + i;
				System.out.println(sumDivide);
				
				
			}
			
		
		
		}
		
		System.out.println("\n");
		System.out.println("The sum of squares of numbers from 5 to 30 are: ");
		
		for(int i = 5; i <= 30; i++) {
			
			sumSquares += i*i;
			System.out.println(sumSquares);
			
		}
		
		
		
	}
	
	

}
