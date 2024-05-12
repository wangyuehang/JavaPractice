/**
 * Watermelon class, created with Class/Static variable & methods.
 */

public class Watermelon {
    private int size;

    private String name;

    public static String Season = "Summer Fruit";

    public Watermelon(String inName, int inSize){
        name = inName;
        size = inSize;
    }

    public void PrintSize(){
        System.out.println("The size of this Watermelon is " + size);
    }


    public static void CompareSize(Watermelon a, Watermelon b){
        if(a.size > b.size){
            System.out.println(a.name+ "is bigger");
        } else {
            System.out.println(b.name + "is bigger");
        }
    }



}
