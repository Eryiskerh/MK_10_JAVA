import alyaseva.TestClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClassTester {
    private TestClass tc;
    public void testCountOfNotBinaryes(String arg, int answ) throws Exception{
        Assert.assertEquals(answ, TestClass.countOfNotBinaryes(arg));
    }
    @Before
    public void CreateInstances(){
        tc = new TestClass();
    }
    @Test
    public void testCountOfNotBinaryes() throws Exception {
        String[] testArray= new String[]{
                "test",
                "010102",
                "010111010101",
                "",
                "0101050101044444"
        };
        int[] testAnswers = new int[]{
                0,
                1,
                0,
                0,
                6
        };

        for(int i=0; i<testArray.length; i+=3)
        {
            testCountOfNotBinaryes(testArray[i],testAnswers[i]);
        }
    }
    @Test
    public void testIsContainsDigit() throws Exception {
        String[] testStrings = new String[]{
                "string 1",
                "test string",
                "123", "test",
                "010102",
                "010111010101",
                "",
                "0101050101044444"
        };
        String[] testStrings2 = new String[]{
                "string 1",
                "test string",
                "123", "test",
                "010102",
                "010111010101",
                "",
                "010105010sdvbdfsgdsdfgsdfg1044444"
        };
        String answer = "010105010sdvbdfsgdsdfgsdfg1044444";
        Assert.assertEquals(answer, tc.biggestStringOfTwo(testStrings, testStrings2));
    }
}
