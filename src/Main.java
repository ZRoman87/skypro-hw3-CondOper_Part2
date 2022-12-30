public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1 () {
        System.out.println("Задача 1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int year = 1844;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;

        if (((year4 == 0)&(year100 != 0))||((year100 == 0)&(year400 == 0))){
            System.out.println("Год " + year + " является высокосным");
        } else if ((year100 == 0)&(year400 != 0)) {
            System.out.println("Год " + year + " не является высокосным");
        } else {
            System.out.println("Год " + year + " не является высокосным");
        }

        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int deliveryDistance = 100;
        int deliveryTime = 0;

        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if ((deliveryDistance >= 20)&(deliveryDistance <60)) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if ((deliveryDistance >= 60)&(deliveryDistance <100)) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println();
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int monthNumber = 12;

        if ((monthNumber > 0)&(monthNumber < 13)) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Месяц " + monthNumber + " - Январь. Принадлежит к сезону зима");
                    break;
                case 2:
                    System.out.println("Месяц " + monthNumber + " - Февраль. Принадлежит к сезону зима");
                    break;
                case 3:
                    System.out.println("Месяц " + monthNumber + " - Март. Принадлежит к сезону весна");
                    break;
                case 4:
                    System.out.println("Месяц " + monthNumber + " - Апрель. Принадлежит к сезону весна");
                    break;
                case 5:
                    System.out.println("Месяц " + monthNumber + " - Май. Принадлежит к сезону весна");
                    break;
                case 6:
                    System.out.println("Месяц " + monthNumber + " - Июнь. Принадлежит к сезону лето");
                    break;
                case 7:
                    System.out.println("Месяц " + monthNumber + " - Июль. Принадлежит к сезону лето");
                    break;
                case 8:
                    System.out.println("Месяц " + monthNumber + " - Август. Принадлежит к сезону лето");
                    break;
                case 9:
                    System.out.println("Месяц " + monthNumber + " - Сентябрь. Принадлежит к сезону осень");
                    break;
                case 10:
                    System.out.println("Месяц " + monthNumber + " - Октябрь. Принадлежит к сезону осень");
                    break;
                case 11:
                    System.out.println("Месяц " + monthNumber + " - Ноябрь. Принадлежит к сезону осень");
                    break;
                case 12:
                    System.out.println("Месяц " + monthNumber + " - Декабрь. Принадлежит к сезону зима");
                    break;
                default:
                    System.out.println();
            }

        }

        System.out.println();
    }

}