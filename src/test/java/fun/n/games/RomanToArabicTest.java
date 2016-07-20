package fun.n.games;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void test() {
		assertTrue(convertArabicToRoman(1).equals("I"));
		assertTrue(convertArabicToRoman(2).equals("II"));
		assertTrue(convertArabicToRoman(3).equals("III"));

	}

	private String convertArabicToRoman(int arabic) {
		StringBuffer roman = new StringBuffer();

		int[] romanDenomninations = { 1000, 500, 100, 50, 10, 5, 1 };

		for (int countDown = 0; countDown < romanDenomninations.length; countDown++) {

			int currentRomanDenomination = romanDenomninations[countDown];
			System.out.println(currentRomanDenomination);

			if (arabic > (3 * currentRomanDenomination)) {
				System.out
						.println("Something wrong. The flow should not reach here.");
			} else {
				int howManyTimes = arabic / currentRomanDenomination;
				int remainder = arabic % currentRomanDenomination;
				System.out.printf("Arabic [%d] divide [%d] modulo [%d].\n",
						arabic, howManyTimes, remainder);

				String currentRomanSymbol = "I";

				for (int counter = 0; counter < howManyTimes; counter++) {
					roman.append(currentRomanSymbol);
				}

				if (remainder == 0) {
					break;
				}
			}
		}

		return roman.toString();
	}
}
