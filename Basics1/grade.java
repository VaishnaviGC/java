import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int marks = nc.nextInt();

        //marks will be divided by 10 and based on rminder grades are alloted and if we want we can do this in if and else if using range
        switch(marks / 10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            default:System.out.println("Fail");
        }
    }
    
}
