import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoftawreSalesTest {

	@Before
	public void setUp() throws Exception {
	}
// R1: Buy one software 
	public void testBuyOneSoftware() {
		
	}
	//R2 Buy 10-19 packages , get 20%
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBuy10Software() {
		SoftwareSales s = new SoftwareSales();
		double finalPrice =s.calculatePrice(12);
		assertEquals(950.4, finalPrice, 0);
		//r3 
		
	@Test
		public void testBuy10Software() {
			SoftwareSales s = new SoftwareSales();
			double finalPrice =s.calculatePrice(30);
			assertEquals(950.4, finalPrice, 0);
			
	}

}
	}

