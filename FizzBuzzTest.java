import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	//R1 : RETURN FIZZ IF DIVISBLE BY 3
	 

	@Test
	public void testDvisibleBy3() {
		FizzBuzz b = new FizzBuzz();
		// choose any number that is divisible by 3
		String result = b.buzzz(27);
		assertEquals("fizz", result);
	}
	
}
