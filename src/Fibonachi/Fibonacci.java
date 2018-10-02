package Fibonachi;

public class Fibonacci {

	static void printFibonacci(int count) {
		if (count <= 0) {
			System.out.print("Please enter value greater than 0");
		} else {
			int[] n = new int[count];
			n[0] = 0;
			if (count > 1) {
				n[1] = 1;
				for (int i = 2; i < count; i++) {
					n[i] = n[i - 1] + n[i - 2];
				}
			}
			for (int i = 0; i < count; i++)
				System.out.print(n[i] + " ");

		}

	}

	public static void main(String args[]) {
		int count = 3;

		printFibonacci(count);

	}

}
