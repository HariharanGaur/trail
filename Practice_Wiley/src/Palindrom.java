import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			l.set(1, 5);
			l.set(0, "first");
		}

	}

}
