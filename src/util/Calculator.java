package util;

public class Calculator {

	public static final double PI = 3.14159;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}

/*
 * package application;
 * 
 * import java.util.Iterator; import java.util.Locale; import java.util.Scanner;
 * 
 * import entities.Account;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) {
 * 
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * 
 * int n = sc.nextInt(); double[] vect = new double[n];
 * 
 * for (int i = 0; i < n; i++) { vect[i] = sc.nextDouble(); }
 * 
 * double sum = 0.0; for (int i = 0; i < n; i++) { sum += vect[i]; } double avg
 * = sum / n; System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
 * 
 * sc.close();
 * 
 * } }
 */
