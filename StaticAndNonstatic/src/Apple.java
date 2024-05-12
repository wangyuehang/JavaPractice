/**
 * Apple class, created with Instance/Non-static variable & methods
 */

public class Apple {
    private int sweetness;

    public String Season = "All year long";

    public Apple(int i) {
        sweetness = i;
    }

    public void CompareSweetness(Apple b) {
        if (this.sweetness > b.sweetness) {
            System.out.println("This Apple is Sweeter!");
        } else {
            System.out.println("The other Apple is Sweeter");
        }
    }


}
