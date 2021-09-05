
public abstract class employee {
// instance variables
private int ID;
private  String jobtitle;
private String firstname;
private String lastname;

 
//constructor
public employee() {
	this.ID = ID;
	this.jobtitle = jobtitle;
	this.firstname = firstname;
	this.lastname = lastname;
}
public employee(String name, String jobtitle, int ID) {

	this.ID = ID;
	this.jobtitle = jobtitle;
	this.firstname = firstname;
	this.lastname = lastname;
	
}
//getters and setters
public int getID() {
	return ID; 
}
public void setID(int ID) {
	this.ID = ID;
}
public String getjobtitle() {
	return jobtitle;
}
public void setjobtitle(String jobtitle) {
	this.jobtitle = jobtitle;
}

public String getfirstname() {
	return firstname;
}
public void setfirstname(String firstname) {
	this.firstname = firstname; 
}
public String getlastname() {
	return lastname;
}
public void setlastname(String lastname) {
	this.lastname = lastname;
}

//methods 
 abstract public double weeklyPay();




 
 
 
 
}
