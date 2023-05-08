import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Set {

	public static void main(String[] args) {

		HashSet setA = new HashSet();
		LinkedHashSet setB = new LinkedHashSet();
		TreeSet setC = new TreeSet();

		setA.add("öğe 1");
		setA.add("öğe 2");
		setA.add("öğe 3");

		Iterator<String> iterator = setA.iterator();

		System.out.println("wile.....................");

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println("for1.....................");

		for (Object object : setA) {
			System.out.println((String) object);

		}
		System.out.println("stream.....................");

		Stream<String> stream = setA.stream();

		stream.forEach((element) -> {
			System.out.println(element);
		});

		System.out.println("forEach set.....................");
		HashSet set = new HashSet<>();
		HashSet set1 = new HashSet<>();
		HashSet set2 = new HashSet<>();

		set.add("one");
		set.add("two");
		set.add("three");
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set2.add("two");
		set2.add("four");
		set2.add("six");

		Stream<String> stream1 = set.stream();

		stream1.forEach((element) -> {
			System.out.println(element);
		});

		System.out.println("clear set.....................");

		set.clear();
		Stream<String> stream2 = set.stream();

		stream2.forEach((element) -> {
			System.out.println(element);
		});

		System.out.println("addAll set set1.....................");
		set.addAll(set1);
		Stream<String> stream3 = set.stream();

		stream3.forEach((element) -> {
			System.out.println(element);
		});

		System.out.println("remove set setn.....................");
		HashSet setn = new HashSet();
		setn.add("three");

		set.removeAll(setn);
		Stream<String> stream4 = set.stream();
		stream4.forEach((element) -> {
			System.out.println(element);
		});
		
		System.out.println("retainAll set set2.....................");
		

		set.retainAll(set2);
		Stream<String> stream5 = set.stream();
		stream5.forEach((element) -> {
			System.out.println(element);
		});
		System.out.println("size set set1 set2.....................");
		System.out.println(set.size()+" "+set2.size()+" "+set2.size());
		
		System.out.println(" set set1 set2 empty.....................");
		System.out.println(set.isEmpty()+" "+set2.isEmpty()+" "+set2.isEmpty());
		
		System.out.println(" set set1 set2 contains two.....................");
		System.out.println(set.contains("two")+" "+set2.contains("two")+" "+set2.contains("two"));
	
		System.out.println(" set set1 set2 contains null.....................");
		System.out.println(set.contains(null)+" "+set2.contains(null)+" "+set2.contains(null));
		
		System.out.println(" addAll set to list.....................");
		List<String> list = new ArrayList<>();
		list.addAll(set);
		System.out.println(list);
		
		System.out.println(" addAll set1 to list1.....................");
		List<String> list1 = new ArrayList<>();
		list1.addAll(set1);
		System.out.println(list1);
		
		System.out.println(set2);
		System.out.println(" addAll list1 to set2 .....................");
		
		set2.addAll(list1);
		System.out.println(set2);
	}

}
