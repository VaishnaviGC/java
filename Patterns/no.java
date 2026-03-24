package Patterns;

public class no {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for( int i=1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(number+" ");//print no. so starting op will be 1
                number++;//increase the op by 1 in each inner loop
            }
            System.out.println();
        }
    }
    
}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */