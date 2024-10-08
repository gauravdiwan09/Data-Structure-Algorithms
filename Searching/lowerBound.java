import java.util.*;

public class lowerBound {

    public static int findFirstOccurence(int arr[],int x){
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while (low<=high) {
            //mid calculate
            int mid = low + (high - low)/2;
            if (arr[mid]==x) {
                result = mid;
                high = mid - 1;
            }
            else if (arr[mid] > x) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }

        System.out.println("enter the target element");
        int x = sc.nextInt();

        //function calling
        int result = findFirstOccurence(arr,x);
        if(result==-1){
            System.out.println("target element not present");
        }
        else{
            System.out.println("target element first occurence found at index " + result);
        }
    }
}
