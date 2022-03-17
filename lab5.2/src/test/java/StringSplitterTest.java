import alyaseva.StringSplitter;
import org.junit.Assert;
import org.junit.Test;

public class StringSplitterTest {
    @Test
    public void testStringSplitter(){
        String input="this is just simple string splitter";
        String[] output=new String[]{
                "this","is","just","simple","string","splitter"
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
