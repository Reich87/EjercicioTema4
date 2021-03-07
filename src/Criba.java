import java.util.ArrayList;

public class Criba {

	public int[] generarPrimos(int maxValue) {
		if (maxValue < 2) {
			return new int[0];
		}
		
		int arraySize = maxValue + 1;

		boolean[] isPrimeArray = numbersChecker(arraySize);
		
		int arrayPrimeNumsSize = getSizePrimeArray(arraySize, isPrimeArray);

		int[] primeNumbers = new int[arrayPrimeNumsSize];

		for (int i = 0, j = 0; i < arraySize; i++) {
			if (isPrimeArray[i])
				primeNumbers[j++] = i;
		}
		return primeNumbers;

	}

	private int getSizePrimeArray(int arraySize, boolean[] arrayOfPrimes) {
		int cuenta = 0;
		for (int i = 0; i < arraySize; i++) {
			if (arrayOfPrimes[i])
				cuenta++;
		}
		return cuenta;
	}

	private boolean[] numbersChecker(int arraySize) {
		boolean[] arrayOfPrimes = new boolean[arraySize];
		arrayOfPrimes[0] = arrayOfPrimes[1] = false;
		
		for (int i = 2; i < arraySize; i++)
			arrayOfPrimes[i] = true;

		for (int i = 2; i < Math.sqrt(arraySize) + 1; i++) {
			if (arrayOfPrimes[i]) {
				for (int j = 2 * i; j < arraySize; j += i)
					arrayOfPrimes[j] = false;
			}
		}
		return arrayOfPrimes;
	}

}
