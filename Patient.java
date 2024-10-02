/*
 * Class: CMSC203 CRN 20931
 * Instructor: Khandan Monshi
 * Description: This class provides the constructors, accessors and mutators for the Patient class
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

public class Patient {
//	First name, middle name, and last name
	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
//	Street Address, city, state, and ZIP code
	private String street;
	private String city;
	private String state;
	private String zip;
//	Phone number (example 301-123-4567)
	private String number;
//	Name and phone number of emergency contact
	private String emergencyName;
	private String emergencyNumber;
	
	
	public Patient ()	//no-arg constructor
	{
		nameFirst = "No";
		nameMiddle = "Given";
		nameLast = "Name";
		
		street = "No";
		city = "Address";
		state = "Given";
		zip = "0";
		
		number = "No Number";
		
		emergencyName = "No Emergency ";
		emergencyNumber = "Contact Given";
	}
	
//	Parameterized constructor that initializes patient’s first, middle and last name to the given values
	public Patient (String f, String m, String l)	
	{		
		nameFirst = f;
		nameMiddle = m;
		nameLast = l;
	}
	
	// Parameterized constructor that initializes all attributes of the patient to the given values
	public Patient (String f, String m, String l, String s, String c, String st, String z, String num, String en, String eNum)
	{
		nameFirst = f;
		nameMiddle = m;
		nameLast = l;
		
		street = s;
		city = c;
		state = st;
		zip = z;
		
		number = num;
		
		emergencyName = en;
		emergencyNumber = eNum;
	}
	
	// Accessor for each attribute
	
//	Accessor for FIRST, MIDDLE, and LAST NAME
	public String getFirstName()	//Accessor for First Name
	{
		return(nameFirst);
	}
	public String getMiddleName()	//Accessor for Middle Name
	{
		return(nameMiddle);
	}
	public String getLastName()	//Accessor for Last Name
	{
		return(nameLast);
	}
//	Accessor for STREET, CITY, STATE, and ZIP CODE
	public String getStreet()	//Accessor for Street Address
	{
		return(street);
	}
	public String getCity()	//Accessor for City
	{
		return(city);
	}
	public String getState()	//Accessor for State
	{
		return(state);
	}
	public String getZip()	//Accessor for Zip Code
	{
		return(zip);
	}
//	Accessor for PHONE NUMBER	
	public String getNumber()	//Accessor for Phone Number
	{
		return(number);
	}
//	Accessor for EMERGENCY NAME and PHONE NUMBER
	public String getEmergencyName()	//Accessor for Emergency Contact Name
	{
		return(emergencyName);
	}
	public String getEmergencyNumber()	//Accessor for Emergency Contact Number
	{
		return(emergencyNumber);
	}
	
	// Mutator for each attribute
	
//	MUTATOR for FIRST, MIDDLE, and LAST NAME
	public void setFirstName(String f)	//Mutator for FIRST NAME
	{
		nameFirst = f;
	}
	public void setMiddleName(String m)	//Mutator for MIDDLE NAME
	{
		nameMiddle = m;
	}
	public void setLastName(String l)	//Mutator for LAST NAME
	{
		nameLast = l;
	}

//	MUTATOR for STREET, CITY, STATE, and ZIP CODE
	public void setStreet(String s)	//Mutator for STREET
	{
		street = s;
	}
	public void setCity(String c)	//Mutator for CITY
	{
		city = c;
	}
	public void setState(String st)	//Mutator for STATE
	{
		state = st;
	}
	public void setZipCode(String z)	//Mutator for ZIP CODE
	{
		zip = z;
	}
	
//	MUTATOR for PHONE NUMBER
	public void setNumber(String num)	//Mutator for PHONE NUMBER
	{
		number = num;
	}
	
//	MUTATOR for EMERGENCY CONTACT NAME and PHONE NUMBER
	public void setEmergencyName(String en)	//Mutator for EMERGENCY CONTACT NAME
	{
		emergencyName= en;
	}
	public void setEmergencyNumber(String eNum)	//Mutator for EMERGENCY CONTACT PHONE NUMBER
	{
		emergencyNumber= eNum;
	}
	
	/*	method name buildFullName that returns a String which is 
	 * 	the concatenation of first, middle and last name separated by space.
	*/
	public String buildFullName()
	{
		String fullName;
		fullName = nameFirst + " " + nameMiddle + " " + nameLast;
		return (fullName);
	}
	
	/*method named buildAddress that returns a String which is 
	 * the concatenation of address, city, state and zip separated by space. 
	 */
	public String buildAddress()
	{
		String address;
		address = street + " " + city + " " + state + " " + zip;
		return(address);
	}
	
	/*method named buildEmergencyContact that returns a String which is 
	 * the concatenation of emergency name and emergency phone separated by space.
	 */
	public String buildEmergencyContact()
	{
		String emergencyContact;
		emergencyContact = emergencyName + " " + emergencyNumber;
		return(emergencyContact);
	}
	
	/*toString method that display all information of a patient;
	 * use the above build methods in your toString method to display the information.
	 */
	public String toString()
	{
		String patientName = buildFullName();
		String address = buildAddress();
		String emergencyName = buildEmergencyContact();
		String patientInfo;
		patientInfo = "   Name: " + patientName + "\n   Address: " + address + "\n   EmergencyContact: " + emergencyName;
		return (patientInfo);
	}
}
