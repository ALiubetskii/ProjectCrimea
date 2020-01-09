import java.util.ArrayList;
import java.util.Scanner;



public class Part1 {
    public static void main(String[] args) {
        System.out.println("Среднее арифметическое: " + arithmeticalMean());
        System.out.println("Факториал:" + calculateFactorial());
        System.out.println("Введенное число четное: " + devidesByTwo());
    }

    static ArrayList<Integer> initArray() {
        Scanner k = new Scanner(System.in);
        System.out.print("Введите целые числа:");
        ArrayList numbers = new ArrayList();
        while (k.hasNextInt()){
            numbers.add(k.nextInt());
        }
        return numbers;
    }

    static int arithmeticalMean() {
        Integer[] toArray = null;
        toArray = initArray().toArray(new Integer[initArray().size()]);
        double average = 0;
        if (toArray.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < toArray.length; j++) {
                sum += toArray[j];
            }
            average = sum / toArray.length;
        }
        return (int) average;
    }
    static int calculateFactorial() {
        Scanner n = new Scanner(System.in);
        int b;
        int fact = 1;
        System.out.println("Введите натуральное число: ");
        b = n.nextInt();
        for (int i = 2; i <= b; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static boolean devidesByTwo() {
        int a;
        Scanner d = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        a = d.nextInt();
        return (a % 2 == 0);
    }

}
