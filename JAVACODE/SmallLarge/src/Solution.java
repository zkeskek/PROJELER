import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		String[] xyz = new String[s.length() - k+1];

		for (int i = 0; i <= (s.length() - k); i++) {
			xyz[i] = s.substring(i, i + k);

			for (int j = 0; j < k; j++) {
				if (xyz[i].charAt(j) >= largest.charAt(j)) {
					if (xyz[i].charAt(j) == largest.charAt(j)) {
						continue;
					}
					largest = xyz[i];
					break;
				} else
					break;
			}
			for (int j = 0; j < k; j++) {
				if (xyz[i].charAt(j) <= smallest.charAt(j)) {
					if (xyz[i].charAt(j) == smallest.charAt(j)) {
						continue;
					}
					smallest = xyz[i];
					break;
				} else
					break;
			}
		}

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}