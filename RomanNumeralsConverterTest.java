import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralsConverterTest {
  @Test
  public void evaluatesExpression() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    int sum = converter.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}