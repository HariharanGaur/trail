import java.util.*;

class empenter {
	int id, salary;
	String city;

	empenter(int id, int salary, String city) {
		this.city = city;
		this.id = id;
		this.salary = salary;
	}
}

public class Employee2 {
	public static void main(String[] args) {
		ArrayList<empenter> arr = new ArrayList<empenter>();
		arr.add(new empenter(101, 1200, "Bangalore"));
		arr.add(new empenter(103, 1000, "Delhi"));
		arr.add(new empenter(104, 1200, "Bangalore"));
		arr.add(new empenter(102, 1500, "Mumbai"));

		Collections.sort(arr, new comparingCity());

		for (Object m : arr) {
			empenter k = (empenter) m;
			System.out.println(k.city);
		}
		
		System.out.println("--------------");

		Collections.sort(arr, new comparingId());

		for (Object m : arr) {
			empenter k = (empenter) m;
			System.out.println(k.id);
		}

	}
}

class comparingCity implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		empenter emp1 = (empenter) o1;
		empenter emp2 = (empenter) o2;
		String c1 = emp1.city;
		String c2 = emp2.city;
		return c1.compareTo(c2);
	}

}

class comparingId implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		empenter emp1 = (empenter) o1;
		empenter emp2 = (empenter) o2;

		int id1 = emp1.id;
		int id2 = emp2.id;
		if (id1 > id2)
			return 1;
		else if (id2 > id1)
			return -1;
		else
			return 0;
	}

}