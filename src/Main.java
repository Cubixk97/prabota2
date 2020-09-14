
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rogi", 2);
        Dog d2 = new Dog("Gik", 7);
        Dog d3 = new Dog("Bob",8);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Ball b1 = new Ball("Football", "White");
        Ball b2 = new Ball("Basketball", "Brown");
        Ball b3 = new Ball("Rugby","Red");

        System.out.println(" ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book o1 = new Book("Mumu", 100);
        Book o2 = new Book("Hobit", 150);
        Book o3 = new Book("White fang",200);

        System.out.println(" ");

        o1.avrreedingSpeedPage();
        o2.avrreedingSpeedPage();
        o3.avrreedingSpeedPage();
        System.out.println(" ");

        Shape s1 = new Shape("Kub",7);
        System.out.println(s1);
        s1.Oso();



    }
}

