import java.util.Scanner;

public class binarysearch {
    // function declaration
    public static int binarysearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("enter the elements in the array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x;
        System.out.println("enter the elements you want to search");
        x = sc.nextInt();

        // function calling
        int result = binarysearch(arr, x);
        if (result == 0) {
            System.out.println("searching element not found");
        } else {
            System.out.println("result element found at the location " + result);
        }
    }
}
