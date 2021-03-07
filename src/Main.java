import java.util.Scanner;

public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {
		Criba criba = new Criba();
		Printer printer = new Printer();
		scanner = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero para la criba de Erast�tenes:");
		int userInputValue = scanner.nextInt();
		
		printer.toPrintInitialVector(userInputValue);
		int[] primeNumbers = criba.generarPrimos(userInputValue);
		printer.toPrintPrimeNums(primeNumbers, userInputValue);
	}
}
