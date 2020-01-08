import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        System.out.println("Среднее арифметическое: " + arithmeticalMean());
//        System.out.println("Факториал:" + calculateFactorial());
    }

    static double arithmeticalMean () {
        Scanner k = new Scanner(System.in);
        System.out.print("Введите пять целых чисел:");
        int num1 = k.nextInt();
        int num2 = k.nextInt();
        int num3 = k.nextInt();
        int num4 = k.nextInt();
        int num5 = k.nextInt();
        double average = (num1+num2+num3+num4+num5)/5;
        return average;
    }
//    static int calculateFactorial(){
//        Scanner n = new Scanner(System.in);
//        int b;
//        int fact = 1;
//        System.out.println("Введите натуральное число: ");
//        b = n.nextInt();
//        for (int i = 2; i<=n; i ++){
//            fact = fact*i;
//        }
//        return fact;
//    }

}
