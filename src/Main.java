import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершенолетний");
        } else if (age >= 0 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " то он недостиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Некорректный возраст");
        }

        System.out.println();
        //Задача №2
        System.out.println("Задача 2");
        System.out.print("Введите температуру на улице: ");
        int temperature = scanner.nextInt();
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("Пограничная ситуация, решай сам");
        }

        System.out.println();
        //Задача №3
        System.out.println("Задача 3");
        System.out.print("Введите скорость водителя: ");
        int speed = scanner.nextInt();
        if (speed >= 0 && speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, можно ехать спокойно");
        } else if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else if (speed == 60) {
            System.out.println("Пограничная ситуация, будь внимательней");
        } else {
            System.out.println("Так не бывает");
        }

        System.out.println();
        //Задача №4
        System.out.println("Задача 4");
        System.out.print("Введите возраст человека: ");
        age = scanner.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", дуй работать");
        } else if (age >= 0 && age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо научиться ходить");
        } else {
            System.out.println("Некорректный возраст");
        }

        System.out.println();
        //Задача №5
        System.out.println("Задача 5");
        System.out.print("Введите возраст ребенка: ");
        age = scanner.nextInt();
        if (age < 5 && age>=0) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Некорректный возраст");
        }

        System.out.println();
        //Задача №6
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int wagonSittingPlaces = 60;
        int wagonStandingPlaces = wagonCapacity - wagonSittingPlaces;
        //Предположим, что вначале люди выкупают сидячие места
        System.out.print("Введите сколько мест в вагоне занято: ");
        int occupiedPlaces = scanner.nextInt();
        int freeSittingPlaces;
        int freeStandingPlaces;
        if (occupiedPlaces < wagonSittingPlaces && occupiedPlaces >= 0) {
            freeSittingPlaces = wagonSittingPlaces - occupiedPlaces;
            System.out.println("В вагоне свободных сидячих мест " + freeSittingPlaces + " и свободных стоячих мест " + wagonStandingPlaces);
        } else if (occupiedPlaces >= wagonSittingPlaces && occupiedPlaces < wagonCapacity) {
            freeStandingPlaces = wagonCapacity - occupiedPlaces;
            System.out.println("В вагоне свободных сидячих мест 0 и свободных стоячих мест " + freeStandingPlaces);
        } else if (occupiedPlaces >= wagonCapacity) {
            System.out.println("Вагон переполнен");
        } else {
            System.out.println("Где-то в параллельной вселенной");
        }

        System.out.println();
        //Задача №7
        System.out.println("Задача 6");
        //Вводим числа
        System.out.print("Введите первое число: ");
        int one = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int two = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int three = scanner.nextInt();
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        } else {
            System.out.println("Как минимум некоторые из этих чисел равные");
        }
    }
}