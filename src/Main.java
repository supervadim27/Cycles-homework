// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание №1");
        task1();
        System.out.println();
        System.out.println("Задание №2");
        task2();
        System.out.println();
        System.out.println("Задание №3");
        task3();
        System.out.println();
        System.out.println("Задание №4");
        task4();
        System.out.println();
        System.out.println("Задание №5");
        task5();
        System.out.println();
        System.out.println("Задание №6");
        task6();
        System.out.println();
        System.out.println("Задание №7");
        task7();
        System.out.println();
        System.out.println("Задание №8");
        task8();
        System.out.println();
        System.out.println("Задание №9");
        task9();
        System.out.println();
        System.out.println("Задание №10");
        task10();

    }

    public static void task1(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void task2(){
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
    public static void task3(){
        for (int i = 0; i < 18; i=i+2) {
            System.out.println(i);
        }
    }
    public static void task4(){
        for (int i = 10; i > -11; i = --i) {
            System.out.println(i);
        }
    }
    public static void task5(){
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6(){
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
    }
    public static void task7(){
        for (int i = 1; i < 513; i = i + i) {
            System.out.println(i);
        }
    }
    public static void task8(){
        int cashPerMounth = 29000;
        for (int m = 1; m <= 12; m++) {
            int total = m * cashPerMounth;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9(){
        double cashPerMounth = 29000;
        for (int m = 1; m <= 12; m++) {
            double total = m * (cashPerMounth/100+cashPerMounth);
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task10(){
        for (int i = 1; i <= 10; i++) {
            int count = 2 * i;
            System.out.println("2*" + i + "=" + count);
        }
    }
}