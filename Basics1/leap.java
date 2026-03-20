// to chek if a year is leap or not
// 
import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //every 4 leap year
        //every 400 leap but every 100 is not leap
        if( year%400==0 || year %4 == 0 && year != 100){
            System.out.println("leap");
        }else{
            System.out.println(" not leap");
        }
    }
    
}
