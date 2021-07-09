package maps;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable();
		
		h.put(10, "Hello");
		h.put(20, "sur");
		h.put(30, "morning");
		
		
		//Set a=h.entrySet();//.forEach(System.out::print);
		System.out.println(h);
	}

}
