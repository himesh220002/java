import java.util.Scanner;

class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number = ");
        int a = sc.nextInt();
        System.out.print("enter 2st number = ");
        int b = sc.nextInt();
        System.out.print("enter operator: ");
        int o= 0;
        var operator = sc.next().charAt(0);
        
        switch(operator){
            case '+': o = a+b;
            break;
            case '-': o = a-b;
            break;
            case '*': o = a*b;
            break;
            case '/': o = a/b;
            break;
            case '%': o = a%b;
            break;
             
                       
        }
        if(operator == '+' || operator == '-'|| operator == '*'|| operator == '/'|| operator == '%'){
        System.out.println("result "+a+" "+operator+ " "+b+" = " +o);
        }
        else{
            System.out.println("wrong operator selection");
        }
        System.out.println("hey");
    }
}
