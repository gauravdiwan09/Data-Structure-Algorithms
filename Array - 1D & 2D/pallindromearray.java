class pallindrome {
    // time complexity = O(n)
    // space complexity = O(1)
    public static void main(String[] args) {
        int arr[] ={1,2,4,2,1};
        int n;
        int g = 0;
        n = arr.length;
        for (int i = 0; i < n/2; i++) {
           if (arr[i] != arr[n-i-1]) {
            g = 1;
            break;
           }
          }
          if (g == 1) {
            System.out.println("not a pallindrome array");
          } else {
            System.out.println("a pallindrome array");
          }
          }
    }