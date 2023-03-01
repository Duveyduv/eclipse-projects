// Assignment-2 – COSC 2425-03 – Professor McCurry

//  Implemented by - Brandon Dove

package asg2sp23;

public class Employee {
	
	String fname;
	String lname;
	int empID;
	String dpt;
	String func;
	String empEmail;
	
	// Initializing the fields within the main class.


	public Employee() {
		empID = 0;
		fname = "null";
		lname = "null";
		dpt = "null";
		func = "null";
		empEmail = "null";
	}
	
	/* This method above will provide a default output
	   of "null" if no instances are created.
	*/
	
	public Employee(String lname, String fname, int empID, String dpt, String func, String empEmail) {
		
		this.lname = lname;
		this.fname = fname;
		this.empID = empID;
		this.dpt = dpt;
		this.func = func;
		this.empEmail = empEmail;
		
		// This is the main constructor method.
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	// Appropriate mutators and accessors for the fields.
	
	public String toString() {
		return this.lname + ", " + this.fname + ", employee " + this.empID + ", works as a " + this.func + 
				 " in " + this.dpt + " and has the following email address: " + this.empEmail;
	
	// Created a return method for the formatting requirement.
		
	}
	
}