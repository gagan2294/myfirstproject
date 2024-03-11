import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Areatest {

	@Test
	public void testarea() {
		
		assertEquals(25,Arearectangle.area(5,5));
        assertEquals(30,Arearectangle.area(5,6));
	}
}
