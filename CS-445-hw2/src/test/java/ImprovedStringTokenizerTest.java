package test.java;

import org.junit.jupiter.api.Test;
import main.java.ImprovedStringTokenizer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;


public class ImprovedStringTokenizerTest {
	private static final String token;
	private static final ArrayList<String> expectedTokenizedArrayOutput;
	
	static {
		token = "This class is very hard";	
		
		expectedTokenizedArrayOutput = new ArrayList(5);
		expectedTokenizedArrayOutput.add("This");
		expectedTokenizedArrayOutput.add("class");
		expectedTokenizedArrayOutput.add("is");
		expectedTokenizedArrayOutput.add("very");
		expectedTokenizedArrayOutput.add("hard");
	}
	
	@Test
	void tesForTokenizedArray() {
		ImprovedStringTokenizer impprovedStringTokenizer = new ImprovedStringTokenizer(token);
		ArrayList<String> arrayToken = impprovedStringTokenizer.getTokenizedArray();
		assertEquals(expectedTokenizedArrayOutput, arrayToken);
		
	}
}