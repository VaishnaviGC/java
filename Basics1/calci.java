// simple calci using switch
// 
import java.util.*;
public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no:");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd no:");
        int n2 = sc.nextInt();
        System.out.println("enter op(+,-,*,%,/):");
        char op = sc.next().charAt(0);

        switch(op){
            case '+': System.out.println("res:" +(n1 + n2));
            break;
            case '-': System.out.println("res:" +(n1 - n2));
            break;
             case '*': System.out.println("res:" +(n1 * n2));
            break;
             case '%': System.out.println("res:" +(n1 % n2));
            break;
             case '/': System.out.println("res:" +(n1 / n2));
            break;
            default: 
            System.out.println("invalid operator");

    }
    
}
}
