import com.realtest.interview.CalculatorTS;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class CalculatorTest {

    CalculatorTS mycalc;

    @Before
    public void setup(){
        mycalc = new CalculatorTS();
    }

    @Test
    public void testCalc1(){
        int res = mycalc.calculate("1+1+100+1");
        Assert.assertEquals(103, res);
    }

    @Test
    public void testCalc2(){
        int res = mycalc.calculate("+1 -3 +10-2   +10");
        Assert.assertEquals(16, res);
    }

    @After
    public void tearDown(){
        mycalc = null;
    }

}
