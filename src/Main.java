public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month += 1;
            total = total + contribution;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        var year = 0;
        var total = 12_000_000;
        var fertility = 17;
        var mortality = 8;
        while (year < 10) {
            year = year + 1;
            total = total + total * fertility / 1000 - total * mortality / 1000;
            System.out.println("Год " + year + " численность населения составляет " + total);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 0;
        int contribution = 15_000;
        int month = 0;
        while (total <= 12_000_000) {
            month = month + 1;
            total = total + contribution + total * 7 / 100;
            System.out.println(month + " месяц, промежуточное накопление: " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 0;
        int contribution = 15_000;
        int month = 0;
        while (total <= 12_000_000) {
            month = month + 1;
            total = total + contribution + total * 7 / 100;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, промежуточное накопление: " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 0;
        int contribution = 15_000;
        int month = 0;
        while (month < 108) {
            month = month + 1;
            total = total + contribution + total * 7 / 100;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, промежуточное накопление: " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int firstFriday = 3; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить еженедельный отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear =1900;
        for (int year = 0; year < currentYear + 200; year = year + 79) {
            if (year >= 1823) {
                System.out.println(year);
            }
        }
    }
}