import java.util.ArrayList;
import java.util.Arrays;

/**
 * Practice Program for Helper Function. Find the largest number in four number.
 * Ex:[10] would return [10];
 * Ex:[10,15,20] would return [20];
 * Ex:[10,21,24,18,6,26] would return [24, 26].
 * Ex:[24,10,21,55,32,12] would return [24, 55].
 * Ex:[7,9,12,42,36,48,22,50,2] would return[46, 50].
 */
public class LargestInFour {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(10));
        System.out.println("ListA is " + listA);
        ArrayList<Integer> listAl = LargestInFourModifier(listA);
        System.out.println("Expected Result:[10], Actual ouput is: " + listAl);
        System.out.println("\n");


        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(10, 15, 20));
        System.out.println("ListB is " + listB);
        ArrayList<Integer> listBl = LargestInFourModifier(listB);
        System.out.println("Expected Result:[20], Actual ouput is: " + listBl);
        System.out.println("\n");

        ArrayList<Integer> listC = new ArrayList<>(Arrays.asList(10, 21, 24, 18, 6, 26));
        ArrayList<Integer> listD = new ArrayList<>(Arrays.asList(24, 10, 21, 55, 32, 12));
        ArrayList<Integer> listE = new ArrayList<>(Arrays.asList(7, 9, 12, 42, 36, 48, 22, 50, 2));

    }

    public static ArrayList<Integer> LargestInFourModifier(ArrayList<Integer> x) {
        ArrayList<Integer> modifiedArrayList = new ArrayList<>();
        if(x.size() <=1){
            return x;
        }
        for (int i = 0; i < x.size(); i++) {
            for (int j = -2 ; j <= 2; j++) {
                try {
                    int max = x.get(i);
                    if(j == 0){
                        continue;
                    }
                    if (x.get(i) < x.get(i + j)) {
                        break;
                    }
                    else{
                        modifiedArrayList.add(x.get(i));
                    }
                }
                catch (IndexOutOfBoundsException e){
                    continue;
                }
            }
        }
        return modifiedArrayList;
    }
}