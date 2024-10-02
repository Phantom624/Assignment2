/*
 * Class: CMSC203 CRN 20931
 * Instructor: Khandan Monshi
 * Description: This class allows the user to access the Procedure and Patient Classes and set or initialze the values of the
 * variables in each class and define Patient and Procedure objects.
 * Due: 10/04/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fernando Benitez-Diaz
*/

package Assignment2;

import java.util.Scanner;

public class ProcedureDriverApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String first, middle, last, street, city, state, pNumber, eName, eNumber;
		String zipCode;
		
		//	Ask the user to input the Patients FIRST, MIDDLE, and LAST NAME
		System.out.print("Please Enter the Patient's First Name: ");
		first = input.nextLine();
		System.out.print("Please Enter the Patient's Middle Name: ");
		middle = input.nextLine();
		System.out.print("Please Enter the Patient's Last Name: ");
		last = input.nextLine();
		
		//	Ask the user to input the Patients STREET ADDRESS, CITY, STATE and ZIP CODE
		System.out.print("Please Enter the Patient's Street Address: ");
		street = input.nextLine();
		System.out.print("Please Enter the Patient's City: ");
		city = input.nextLine();
		System.out.print("Please Enter the Patient's State: ");
		state = input.nextLine();
		System.out.print("Please Enter the Patient's Zip Code: ");
		zipCode = input.nextLine();
		
		//	Ask the user to input the Patients PHONE NUMBER
		System.out.print("Please Enter the Patient's Phone Number in the following format xxx-xxx-xxxx: ");
		pNumber = input.nextLine();
		
		//	Ask the user for the Patients EMERGENCY CONTACT'S NAME AND PHONE NUMBER
		System.out.print("Please Enter the Patient's Emergency Contact's Name: ");
		eName = input.nextLine();
		System.out.print("Please Enter the Patient's Emergency Contact's Phone Number in the following format xxx-xxx-xxxx: ");
		eNumber = input.nextLine();
		
		//	Creates a Patient object and initializes it with data inputed by the user.
		Patient p1 = new Patient(first, middle, last, street, city, state, zipCode, pNumber, eName, eNumber);
		
		
		// Ask the user to input information of all three Procedures
		String name, date, practitioner, gar;
		double charges;
		
		//	Ask the user to input the values of Procedure 1 using the Mutators
		Procedure pr1 = new Procedure();
		System.out.print("Please enter the name of the 1st Procedure: ");
		pr1.setName(input.nextLine());
		System.out.print("Please enter the Date of the 1st Procedure: ");
		pr1.setDate(input.nextLine());
		System.out.print("Please enter the Name of the Practitioner of the 1st Procedure: ");
		pr1.setPractitioner(input.nextLine());
		System.out.print("Please enter the Charges of the 1st Procedure: ");
		pr1.setCharges(input.nextDouble());
		gar = input.nextLine();	//	Just removes unread newline input.
		
		//	Ask the user to input the information of Procedure 2.
		System.out.print("Please enter the Name of the 2nd Procedure: ");
		name = input.nextLine();
		System.out.print("Please enter the Date of the 2nd Procedure: ");
		date = input.nextLine();
		System.out.print("Please enter the Name of the Practitioner of the 2nd Procedure: ");
		practitioner = input.nextLine();
		System.out.print("Please enter the Charges of the 2nd Procedure: ");
		charges = input.nextDouble();
		gar = input.nextLine();
		
		//	Set the info of the 2nd Procedure.
		Procedure pr2 = new Procedure(name, date);
		pr2.setPractitioner(practitioner);
		pr2.setCharges(charges);
		
		//Ask the user to input the information of Procedure 3.
		System.out.print("Please enter the Name of the 3rd Procedure: ");
		name = input.nextLine();
		System.out.print("Please enter the Date of the 3rd Procedure: ");
		date = input.nextLine();
		System.out.print("Please enter the Name of the Practitioner of the 3rd Procedure: ");
		practitioner = input.nextLine();
		System.out.print("Please enter the Charges of the 3rd Procedure: ");
		charges = input.nextDouble();
		gar = input.nextLine();
		
		//	Set the information of the 3rd Procedure.
		Procedure pr3 = new Procedure(name, date, practitioner, charges);
		System.out.print("\n\n\n\n\n\n\n");
		displayPatient(p1);
		displayProcedure(pr1);
		displayProcedure(pr2);
		displayProcedure(pr3);
		System.out.println("Total Charges: " + calculateTotalCharges(pr1, pr2, pr3));
		System.out.print("\n");
		System.out.println("Student Name: Fernando Benitez-Diaz");
		System.out.println("MC#: 21141569");
		System.out.println("Due Date: 10/04/2024");
		input.close();
		
	}
	
	//	displayPatient: This method given a patient object will display patient’s information.
	public static void displayPatient(Patient p)
	{
		System.out.println("Patient Info:");
		System.out.println(p.toString());
		System.out.print("\n");
	}
	
	//	displayProcedure: This method given a procedure object will display procedure’s information.
	public static void displayProcedure(Procedure pr)
	{
		System.out.println(pr.toString());
		System.out.print("\n");
	}
	
	//	calculateTotalCharges: this method takes three procedures as parameter and returns the total charges of these procedures.
	public static double calculateTotalCharges(Procedure pro1, Procedure pro2, Procedure pro3)
	{
		double totalC;
		totalC = pro1.getCharges() + pro2.getCharges() + pro3.getCharges();
		return (totalC);
	}
}