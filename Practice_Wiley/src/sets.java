import java.time.Instant;
import java.util.*;

public class sets {

	public static void main(String[] args) {

		User obj1 = new User(1, "Adam");
		User obj2 = new User(2, "User2");

		Set<Object> s = new TreeSet<>(new SortByIntUserIDString());
		s.add((new Integer(2)));
		s.add((new Integer(1)));
		s.add((obj2));
		s.add((obj1));
		s.add((new String("Hi")));
		s.add((new String("Hello")));
		
		System.out.println(s);
	}

}


class User {

	private int id;
	private String name;
	
	public User(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	  @Override 
	  public String toString() { 
		  return id+"-"+name; 
		 }
	 
	

	
	
	 
}

class SortByIntUserIDString implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer) {
			if(o2 instanceof Integer)
				return (int)o1-(int)o2;
			else
				return -1;
		}
		else if(o1 instanceof User) {
			if(o2 instanceof User)
				return new SortByUserID().compare((User)o1,(User)o2);
			else
				return -1;
		}
		else if(o1 instanceof String){
			if(o2 instanceof String)
				return o1.toString().compareTo(o2.toString());
			else
				return 1;
		}
		return 0;
	}
	
}

class SortByUserID implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}

/*
 * class compareWork implements Comparator<Object>{ public int compare(Object
 * o1, Object o2) {
 * 
 * if(o1 == null || o2 == null){ return -1; }
 * 
 * if(o1 instanceof String){
 * 
 * if(o2 instanceof String){ String str1 = (String)o1; String str2 = (String)o2;
 * return str1.compareTo(str2); } else if(o2 instanceof sets) { String str =
 * (String)o1; sets u = (sets)o2; return str.compareTo(u.name); } else if(o2
 * instanceof Integer){ return -1; } return 0; }
 * 
 * else if(o1 instanceof sets) {
 * 
 * if(o2 instanceof sets) { sets u1 = (sets)o1; sets u2 = (sets)o2; return
 * u1.name.compareTo(u2.name); } else if(o2 instanceof String) { String str =
 * (String)o2; sets u = (sets)o1; return u.name.compareTo(str); }
 * 
 * else if(o2 instanceof Integer) return -1;
 * 
 * return 0; }
 * 
 * else if(o1 instanceof Integer){
 * 
 * if(o2 instanceof Integer){ int i = (int)o2; int j = (int)o1; return j - i;
 * }else if(o2 instanceof String || o2 instanceof sets){ return 1; } return 0; }
 * 
 * return 0; } }
 */