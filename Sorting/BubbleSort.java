import java.util.Arrays;

class bubbleSort{

    static void bubble(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                int flag = -1;
                for (int j = 0; j < arr.length - i -1; j++) {
                    if (arr[j]>arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                        flag = 0;
                    }
                }
                if (flag == -1) {
                    break;
                }
            }
        }
    public static void main(String[] args) {
    int arr[] = {2,3,4,5,6,7};
    bubble(arr);
    System.out.print("Sorted array is : ");
    System.out.println(Arrays.toString(arr));
    }
}