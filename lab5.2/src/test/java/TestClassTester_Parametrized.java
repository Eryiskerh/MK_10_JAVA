import alyaseva.TestClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestClassTester_Parametrized {
    private String arg;
    private int answ;
    public TestClassTester_Parametrized(String arg, int answ){
        this.arg=arg;
        this.answ=answ;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"another test", 0},
                {"test with one digit 4", 1},
                {"00101010101", 0},
                {"543", 3},
                {"51016", 2}
        });
    }

    @Test
    public void testMethod1() throws Exception{
        Assert.assertEquals(answ, TestClass.countOfNotBinaryes(arg));
    }
}
