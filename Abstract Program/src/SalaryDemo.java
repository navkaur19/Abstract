import java.util.ArrayList;
import java.util.Scanner;
public class SalaryDemo  {

	public static void main(String[] args) {
		ArrayList<employee> staff = new ArrayList<employee>();
		staff.add(new Manager ("James", "Potter", "Manager" ,67000.0, 450.0, 1256));
		staff.add(new SalariedEmployee("Lilly", "Potter", "SalariedEmployee",63000.0, 6578));
		staff.add(new HourlyEmployee("Harry", "Potter", "HourlyEmployee", 34.0, 38, 4670));
		
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		
		 do{
		System.out.println("Payroll Menu:");
		System.out.println("1 - Add new employee");
		System.out.println("2 - Display all employees.");
		System.out.println("3 - Search for employee (by ID)");
		System.out.println("4 - Search by job title");
		System.out.println("5 - Remove employee (by ID)");
		System.out.println("6 - Exit");
		
		choice = input.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("1,2, or 3? One is for Manager, Two is for SalariedEmployee, and Three is for HourlyEmployee.");
			int in = input.nextInt();
			if (in == 1) {
				System.out.println("Enter first name");
				String fname = input.next();
				System.out.println("Enter last name");
				String lname = input.next();
				System.out.println(" Enter jobtitle ");
				String jt = input.next();
				System.out.println("Enter annual salary ");
				double as = input.nextDouble();
				System.out.println("Enter bonus");
				double b = input.nextDouble();
				System.out.println("Enter ID");
				int i = input.nextInt();
				staff.add(new Manager(fname,lname,jt,as,b,i));
			}
			else if (in == 2) {
				System.out.println("Enter first name");
				String fname = input.next();
				System.out.println("Enter last name");
				String lname = input.next();
				System.out.println(" Enter jobtitle ");
				String jt = input.next();
				System.out.println("Enter annual salary ");
				double as = input.nextDouble();
				System.out.println("Enter ID");
				int i = input.nextInt();
				staff.add(new SalariedEmployee(fname,lname,jt,as,i));
			}
			else if (in == 3) {
				System.out.println("Enter first name");
				String fname = input.next();
				System.out.println("Enter last name");
				String lname = input.next();
				System.out.println(" Enter jobtitle ");
				String jt = input.next();
				System.out.println("Enter wage");
				double w = input.nextDouble();
				System.out.println("Enter hours worked");
				int ih = input.nextInt();
				System.out.println("Enter ID");
				int i = input.nextInt();
				staff.add(new HourlyEmployee(fname,lname,jt,w,ih,i));
			}
		
							
			break;
		
		case 2: 
			for(int i=0;i<staff.size();i++) {
				System.out.printf("%-3d,%1s,%3s,%s,%10f\n",staff.get(i).getID(),staff.get(i).getfirstname(),staff.get(i).getlastname(),staff.get(i).getjobtitle(),staff.get(i).weeklyPay() );
				System.out.println();
				}
			break;
			
		case 3: 
			System.out.println("Enter an ID number to search: ");
			boolean found = false;
			int idSearch = input.nextInt();
			for (int i=0;i<staff.size();i++) {
				if (staff.get(i).getID() == idSearch) {
					System.out.printf("%-3d,%1s,%3s,%s,%10f\n",staff.get(i).getID(),staff.get(i).getfirstname(),staff.get(i).getlastname(),staff.get(i).getjobtitle(),staff.get(i).weeklyPay() );
					System.out.println();	 
					found = true;
				}
			}
			if (!found) {
				System.out.println("ID entry not found!");
			}
			break;
		case 4:
			System.out.println("Enter jobtitle to search");
			boolean found1 = false;
			String jobsearch = input.next();
			for (int i =0;i<staff.size();i++) {
				if (staff.get(i).getjobtitle().equals(jobsearch)) {
					System.out.printf("%-3d,%1s,%3s,%s,%10f\n",staff.get(i).getID(),staff.get(i).getfirstname(),staff.get(i).getlastname(),staff.get(i).getjobtitle(),staff.get(i).weeklyPay() );
					System.out.println();
					found1 = true; 
				}
			}
			if (!found1) {
				System.out.println("No search results");
			}
			break;
		case 5: 
			System.out.println("Enter an ID number to delete: ");
			int idSearch2 = input.nextInt();
			boolean found3 = false;
			for (int i=0;i<staff.size();i++) {
				if (staff.get(i).getID() == idSearch2) {
					staff.remove(i);
					System.out.println("Entry deleted.");
					System.out.println();	 
					found3 = true;
				}
			}
			if (!found3) {
				System.out.println("Employee not found!");
			}
			break;
	 } 
		
	} while(choice != 6);
	
	
	}

	

}
