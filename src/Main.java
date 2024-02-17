public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog*4;
        cat = cat*4;
        paper = paper*4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend*2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);

        var Boxer1 = 78.2;
        var Boxer2 = 82.7;
        var weightSum = Boxer1 + Boxer2;
        var differenceWeight = Boxer2 - Boxer1;
        System.out.println(weightSum);
        System.out.println(differenceWeight);
        var overweight = (Boxer2%Boxer1);
        System.out.println(overweight);

        var time = 640;
        var hourlyShift = 8;
        var employees = time/hourlyShift;
        System.out.println("Всего работников в компании - "+employees +" человек");
        employees = employees+94;
        time = employees*8;
        System.out.println("Если в компании работает "+ employees +" человек, то всего "+ time +" часов работы может быть поделено между сотрудниками");










    }
}
