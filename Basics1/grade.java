import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int marks = nc.nextInt();

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
