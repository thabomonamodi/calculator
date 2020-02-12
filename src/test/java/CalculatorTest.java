import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest
{
    Calculator calc = new Calculator();

    @Test
    public void addTest()
    {
        Assert.assertEquals(calc.add(1,3),4);
    }
    @Test
    public void multiplyTest()
    {
        Assert.assertEquals(calc.multiply(-1,3),-3);
    }
}
