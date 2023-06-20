public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4.0;
        cat = cat + 4.0;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(cat);
        System.out.println(paper);
        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача 6
        var OneBoxer = 78.2;
        var TwoBoxer = 82.7;
        var weight = OneBoxer + TwoBoxer;
        System.out.println("Общий вес бойцев " + weight + " кг!");
        var overload = TwoBoxer - OneBoxer;
        System.out.println("разница между бойцами на " + overload + " кг");
        // Задача 7
        var Boxer = TwoBoxer - OneBoxer;
        System.out.println(Boxer);
        Boxer = TwoBoxer % OneBoxer;
        System.out.println(Boxer);
        // Задача 8.1
        var clock = 640;
        var clockWork = 8;
        System.out.println(clock / clockWork + " человек работают в компании");
        // Задача 8.2
        var company = 80 + 94;
        System.out.println("" + company + " стало работников");
        System.out.println(company * clockWork + " всего часов");
    }
}