package asg2sp23;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee Benita, Jodi, Cherianne, Brandon, Alec, tester;
		
		
		Benita = new Employee("Jurkowski", "Benita", 94420925, "Sales", "GIS Technical Architect", "bjurkowski1@company.com");
		Jodi = new Employee("Hearns", "Jodi", 98903489, "Sales", "Sales Representative", "jhearns2@company.com");
		Cherianne = new Employee("Newey", "Cherianne", 419553081, "Marketing", "Senior Developer", "cnewey0@company.com");
		
		// Creating objects of the employee class.
		
		Brandon = new Employee("Dove", "Brandon", 123456709, "Studies", "Student", "brandondove12345@hotmail.com");
		Alec = new Employee("Deen", "Alec", 14245213, "Technicians", "Technician", "adeen1@yahoo.com");
		
		tester = new Employee();
		
		// My two sets of data.
		
		System.out.println(Benita + "\n");
		
		System.out.println(Jodi + "\n");
		
		System.out.println(Cherianne + "\n");
		
		System.out.println(Brandon + "\n");
		
		System.out.println(Alec + "\n");
		
		System.out.println(tester);


		// Printing the data of the objects with a newline after each set.
		


		
	}

}
