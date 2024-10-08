import java.util.Scanner;
class first{
    public static void main(String[] args) {
        int m,n;
        int pcount = 0;
        int ncount = 0;
        int ocount = 0;
        int ecount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        m = sc.nextInt();
        System.out.println("enter number of columns");
        n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("enter the elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 0) {
                    pcount++;
                }
                if(arr[i][j] < 0){
                    ncount++;
                }
                if(arr[i][j]%2 == 0){
                    ecount++;
                }
                if(arr[i][j]%2 != 0){
                    ocount++;
                }
            }
        }

        System.out.println("no. of positive numbers : "+pcount);
        System.out.println("no. of negative numbers : "+ncount);
        System.out.println("no. of even numbers : "+ecount);
        System.out.println("no. of odd numbers : "+ocount);
    }
}