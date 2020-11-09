import java.util.Scanner;

public class Prime {

	private static Scanner scnr = new Scanner(System.in);
	static int n, i = 2, x = 2;

	public static void main(String[] args) {

		System.out.printf("This program calculates the nth Prime number\n");
		System.out.printf("Please enter the nth prime number you want to find:");
		System.out.println(findPrime(n = scnr.nextInt()));
	}

	public static int findPrime(int b) {
		for (i = 2, x = 2; n > 0; i++) {
			for (x = 2; x < i; x++) {
				if (i % x == 0) {
					break;
				}
			}
			if (x == i) {
				n--;
			}
		}
		return (x);
	}
}
