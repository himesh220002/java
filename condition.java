import java.util.*;
public class condition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("adult");
        }else{
            System.out.println("not adult");
        }
        System.out.println("choose a button '1 , 2 or 3' :");

        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("hey");
            break;
            case 3: System.out.println("hi");
            break;
            default: System.out.println("invalid button");
        }
    }
}