package org.hackerrank;

import java.util.Scanner;

public class Solution020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s = sc.next();
			int i1 = sc.nextInt();
			System.out.printf("%-15s%03d\n", s, i1);
		}
		System.out.println("================================");
	}
}
