import java.util.Arrays;

public class Part3 {

    static int [] arr2 = {1, 85, 12, 43};
    public static void main(String[] args) {

        System.out.println(arrToString());
        System.out.println(strToArray());

    }

    static String arrToString () {
        String o = Arrays.toString(arr2);
        return o;
    }

    static char[] strToArray () {
        char[] result = arrToString().toCharArray();
        return result;
    }

}
