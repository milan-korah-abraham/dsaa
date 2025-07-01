public class oddEven {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,8,3,5,7,5,5};
        int oddAns = 0;
        int evenAns = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 == 0){
                evenAns += arr[i] ;
            }else{
                oddAns += arr[i] ;
            }
        }
        System.out.println(evenAns);
        System.out.println(oddAns);
    }
}
