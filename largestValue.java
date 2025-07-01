// import java.util.*;
public class largestValue {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,8,7,5,4,6,1};
        int max_val = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if(max_val < arr[i+1]){
                // int temp = max_val;
                max_val = arr[i+1];
                // temp = max_val;
            }
        }
        System.out.println(max_val);
    }
}
