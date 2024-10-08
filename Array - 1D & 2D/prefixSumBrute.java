import java.util.*;

public class prefixSumBrute {

    public static int sum(int arr[][],int r1,int r2,int c1,int c2){
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        n = sc.nextInt();
        System.out.println("enter no. of column");
        m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter the matrix elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int r1, r2, c1, c2;
        System.out.println("enter r1");
        r1 = sc.nextInt();
        System.out.println("enter r2");
        r2 = sc.nextInt();
        System.out.println("enter c1");
        c1 = sc.nextInt();
        System.out.println("enter c2");
        c2 = sc.nextInt();

        
        int result = sum(arr,r1,r2,c1,c2);

        System.out.println("the sum of elements will be " + result);
    }
}
