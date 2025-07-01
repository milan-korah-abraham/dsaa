public class sumElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,12,24};
        int sum = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int next = arr[i + 1];
            sum += next;
        }
        System.out.println(sum);
    }
}
