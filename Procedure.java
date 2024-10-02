/*
 * Class: CMSC203 CRN 20931
 * Instructor: Khandan Monshi
 * Description: This class provides the constructors, accessors and mutators for the Procedure class
 * and can change the values depending on the users inputs or usage of accessors or mutators.
 * Due: 10/04/2024
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Fernando Benitez-Diaz
*/

package Assignment2;

public class Procedure {

	private String name;	//	Name of the procedure
	private String date;	//	Date of Procedure
	private String practitioner;	//	Name of Practitioner
	private double charges;	// Charges for the Procedure
	
	//	no-arg constructor
	public Procedure()
	{
		name = "No Procedure Name Given";
		date = "No Procedure Date Given";
		practitioner = "No Procedure Practitioner Given";
		charges = 0;
	}
	
	//	Parametrized constructor that initializes procedure’s name and date to the given values
	public Procedure (String n, String d)
	{
		name = n;
		date = d;
	}
	
	//	Parametrized constructor that initializes all attributes of the procedure to the given values
	public Procedure (String n, String d, String dr, double c)
	{
		name = n;
		date = d;
		practitioner = dr;
		charges = c;
	}
	
	//	Accessor for each attribute
	public String getName ()	//	ACCESSOR for PROCEDURE NAME
	{
		return (name);
	}
	public String getDate ()	//	ACCESSOR for PROCEDURE DATE
	{
		return (date);
	}
	public String getPractitioner ()	//	ACCESSOR for PROCEDURE PRACTITIONER NAME
	{
		return (practitioner);
	}
	public double getCharges ()	//	ACCESSOR for PROCEDURE CHARGES
	{
		return (charges);
	}
	
	//	Mutator for each attribute 
	public void setName (String n)	//	MUTATOR for PROCEDURE NAME
	{
		name = n;
	}
	public void setDate (String d)	//	MUTATOR for PROCEDURE DATE
	{
		date = d;
	}
	public void setPractitioner (String dr)	//	MUTATOR for PROCEDURE PRACTITIONER
	{
		practitioner = dr;
	}
	public void setCharges (double c)	//	MUTATOR for PROCEDURE CHARGES
	{
		charges = c;
	}
	
	//toString method that display all information of a procedure
	public String toString ()
	{
		String procedureInfo;
		procedureInfo = "\tProcedure: " + name + "\n\tProcedure Date: " + date + "\n\tPractitioner: " + practitioner + "\n\tCharge: " + charges;
		return(procedureInfo);
	}
}