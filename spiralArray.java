import java.util.Scanner;
import java.util.*;
public class spiralArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // row
        int m = sc.nextInt();    //col

        int[][] matrix = new int[n][m];
        // input matrix
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        // output matrix
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        // spiral printing
        System.out.println("spiral print: ");
        int strtRow = 0;
        int strtCol = 0;               // 0,0  0,1  0,2
        int endRow = n-1;              // 1,0  1,1  1,2
        int endCol = m-1;              // 2,0  2,1  2,2  

        while(strtRow<=endRow && strtCol<=endCol){
            for(int col = strtCol;col<=endCol; col++){
                System.out.print(matrix[strtCol][col]+ " ");
            }
            strtRow++;
            for(int row = strtRow;row<=endRow;row++){
                System.out.print(matrix[row][endCol]+" ");
            }
            endCol--;
            for(int col = endCol;col>=strtCol;col--){
                System.out.print(matrix[endRow][col]+" ");
            }
            endRow--;
            for(int row = endRow;row>=strtRow;row--){
                System.out.print(matrix[row][strtCol]+" ");
            }
            strtCol++;
            
            
        }
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]== x){
                    System.out.println("number "+x+" is found at pos: "+i+", "+j);
                }                
            }
        }        

    }        
}
