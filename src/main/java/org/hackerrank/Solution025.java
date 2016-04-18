package org.hackerrank;

import java.util.Scanner;

public class Solution025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int NUM_OF_TESTCASES = sc.nextInt();
		if (NUM_OF_TESTCASES < 0 || NUM_OF_TESTCASES > 500)
			return;

		for (int testCase = 0; testCase < NUM_OF_TESTCASES; testCase++) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int n = sc.nextInt();

			if (a < 0 || a > 50)
				return;
			if (b < 0 || b > 50)
				return;
			if (n < 1 || n > 15)
				return;

			int seriesItem = a;
			for (int posInSeries = 0; posInSeries < n; posInSeries++) {
				seriesItem += (Math.pow(2, posInSeries) * b);
				System.out.printf("%d ", seriesItem);
			}
			System.out.println("");
		}

		sc.close();
	}
}
