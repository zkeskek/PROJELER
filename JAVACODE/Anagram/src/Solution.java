import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		boolean anagram = false;
		a.toLowerCase();
		b.toLowerCase();
		char[] a1 = new char[a.length()];
		char[] b1 = new char[b.length()];
		for (int i = 0; i < a.length(); i++) {
			a1[i] = (a.charAt(i));
		}
		for (int i = 0; i < b.length(); i++) {
			b1[i] = (b.charAt(i));
		}

		for (int i = 0; i < a1.length; i++) {
			for (int j = i; j < a1.length; j++) {
				if (a1[i] > a1[j]) {
					char x = a1[i];
					a1[i] = a1[j];
					a1[j] = x;
				}
			}
		}
		for (int i = 0; i < b1.length; i++) {
			for (int j = i; j < b1.length; j++) {
				if (b1[i] > b1[j]) {
					char x = b1[i];
					b1[i] = b1[j];
					b1[j] = x;
				}
			}
		}
		String as="";
		String bs=as;
		for (int i = 0; i < b1.length; i++) {
			as=as+a1[i];
			bs=bs+b1[i];
		}
		
		
		System.out.println(as);
		System.out.println(bs);
		
		if (as.equals(bs)) {
			anagram = true;
		}

		return anagram;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}