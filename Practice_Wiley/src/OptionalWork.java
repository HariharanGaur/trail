import java.util.Optional;

public class OptionalWork {

	public static void main(String[] args) {
		Optional<Integer> o=Optional.of(new Integer(10));
		System.out.println(o.get());
	}

}
