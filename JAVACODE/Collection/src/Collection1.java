import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection1 {

	public static void main(String[] args) {

		Set<Object> set = new HashSet<Object>();
		List<Object> list = new ArrayList<Object>();

		MyCollectionUtil.doSomething(set);
		MyCollectionUtil.doSomething(list);

		String element = "an element";
		Collection<String> collection = new HashSet<String>();
		System.out.println(collection);

		collection.add(element);
		System.out.println(collection);

		boolean d = collection.add("hello");
		System.out.println(collection);

		Collection collection1 = new HashSet();
		boolean containsElement = collection1.contains("an element");

		Collection elements = new HashSet();
		boolean containsAll = collection1.containsAll(elements);

		boolean wasElementRemoved = collection1.remove("an element");
		System.out.println(collection1);

		Collection<String> colA = new ArrayList<String>();
		Collection<String> colB = new ArrayList<String>();
		System.out.println("colA: " + colA);
		System.out.println("colB: " + colB);

		colA.add("A");
		colA.add("B");
		colA.add("C");
		System.out.println("colA: " + colA);

		colB.add("1");
		colB.add("2");
		colB.add("3");
		System.out.println("colB: " + colB);

		Collection<String> target = new HashSet<String>();
		System.out.println("target: " + target);
		System.out.println("target size: " + target.size());

		target.addAll(colA); // target now contains [A,B,C]
		System.out.println("target: " + target);
		System.out.println("target size: " + target.size());

		target.addAll(colB); // target now contains [A,B,C,1,2,3]
		System.out.println("target: " + target);
		System.out.println("target size: " + target.size());

		boolean contains1 = target.contains("an element");
		System.out.println("contains1: " + contains1);
		System.out.println("target size: " + target.size());

		boolean containsAll1 = target.containsAll(colA);
		System.out.println("containsAll1: " + containsAll1);
		System.out.println("target size: " + target.size());

		target.retainAll(colB); // target now contains [1,2,3]
		System.out.println("target: " + target);
		System.out.println("target size: " + target.size());

		target.retainAll(colA); // target now contains [1,2,3]
		System.out.println("target: " + target);
		System.out.println("target size: " + target.size());

		System.out.println("collection size: " + collection.size());
		System.out.println("collection1 size: " + collection1.size());
		System.out.println("colA size: " + colA.size());
		System.out.println("colB size: " + colB.size());

		List<String> liste = new ArrayList<>();
		Collections.addAll(colA);
		System.out.println("liste: " + liste);
		System.out.println("liste size: " + liste.size());
		liste.addAll(colB);
		System.out.println("liste: " + liste);
		System.out.println("liste size: " + liste.size());
		liste.add("one");
		liste.add("two");
		liste.add("three");
		liste.add("four");
		liste.add("five");
		System.out.println("liste: " + liste);
		int index = Collections.binarySearch(liste, "four4");
		
		System.out.println("liste size: " + liste.size());

		
		System.out.println("four index: " + index);

		Collections.sort(liste);
		System.out.println("liste: " + liste);
		System.out.println("liste size: " + liste.size());

		index = Collections.binarySearch(liste, "four4");
		System.out.println("four index: " + index);
		
		Collections.reverse(liste);
		System.out.println("liste: " + liste);
		
		Collections.shuffle(liste);
		System.out.println("liste: " + liste);

		Collections.shuffle(liste);
		System.out.println("liste: " + liste);
		
		String min = (String) Collections.min(liste);
		System.out.println("min: " + min);

		String max = (String) Collections.max(liste);
		System.out.println("max: " + max);
		
		Collections.replaceAll(liste, "one", "bir");
		System.out.println("liste: " + liste);
		
		
		
		List<String> normalSet = new ArrayList<>();

		
		normalSet.add("asd");
		System.out.println("normalSet: " + normalSet);
		Collections.replaceAll(normalSet, "asd", "dsa");
		System.out.println("normalSet: " + normalSet);

	}

}
