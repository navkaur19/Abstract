
public class Manager extends SalariedEmployee {
	private double weeklyBonus ;
	
	public Manager (String firstname,String lastname, String jobtitle, double salary, double bonus, int ID) {
		super(firstname,lastname,jobtitle, salary, ID);
		weeklyBonus = bonus; 
		setID(ID);
		
	}
	public double weeklyPay() {
		return super.weeklyPay() + weeklyBonus;
	}
}
