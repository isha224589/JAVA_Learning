public class array {
    public static void main(String[] args) {
        // int arr[]= {1,2,3,4,5};
        // for( int i=0; i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }

        // 2D array

        // int[][] arr = new int[2][2];
        // arr[0][1] = 3;
        // arr[0][0]= 2;
        // arr[1][0] = 4;
        // arr[1][1]=5;

        // System.out.println(arr[1][0]);

        int[][] arr = {{1,2},{2,4}};

        for(int i=0; i<2; i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
