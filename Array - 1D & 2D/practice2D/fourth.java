import java.util.Scanner;

public class fourth {
    public static void main(String args[]){
    
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of rows : ");
    m=sc.nextInt();    
    System.out.print("enter the number of column : ");    
    n=sc.nextInt();
    int arr[][]=new int[m][n];
    
    int i,j;    
       int max = -1;
    System.out.println("enter the  matrix element : ");    
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){    
            arr[i][j]=sc.nextInt();  
        }    
    }
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){
            if (arr[i][j]>max) {
                max = arr[i][j];
            }       
        }    
    }
    System.out.println("largest number is : "+max);
}
}
