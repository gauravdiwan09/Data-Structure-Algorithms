public class missingelement {
        // time complexity = O(n)
        // space complexity = O(1)
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7};
        int n,sum,t,missum = 0,me;
        n = arr.length;
        t = n+1;
        sum = t*(t+1)/2;
        for (int index = 0; index < n; index++) {
            missum = missum + arr[index];
        }
        me = sum - missum;
        System.out.println("missing element is : "+ me );
    }
}


