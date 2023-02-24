package util;

public class CurrencyConverter {

	public static double valorDollar;
	public static double quantidadeDollar;

	public static double percentagemTotal() {
		return valorDollar * quantidadeDollar * 6 / 100;
	}

	public static double valorTotalReais() {
		return valorDollar * quantidadeDollar + percentagemTotal();
	}

}

/*
 * package application;
 * 
 * import java.util.Locale; import java.util.Scanner;
 * 
 * import util.Calculator; import util.CurrencyConverter;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) {
 * 
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * 
 * System.out.printf("What is the dollar price?"); CurrencyConverter.valorDollar
 * = sc.nextDouble();
 * 
 * System.out.printf("How many dollars will be bougth?");
 * CurrencyConverter.quantidadeDollar = sc.nextDouble();
 * 
 * System.out.printf("Amount to be paid in reais = %.2f%n",
 * CurrencyConverter.valorTotalReais()); sc.close(); }
 * 
 * }
 */
