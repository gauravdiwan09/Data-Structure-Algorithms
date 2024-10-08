import java.util.Arrays;

class forth {
    public static void main(String[] args) {
        int[] arr = {60,100,90,20,10};

        int secondLargest = findSecondLargest(arr);

        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // or handle this case as needed
        }

        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // The second largest element is at index 1 in the sorted array
        return arr[arr.length-2];
    }
}
