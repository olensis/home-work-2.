public class Main {
    public static void main(String[] args) {
        byte monkey = 28;
        short money = 31500;
        int apples = 100200;
        long cats = 50120005;
        System.out.println( " переменные " + money);
        System.out.println (" переменные " + monkey);
        System.out.println (" переменные " + apples);
        System.out.println (" переменные " + cats);

        double weight = 145.2496475;
        float potatoes = 5.5f;
        System.out.println( " переменные " + weight);
        System.out.println( " переменные " + potatoes);

        var newHomeWorkSixAndSeven = 6.7;


        var oneBoxer = 78.2f;
        var twoBoxer = 82.7f;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println ("Общий вес двух бойцов "+ totalWeight+ " кг");
        var weightDifference = oneBoxer - twoBoxer;
        System.out.println ( "Разница в весе двух бойцов" + weightDifference);
        var Difference = ( oneBoxer - twoBoxer)  % totalWeight;
        System.out.println ( "Разница в весе двух бойцов теперь " + Difference + " кг");



        var newHomework = 1;
        var cat =  3.6;
        var dog = 8;
        var papers = 76378;
        System.out.println ("Новое домашнее задание, задача №1 " + newHomework);
        System.out.println ( "Присваиваем переменные " + cat);
        System.out.println ( "Присваиваем переменные " + dog);
        System.out.println ( "Присваиваем переменные " + papers);

        var newHomeworkTwo = 2;
        dog = dog + 4;
        cat = cat + 4;
        papers = papers + 4;
        System.out.println ( "Теперь собак" + dog);
        System.out.println ( "Теперь кошек" + cat);
        System.out.println ( "Теперь бумаги " + papers);

        var newHomeworkThree = 3;
        dog = (int) (dog - 3.5);
        cat = cat - 1.6;
        papers = papers - 7639;
        System.out.println ( "Теперь собак" + dog);
        System.out.println ( "Теперь кошек" + cat);
        System.out.println ( "Теперь бумаги " + papers);

        var newHomeworkFour = 4;

        var friend = 19;
        System.out.println ("Друзей " + friend );
        friend = friend + 2;
        System.out.println (" Стало Друзей " + friend);
        friend = friend / 7;
        System.out.println ("Теперь Стало Друзей " + friend);

        var newHomeworkFive = 5;

        var frog = 3.5;
        System.out.println ( "Лягушек " + frog);
        frog = frog * 10;
        System.out.println ( "Стало Лягушек " + frog);
        frog = frog / 3.5;
        System.out.println ( "Теперь Стало Лягушек " + frog);
        frog = frog + 4;
        System.out.println ( "Итого лягушек " + frog);

        var newHomeworkEight = 8;
        var openingHours = 640;
        var workingHours = 8;
        System.out.println ( "Всего часов " + openingHours);
        System.out.println ( "Рабочих часов на сотрудника "+ workingHours);

        var worker = openingHours / workingHours;
        System.out.println ( "Сотрудников в компании " + worker + " человек" );

        worker = worker + 94;
        System.out.println ( "Теперь сотрудников в компании " + worker);
        workingHours = openingHours / worker;
        System.out.println ( "Если в компании работае" + worker + "человек,то всего" + workingHours + " часов работы может быть поделено между сотрудниками");




















































    }
}