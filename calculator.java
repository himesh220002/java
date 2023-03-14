import java.util.Scanner;

class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c =1;
        //cal();
       do{
        
        cal();
        c = sc.nextInt();

       }while(c == 1);
        
    }
    static void cal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number = ");
        float a = sc.nextFloat();
        System.out.print("enter 2st number = ");
        float b = sc.nextFloat();
        System.out.print("enter operator: ");
        float o= 0.00f;
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
        System.out.print3("press 1 to continue , for exit enter digit except 1 : ");
    }
}
