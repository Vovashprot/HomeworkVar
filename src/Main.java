public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4.0;
        cat = cat + 4.0;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var BoxerW1 = 78.2;
        var BoxerW2 = 82.7;
        System.out.println("разница весов " + (BoxerW2 - BoxerW1) );

        var DiffM = BoxerW2 - BoxerW1;
        System.out.println(DiffM);
        var DiffO = BoxerW2 % BoxerW1;
        System.out.println(DiffO);

        var HoursGlobal = 640;
        var HoursW = 8;
        var NumW = HoursGlobal / HoursW;
        System.out.println("Всего работников в компании - " + NumW + " человек.");

        NumW = NumW + 94;
        HoursGlobal = NumW * HoursW;
        System.out.println("Если в компании работает " + NumW + " человек, тo всего "+ HoursGlobal +" часов работы может быть поделено между сотрудниками");

    }
}