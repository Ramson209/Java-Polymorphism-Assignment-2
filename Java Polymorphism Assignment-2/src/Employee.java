//represents a 	general paid employee.
public class Employee extends StaffMember
{
protected String SocialSecurityNumber;
protected double payRate;

//sets an employee with a specific information.

public Employee (String eName,String eAddress,String ePhone,String socSecNumber,double rate)
{
	super (eName,eAddress,ePhone);
	SocialSecurityNumber=socSecNumber;
	payRate=rate;
}

//returns information abaout employee

public String toString() {
	String result = super.toString();
	
	result +="\nSocial Security Number: " +SocialSecurityNumber;
	
	return result;
}

//returns the pay rate for this employee.

public double pay() {
	return payRate;
}

}
