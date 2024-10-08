import java.util.Arrays;
//tc-O(n^n)
//sc-O(1)
public class SelectionSort {
    static void selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = { 20,15,10,50,17};
        selection(arr);
        System.out.print("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
