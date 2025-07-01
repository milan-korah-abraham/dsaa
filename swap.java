// normal array problem ...

import java.util.Arrays;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,6,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swaping(arr, start, end);
            start++;
            end--;
        }
    }

    static void swaping(int arr[] , int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2]; 
        arr[index2] = temp;
    }
}
