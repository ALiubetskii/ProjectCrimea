import java.util.ArrayList;
import java.util.Arrays;

public class Part2 {

    public static void main(String[] args) {
        System.out.println(goods());
    }

    static String[] goods () {
        String [][] arr = new String[3][3];

        arr [0][0] = "1";
        arr [0][1] = "Колбаса сыровяленная";
        arr [0][2] = "0025";

        arr [1][0] = "2";
        arr [1][1] = "Изюм без косточек";
        arr [1][2] = "0050";

        arr [2][0] = "3";
        arr [2][1] = "Средство моющее \"Sorti\"";
        arr [2][2] = "1005";


    }

//    static int checkGoods () {
////        Scanner input = new Scanner(System.in);
////        System.out.println("Введите код товара: ");
////        String num1 = input.next();
//        return Arrays.asList(goods()).indexOf("0025");
//    }
}
