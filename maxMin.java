import java.util.ArrayList;
public class maxMin {
    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(5);
        newArray.add(2);
        newArray.add(3);
        newArray.add(1);
        newArray.add(8);
        int max = newArray.get(0);
        int min = newArray.get(0);
        for (Integer integer : newArray) {
            if ( integer > max ) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
