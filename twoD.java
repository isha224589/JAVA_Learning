
import java.util.Scanner;

public class twoD {
    // Java program to demonstrate how to create Two Dimensional Array with User input
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          // Taking number of rows input from the user
          System.out.print("Enter the number of rows: ");
          int row = sc.nextInt();

          System.out.print("Enter the number of columns: ");
          int col = sc.nextInt();

          int[][] arr = new int[row][col];

          System.out.print("Enter elements of array");
        //   taking input from user for each element
           for(int i =0;i<row;i++){ 
            for(int j =0; j<col;j++){
                arr[i][j] = sc.nextInt();
            }
           }

        //   printing elements of array
          for(int i=0;i<row; i++){
            for(int j=0; j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
          }
        
    }

}
