//represents a staff memeber that works as a volunteer
public class Volunteer extends StaffMember
{
//sets a staff member using the specified information.
	
	public Volunteer (String eName,String eAddress,String ePhone) {
		super(eName,eAddress,ePhone);
	}
	//returns a zero pay value for this volunteer.

public double pay()
{
	return 0;
	}
}