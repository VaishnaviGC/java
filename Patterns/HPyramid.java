/*
*
**
***
****
half pyramid */
/*package Patterns;

public class HPyramid {
   
   public static void main(String[] args) {
   int n = 4;
      for(int i = 1; i <= n; i++) {
         for(int j = 1; j <= i; j++) { //no. of rows = no. of col ie.,i =1 col 1,i = 2 col 2
            System.out.print("*");
         }
         System.out.println();
      }

   }
}
*/
package Patterns;
public class HPyramid {
   
   public static void main(String[] args) {
   int n = 5;
      for(int i = 1; i <= n; i++) {
         for(int j = 1; j <= i; j++) { //no. of rows = no. of col ie.,i =1 col 1,i = 2 col 2
            System.out.print(j + " ");
         }
         System.out.println();
      }

   }
}
/*
1
12
123
1234
12345
 */