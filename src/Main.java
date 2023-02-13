import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();

    }

    private static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    private static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    private static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    private static void task4() {
        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    private static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }

    private static void task6() {
        System.out.println("Задача 6");
        var weigth1 = 78.2;
        System.out.println("Вес одного боксера " + weigth1 + " кг");
        var weigth2 = 82.7;
        System.out.println("Вес второго боксера " + weigth2 + " кг");
        var totalWeigth = weigth1 + weigth2;
        System.out.println("Общий вес двух боксеров " + totalWeigth + " кг!" );
        var difWeigth = weigth2 - weigth1;
        System.out.println("Разница в весе боксеров " + difWeigth + " кг!");

    }

    private static void task7() {
        System.out.println("Задача 7");
        var weigth1 = 78.2;
        var weigth2 = 82.7;
        var difWeigth1 = weigth2 - weigth1;
        System.out.println("Разница в весе боксеров методом вычитания " + difWeigth1 + " кг");
        var difWeigth2 = weigth2 % weigth1;
        System.out.println("Разница в весе боксеров используя остаток от деления " + difWeigth2 + " кг");

    }

    private static void task8() {
        System.out.println("Задача 8");
        var timeWork1 = 640;
        var timeForOneWorker = 8;
        var quantityWorker = timeWork1 / timeForOneWorker;
        System.out.println("Всего работников в компании — " + quantityWorker + " человек");
        quantityWorker = quantityWorker + 94;
        var timeWork2 = timeForOneWorker * quantityWorker;
        System.out.println("Если в компании работает " + quantityWorker +
                " человек, то всего " + timeWork2 + " часов работы может быть поделено " +
                "между сотрудниками");


    }
}