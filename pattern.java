import java.util.*;

class pattern{
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int m=5;
        for(int i=1;i<=m; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Floyd's triangle
        int k = 5;
        int number = 1;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }


    }
}