package exercises.java;

public class Exercise51 {

	public static void main(String[] args) {
		DataObject[] dataObjects = new DataObject[5];

		dataObjects[0].count = 5;
		dataObjects[0].code = "friyday";

		dataObjects[1].count = 7;
		dataObjects[1].code = "friyday";

		dataObjects[2].count = 9;
		dataObjects[2].code = "saturday";

		dataObjects[3].count = 11;
		dataObjects[3].code = "saturday";

		dataObjects[4].count = 13;
		dataObjects[4].code = "saturday";

		int sum = 0;

		for (int i = 0; i < dataObjects.length; i++) {
			if ("friyday".equals(dataObjects[i].code))
				sum = sum + dataObjects[i].count;
			System.out.println(dataObjects[i] + " " + i + " " + dataObjects[i].count + " " + sum);
		}
		System.out.println("Sum= " + sum);

	}

}
