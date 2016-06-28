package fun.n.games;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.Test;

public class LitmusTest {

	public static final String TEST_INPUT_FILE_NAME = "/Users/parthabhattacharjee/code/javaEight/src/test/resources/LitmusTest001.testinput";

	@Test
	public void test() {

		// Read the test input
		// The file name should be an input

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths
				.get(TEST_INPUT_FILE_NAME))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// fail("Not yet implemented");
	}

}
