public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 1.2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 1.3");

        for (int i = 1; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Задача 1.4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 2.1");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 2.2");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 2.3");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 3.1");

        double summTotal = 0;
        double summ = 29000;

        for (int i = 1; i <= 12; i++) {
            summTotal = summTotal + summ;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summTotal + " рублей.");
        }

        System.out.println();
        System.out.println("Задача 3.2");

        summTotal = 0;
        summ = 29000;

        for (int i = 1; i <= 12; i++) {
            summTotal = summTotal + summ + (summTotal * 0.01);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", summTotal) + " рублей.");
        }
    }
}