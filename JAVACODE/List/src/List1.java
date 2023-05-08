import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class List1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("one");
		list.add("two");
		list.add("three");

		for (String element : list) {

			System.out.println("for " + element.toString());
		}

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element1 = iterator.next();
			System.out.println("while " + element1);
		}

		list.forEach((element) -> {
			System.out.println("forEach " + element);
		});

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(" " + obj);

		}
		List<String> listA = new ArrayList<>();
		List<String> listB = new ArrayList<>();
		List<String> listC = new ArrayList<>();
		List<String> listD = new ArrayList<>();

		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 3");
		System.out.println("listA: " + listA);
		Object element = null;
		listA.add((String) element);
		System.out.println("listA: " + listA);

		listA.add(0, "element 4");
		System.out.println("listA: " + listA);

		listA.add(3, "element 5");
		System.out.println("listA: " + listA);

		listB.add("123");
		listB.add("456");
		listB.add("789");
		listC.add("123");
		listC.add("789");
		listC.add("101");

		listA.addAll(listB);

		listA.add(4, "123");
		listA.add(2, "456");
		System.out.println("listA: " + listA);

		String element0 = listA.get(0);
		String element1 = listA.get(1);
		String element2 = listA.get(2);
		System.out.println("element0: " + element0);
		System.out.println("element1: " + element1);
		System.out.println("element2: " + element2);
		String element3 = "123";
		String element4 = "456";
		listA.add(element3);
		listA.add(element4);
		System.out.println("listA: " + listA);

		System.out.println("element3: " + element3);
		System.out.println("element4: " + element4);
		int index1 = listA.indexOf(element3);
		int index2 = listA.indexOf(element4);
		System.out.println("element3 index: " + index1);
		System.out.println("element4 index: " + index2);
		index1 = listA.lastIndexOf(element3);
		index2 = listA.lastIndexOf(element4);
		System.out.println("element3 last index: " + index1);
		System.out.println("element4 last index: " + index2);

		System.out.println("element1 contains in listA: " + listA.contains("element 1"));
		System.out.println("element4 contains in listA: " + listA.contains(element4));
		System.out.println("element6 contains in listA: " + listA.contains("element 6"));
		System.out.println("null contains in listA: " + listA.contains(null));
		listA.add(0, "element 0");
		listA.add(1, "element 1");
		listA.add(2, "element 2");
		element0 = "element 0";
		System.out.println("listA: " + listA);
		System.out.println("element0 remove ");
		listA.remove("element 0");
		System.out.println("listB: " + listB);
		System.out.println("listC: " + listC);

		listB.retainAll(listC);
		System.out.println("listB: " + listB);
		System.out.println("listC: " + listC);

		System.out.println("listA size: " + listA.size());
		System.out.println("listB size: " + listB.size());
		System.out.println("listC size: " + listC.size());

		List<String> sublist = listA.subList(1, 3);
		System.out.println("listA: " + listA);
		System.out.println("sublist (1,3): " + sublist);
		System.out.println("-------------------------------");
		System.out.println("convert list to set");
		Set<String> set = new HashSet<>();
		set.addAll(listA);
		System.out.println("listA: " + listA);
		System.out.println("set: " + set);

		System.out.println("-------------------------------");
		System.out.println("convert list to array");
		Object[] objects = listA.toArray();
		System.out.println("listA: " + listA);
		System.out.println("list of objects...........");

		for (Object i : objects) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nlistD: " + listD);

		String[] values = new String[] { "one", "two", "three" };
		System.out.println("values to listD: ");

		listD = (List<String>) Arrays.asList(values);
		System.out.println("listD: " + listD);

		System.out.println("\nlistC: " + listC);
		listC.clear();
		System.out.println("clear listC: " + listC);
		System.out.println("values to listc: ");
		listC = (List<String>) Arrays.asList(values);
		System.out.println("listC: " + listC);

		System.out.println("---------------Sort----------------");
		for (int i = 0; i < listA.size(); i++) {
			listA.remove(null);
		}
		System.out.println("listA: " + listA);
		Collections.sort(listA);
		System.out.println("listA: " + listA);

	}
}
