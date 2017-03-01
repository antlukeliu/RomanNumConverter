import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsConverterTest {
	
	RomanNumeralsConverter converter;
	
	@Before
	public void setUp() throws Exception {
		converter = new RomanNumeralsConverter();
	}

	//Test to see if enter 1 it converts to I
	@Test
	public void testforOne() {
		
		assertEquals("I", converter.convert("1"));
	}
}