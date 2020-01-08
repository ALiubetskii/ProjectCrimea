import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Введите пять целых чисел:");
        int num1 = k.nextInt();
        int num2 = k.nextInt();
        int num3 = k.nextInt();
        int num4 = k.nextInt();
        int num5 = k.nextInt();
        System.out.print("Среднее арифметическое: ");
        System.out.print((num1 + num2 + num3 + num4 + num5)/5);
    }

    public static void factorial (){
    }
    }
}
