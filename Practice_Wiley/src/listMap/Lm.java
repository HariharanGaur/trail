package listMap;
import java.util.*;
public class Lm {

	public static void main(String[] args) {
		ArrayList<User> u=new ArrayList<>();
		u.add(new User(3,"User3"));
		u.add(new User(44,"User44"));
		u.add(new User(2,"User2"));
		
		ArrayList<Address> a3=new ArrayList<>();
		ArrayList<Address> a44=new ArrayList<>();
		ArrayList<Address> a2=new ArrayList<>();
		
		a3.add(new Address( "BLR", "560001" ));
		a3.add(new Address( "BLR", "560002" ));
		a44.add(new Address( "BLR", "560038" ));
		a3.add(new Address( "DEL", "110001" ));
		a44.add(new Address( "DEL", "110096" ));
		a44.add(new Address( "DEL", "110001" ));
		a2.add(new Address( "BOM", "400018" ));
		a2.add(new Address( "BOM", "400037" ));
		a2.add(new Address( "DEL", "110001" ));
		a2.add(new Address( "BLR", "560001" ));
		
		ArrayList<ArrayList<Address>> addr=new ArrayList<>();
		
		addr.add(a3);
		addr.add(a44);
		addr.add(a2);
		
		Map<User,ArrayList<Address>> fin=new TreeMap<>((u1,u2)->u2.name.compareTo(u1.name));
		
		fin.put(u.get(0), a3);
		fin.put(u.get(1),  a44);
		fin.put(u.get(2),  a2);

		System.out.println(fin);
	}

}

class User{
	int id;
	String name;
	public User(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override 
	public String toString() {
		return ""+this.id+" "+this.name;
	}
}
class Address{
	String city;
	String zip;
	public Address(String city,String zip) {
		this.city=city;
		this.zip=zip;
	}
	
	@Override
	public String toString() {
		return ""+this.city+" "+this.zip;
	}
}