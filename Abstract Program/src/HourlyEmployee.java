
public class HourlyEmployee extends employee {
	private double hourlyWage;
	int hoursWorked;
	
//Constructor
	public HourlyEmployee(String firstname,String lastname,String jobtitle, double wage,int hours, int ID) {
		setfirstname(firstname);
		setlastname(lastname);
		setjobtitle(jobtitle);
		hoursWorked = hours;
		hourlyWage = wage;
		setID(ID);
	}
public double weeklyPay() {
	double pay = hoursWorked * hourlyWage;
	if (hoursWorked > 40) {
		pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
	}
	return pay;
}

}

	


