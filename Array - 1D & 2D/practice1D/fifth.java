public class fifth {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,5};
        int peak = 0;
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]<arr[i+1] && arr[i+1]>arr[i+2]) {
                peak = arr[i+1];
                break;
            }
        }
        System.out.println("peak element : " + peak);
    }
}
