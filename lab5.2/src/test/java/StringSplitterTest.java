import alyaseva.StringSplitter;
import org.junit.Assert;
import org.junit.Test;

public class StringSplitterTest {
    @Test
    public void testStringSplitter(){
        String input="My brother Andy is a very laaazy boy";
        String[] output=new String[]{
                "My","brother","Andy","is","a","very","laaazy","boy"
        };
        Assert.assertArrayEquals(output, StringSplitter.Split(input));
    }
    @Test
    public void test2StringSplitter(){
        String input="";
        String[] output = new String[]{

        };
        Assert.assertArrayEquals(output, StringSplitter.Split(input));
    }
}
