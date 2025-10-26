import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
// Задача 1
        checkLeapYear(2021);
        checkLeapYear(2024);

        // Задача 2
        suggestAppVersion(0, 2014); // iOS, старое устройство
        suggestAppVersion(1, 2018); // Android, новое устройство

        // Задача 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    // Метод к задаче 1
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Метод к задаче 2
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean isOldDevice = deviceYear < currentYear;

        if (osType == 0) {
            if (isOldDevice) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите приложение для iOS по ссылке.");
            }
        } else if (osType == 1) {
            if (isOldDevice) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите приложение для Android по ссылке.");
            }
        } else {
            System.out.println("Неизвестный тип операционной системы.");
        }
    }

    // Метод к задаче 3
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1; // доставка невозможна
        }
    }
}