import java.util.*;
public class arrayListee {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            nums.add(number);
        }

        for (Integer numbers : nums) {
            System.out.println(numbers);
        }
    }
}
