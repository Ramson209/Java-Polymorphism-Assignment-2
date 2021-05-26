
public class Staff
{
StaffMember[] staffList;

// sets up the list of staff members.

public Staff() {
	staffList=new StaffMember[8];
	
	staffList[0]= new Executive("Nii Odoi","234 Chorkor","233275010296","109206210014",50.50);
	staffList[1]= new Employee("Nii kwei","143 Mamprobi","233244352483","209137890653",30.50);
	staffList[2]= new Employee("Nii  Attoh","230 Korle Gonno","233203021750","305437890423",25.50);
	staffList[3]= new Hourly("Nii Addotey","567 Glefe","233235018292","498654104523",20.50);
	staffList[4]= new Volunteer("Nii Teiko","450 LanteyMaa","233206789450");
	staffList[5]= new Volunteer("Nii Addy","380 Lartebiokoshie","233235517379");
	staffList[6]= new Commission("Nii Kpakpo","280 Shiabu","233246893296","789345678906",7.84,0.5);
	staffList[7]= new Commission("Nii Afram","890 Agege","233244619142","690753421679",5.65,0.13);
	
	((Executive)staffList[0]).awardBonus (500.00);
	((Hourly)staffList[3]).addHours (40);
	((Hourly)staffList[3]).addHours (40);
	((Commission)staffList[6]).addHours (40);
	((Commission)staffList[7]).addHours (35);
	((Commission)staffList[6]).addSales (400);
	((Commission)staffList[7]).addSales (950);
	
}
//pay all staff members
public void payday () {
	double amount;
	
	for(int count=0;count < staffList.length;count++)
	{
		System.out.println(staffList[count]);
		
		amount = staffList[count].pay();
		
		if (amount==0.0)
			System.out.println("Thanks!");
		
		else 
			System.out.println("Paid: " + amount);
		
		System.out.println("--------------------");
	}
}

}
