public class duplicatearray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 5, 5, 7 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
