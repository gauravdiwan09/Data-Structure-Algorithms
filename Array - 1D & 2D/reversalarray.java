public class reversalarray {
    // time complexity = O(n)
    // space complexity = O(1)
        public static void main(String[] args) {
            int arr[] ={1,2,3,4,5,7,10,15};
            int n,t;
            n = arr.length;
            for (int i = 0; i < n/2; i++) {
                t = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = t;
              }
              System.out.print("reversal of an array is : ");
            for (int j = 0; j < n; j++) { 
                System.out.print(arr[j] + " ");
            }
        }
}
