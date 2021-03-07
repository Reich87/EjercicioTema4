
public class Printer {
	public void toPrintInitialVector(int maxValue) {
		System.out.println("\nVector inicial hasta :" + maxValue);
		
		for (int i = 1; i <= maxValue; i++) {
			System.out.print(i + "\t");
			if (i % 10 == 0)
				System.out.println();
		}
	}
	
	public void toPrintPrimeNums(int[] primeNumbers, int maxValue) {
		System.out.println("\nVector de primos hasta:" + maxValue);

		for (int i = 0; i < primeNumbers.length; i++) {
			if (i % 10 == 0)
				System.out.println();
			System.out.print(primeNumbers[i] + "\t");
		}
	}
}
