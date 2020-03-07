import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("CU");
		list.add("Rosimaria");
		list.add("Stebam");
		list.add("Swag");
		list.add(2,"Xonatas");
		
		list.removeIf(ronaldo->ronaldo.charAt(0)=='C');
		for(String a:list) {
			System.out.println(a);
		}
		list.add(1,"KAKA");
		System.out.println("index of Stebam = "+list.indexOf("aeaee"));
		
		List<String> alfaA = list.stream().filter(x->x.charAt(0)=='S').collect(Collectors.toList());
		for(String a: alfaA) {
			System.out.println(a);
		}
		String name = list.stream().filter(x->x.charAt(0)=='S').findFirst().orElse(null);
		System.out.println(name);
		

	}

}
