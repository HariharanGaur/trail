import java.util.*;
import java.util.stream.Collectors;
public class Streamss {
	
	int sid;
	String scity;
	Streamss(int sid,String scity){
		this.sid=sid;
		this.scity=scity;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(50);
		arr.add(21);
		arr.add(17);
		arr.add(45);
		System.out.println(arr+"\n----------");
		
		arr.stream().sorted((i,j)->i-j).forEach(i->System.out.print(i+" "));
		System.out.println("\n----------");
		
		List<Integer> divByFive=
				 arr.stream().filter(n->n%5==0).collect(Collectors.toList());
		
		System.out.println("Divisible by 5 "+divByFive+"\n----------");
		
		List<Streamss> streams=new ArrayList<>();
		streams.add(new Streamss(01,"s1"));
		streams.add(new Streamss(05,"s5"));
		streams.add(new Streamss(03,"s3"));
		
		List<A1> a=new ArrayList();
		a.add(new A1(55,"a55"));
		a.add(new A1(65,"a65"));
		
		for(Object m:a) {
			A1 k=(A1)m;
			System.out.print(k.name+" ");
		}
		System.out.println("\n------------\n");
		
		 a=streams.stream().map(stream->new A1(stream.sid,stream.scity)).collect(Collectors.toList());
		
		for(Object m:a) {
			A1 k=(A1)m;
			System.out.print(k.name+" ");
		}
	}

}

class A1{
	int id;
	String name;
	A1(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	A1(Streamss s){
		this.name=s.scity;
		this.id=s.sid;
		
	}
}