package alyaseva;

public class TestClass {
    public TestClass() {

    }

    public static int countOfNotBinaryes(String a) throws Exception {
        TestClass.exceptNull(a, "String");
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i)!='0' && a.charAt(i)!='1' && Character.isDigit(a.charAt(i)))
                count++;
        }
        return count;
    }
    public static <T> void exceptNull(T arg, String obj) throws Exception{
        if (arg == null){
            throw new Exception(obj +" cannot be null");
        }
    }

    public static <T> void exceptNull(T[] arg, String obj) throws Exception{
        if (arg == null){
            throw new Exception(obj +" array cannot be null");
        }
        for (int i = 0; i < arg.length; i++){
            TestClass.exceptNull(arg[i], obj);
        }
    }
    public String biggestStringOfTwo(String[] s_arr1, String[] s_arr2) throws Exception {

        TestClass.exceptNull(s_arr1, "String");
        TestClass.exceptNull(s_arr2, "String");

        String largest = s_arr1[0];
        for (int i = 0; i < s_arr1.length; i++) {
            if(s_arr1[i].length() > largest.length())
                largest=s_arr1[i];
        }
        for (int i=0; i < s_arr2.length; i++) {
            if(s_arr2[i].length() > largest.length())
                largest = s_arr2[i];
        }
        return largest;
    }
}
