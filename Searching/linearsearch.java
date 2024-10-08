import java.util.Scanner;
// TC - O(n)
// SC - O(1)
class linearsearch{
    public static int linear(int arr[],int n,int x){
        int idx = -1;
        for(int j =0;j<n;j++){
            if (arr[j] == x) {
                System.out.println("yes element is present at index no. " + j);
                idx = j;
                break;
            }  } 
            if(idx == -1){
                System.out.println("searched element is not present");
            }
            else{
                System.out.println("searched element is found at index " + idx);
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
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        int x;
        System.out.println("enter the elements you want to search");
        x = sc.nextInt();

         linear(arr,n,x);
    }
}