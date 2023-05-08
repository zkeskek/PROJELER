import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();

		list.add(new Car("Volvo V40", "XYZ 201845", 5));
		list.add(new Car("Citroen C1", "ABC 164521", 4));
		list.add(new Car("Dodge Ram", "KLM 845990", 2));

		Comparator<Car> carBrandComparator = new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.brand.compareTo(car2.brand);
			}
		};
		System.out.println("sort by brand.................");
		Collections.sort(list, carBrandComparator);

		Iterator<Car> iterator1 = list.iterator();
		while (iterator1.hasNext()) {
			Car next1 = iterator1.next();
			System.out.println(next1.brand + " " +next1.numberPlate + " " +  next1.noOfDoors);
		}

		Comparator<Car> carBrandComparatorLambda = (car1, car2) -> car1.brand.compareTo(car2.brand);
		
		Comparator<Car> carNumberPlatComparatorLambda = (car1, car2) -> car1.numberPlate.compareTo(car2.numberPlate);
		
		Comparator<Car> carNoOfDoorsComparatorLambda = (car1, car2) -> car1.noOfDoors - car2.noOfDoors;

		System.out.println("sort by brand................");
		Collections.sort(list, carBrandComparatorLambda);
		Iterator<Car> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Car next2 = iterator2.next();
			System.out.println(next2.brand + " " +next2.numberPlate + " " +  next2.noOfDoors);
		}
		
		System.out.println("sort by carNumberPlat................");
		Collections.sort(list, carNumberPlatComparatorLambda);

		Iterator<Car> iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			Car next3 = iterator3.next();
			System.out.println(next3.numberPlate + " " + next3.brand + " " + next3.noOfDoors);
		}
		
		System.out.println("sort by carNoOfDoors...............");

		Collections.sort(list, carNoOfDoorsComparatorLambda);

		Iterator<Car> iterator = list.iterator();
		while (iterator.hasNext()) {
			Car next = iterator.next();
			System.out.println(next.noOfDoors+ " " + next.numberPlate + " " + next.brand );
		}
			System.out.println("--------------------------------------------");

			for(Object element:list) {
				System.out.println(element);
			}
			System.out.println("--------------------------------------------");

			for(int i=0;i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		

	}
}
