//counting no of elements in a given input

import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();

        int count = 0;
        while(n != 0){//123 will be inp...divided by 10 12 again 1 again 0 so count 3
            n = n/10;
            count++;
    
        }
        System.out.println(count);

    }
    
}
