import java.util.*;

class User {
	static int id;
	static String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	

	
}
}
public class Employee{
	
	public Employee(double salary, Address address, Project project) {
		//super(id, name);
		this.salary=salary;
		this.address=address;
		this.project=project;
		
	}

	double salary;
	Address address;
	Project project;
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(new User(101,"luv"));
		arr.add(new Employee(1000,new Address("Delhi","120"),new Project(20,"Mail",2500)));
		arr.add(new Employee(2000,new Address("Banglore","150"),new Project(10,"Intel",5000)));
		
		Project p1=new Project(10,"Intel",2000);
		Project p2=new Project(20,"Mail",1500);
		Address add1=new Address("Delhi","120");
		Address add2=new Address("Mumbai","150");
		
		
		for(Object m:arr) {
			if(m instanceof Employee) {
				System.out.println("Hello");
			}
		}
	}

}

class Address {

	String city;
	String zip;

	Address(String city, String zip) {
		this.city = city;
		this.zip = zip;
	}
}

class Project {
	int projectId;
	String pname;
	double budget;

	Project(int projectId, String pname, double budget) {
		this.projectId = projectId;
		this.pname = pname;
		this.budget = budget;
	}
}