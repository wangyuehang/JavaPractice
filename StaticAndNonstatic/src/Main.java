/**
 * Tester class for static/Non-static Method and variable.
 * Static Method: Method that is used/call on the class. Ex: Watermelon.CompareSize(a,b)
 * Non-Static Method: Method that is used on the instance. Ex: c.CompareSweetness(d)
 */

public class Main {
    public static void main(String[] args) {
        Watermelon a = new Watermelon("MediumWatermelon", 5);
        Watermelon b = new Watermelon("LargeWatermelon",10);
        a.PrintSize();
        b.PrintSize();
        Watermelon.CompareSize(a,b);

        System.out.println(Watermelon.Season);

        Apple c = new Apple(2);
        Apple d = new Apple(3);

        c.CompareSweetness(d);

        System.out.println(c.Season);

    }
}
