
public class SalariedEmployee extends employee {

	private double annualSalary;

	public SalariedEmployee(String firstname, String lastname, String jobtitle, double salary, int ID) {
		setfirstname(firstname);
		setlastname(lastname);
		setjobtitle(jobtitle);
		annualSalary = salary; 
		setID(ID);
	}
	public double weeklyPay() {
		final int week_per_year = 52;
		return annualSalary / week_per_year;
	}


}
