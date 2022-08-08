public class Main {

    public static int checkYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        return a;
    }

    public static int launchRightVersion(int OS, int year) {
        if (OS == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        return OS;
    }

    public static int deliveryRange(int distance, int days) {
        if (distance > 20) {
            days++;
        }

        if (distance > 60) {
            days++;
        }
        return days;
    }

    public static void main(String[] args) {

        // Task 1

        int year = 2411;
        int result = checkYear(year);

        // Task 2
        int clientOS = 1;
        int clientDeviceYear = 2008;
        int resultOfPhone = launchRightVersion(clientOS, clientDeviceYear);

        // Task 3

        int deliveryDistance = 95;
        int deliveryDays = 1;
        int resultOFDelivery = deliveryRange(deliveryDistance, deliveryDays);
        System.out.println("Потребуется дней " + resultOFDelivery);

    }
}