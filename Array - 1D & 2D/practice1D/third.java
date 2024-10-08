public class third {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("the maximum element is "+ max);
    }
}
