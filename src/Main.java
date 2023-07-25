import java.util.Scanner;
//
//public class Test {
//
//    public static void main(String[] args) {
//        // Создаем объект класса Scanner, которому в параметр передаем
//        // условие получения входных данных - «через консоль»
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your age");
//        // Для присвоения значения целочесленной переменной используется метод nextInt()
//        int age = scanner.nextInt(); // вводим в консоль 19
//
//        System.out.println("Enter your name");
//        // Для присвоения значения строковой переменной используется метод next()
//        String name = scanner.next(); // вводим в консоль Java-master
//
//        if (age < 18) {
//            System.out.println(name + " this page is adults only");
//        } else {
//            System.out.println("Welcome to the application " + name);
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        temaStroki();
        task1();
        task2();
        task3();
    }

    public static void temaStroki() {
        System.out.println("Пример");
        String phone = "9604157537";
        phone = phone.replace("-", "");
// С помощью метода replace() убираем дефисы (-)
        phone = phone.replace(" ", "");
// Убираем возможные пробелы в номере телефона
        phone = phone.replace("+", "");
// Убираем плюс (+), который может ввести пользователь
        if (phone.length() == 10) {
// Проверяем, что длина строки phone равна 10
// Используем метод length()
            phone = '7' + phone;
        } else if (phone.length() > 11) {
// Если длина строки больше 11
            throw new RuntimeException("Телефон слишком длинный");
            // Выводим сообщение об ошибке с помощью throw new RuntimeException
        } else if (phone.length() < 10) {
// Если длина строки меньше 10
            throw new RuntimeException("Телефон слишком короткий");
            // Выводим сообщение об ошибке
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
// Если в строке ровно 11 символов
// И если 1-й элемент строки не равен 7
            throw new RuntimeException("Среди нас посторонний");
            // То выводим сообщение об ошибке
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
// Записываем строку expectedPhone («ожидаемыйТелефон»)
        if (phone.equals(expectedPhone)) {
// Сравниваем phone с expectedPhone с помощью метода equals()
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задача 3");
        String firstName = "Артём";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}