import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		Locale locale = new Locale("en", "US");
		NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
		String us = fmt.format(payment);

		String india = us.substring(1);
		india = "Rs." + india;

		Locale locale2 = new Locale("zh", "CN");
		NumberFormat fmt2 = NumberFormat.getCurrencyInstance(locale2);
		String china = fmt2.format(payment);

		Locale locale3 = new Locale("fr", "FR");
		NumberFormat fmt3 = NumberFormat.getCurrencyInstance(locale3);
		String france = fmt3.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}

}
