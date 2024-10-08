// tc-O(n^2)
// sc-O(1)
import java.util.Arrays;

public class InsertionSort {
    static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
                while (j > 0 && arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
            
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11,19,20,27,40,45 };
        insertion(arr);
        System.out.print("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
