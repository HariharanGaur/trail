package Sort_assignment;
import java.util.*;

public class SortAssign {

	public static void main(String[] args) {

		List<Address1> ad=new ArrayList<Address1>();
		ad.add(new Address1("BLR","560001"));
		ad.add(new Address1("DEL","110001"));
		ad.add(new Address1("GN","201305"));
		
		List<User> u=new ArrayList<User>();
		u.add(new User(2,"User2",ad.get(1),ad.get(0)));
		u.add(new User(1,"User1",ad.get(2),ad.get(0)));
		u.add(new User(3,"User3",ad.get(2),ad.get(0)));
		
		System.out.println(ad);
		System.out.println(u);
		
		//List<List> fin=new ArrayList<>();
		
	}

}


class Address1{
	String city;
	String zip;
	
	public Address1(String city,String zip) {
		this.city=city;
		this.zip=zip;
	}
	
	@Override
	public String toString() {
		return ""+city+" "+zip;
	}
}


class User{
	int id;
	String name;
	Address1 address1;
	Address1 address2;
	
	User(int id,String name,Address1 address1,Address1 address2){
		this.id=id;
		this.name=name;
		this.address1=address1;
		this.address2=address2;
	}
	
	@Override
	public String toString() {
		return ""+id+" "+name+" "+address1+" "+address2;
	}
}