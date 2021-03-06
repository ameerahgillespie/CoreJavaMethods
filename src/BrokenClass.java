import java.util.Base64;
import java.util.Base64.Encoder;

/**
 * 
 */

/**
 * Sample Class for JUnit Testing
 */
public class BrokenClass {	
	
	/*
	 * Return true if String parameter 1 is equal to parameter 2. Ignoring case.
	 */
	public boolean isCardAMatch(String card1, String card2) {
		return card1.equalsIgnoreCase(card2);
	}
	
	/*
	 * Encodes string input parameter to Base64 encoding and
	 * returns value as a string.
	 * Input of "secret" should return c2VjcmV0.
	 */
	public String baseEncodeFileName(String fileName) {
		Encoder encoder = Base64.getEncoder();				
		String encodedBytes = encoder.encodeToString(fileName.getBytes());				
		return String.valueOf(encodedBytes+"s");
	}
	
	/*
	 * Return the int portion of a float input parameter
	 * that has been rounded up.
	 */
	public int roundUp(float input) {
		return Math.round(input);
	}
}