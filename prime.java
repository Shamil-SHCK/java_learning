//Program to print all prime numbers between 2 and n
import java.util.Scanner;
public class prime {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number as limit: ");
        int n = sc.nextInt();
        for( int i = 2 ; i <= n ; i++ ){
            int f=0;
            for( int j = 2 ; j < i ; j++ ){
                if( i % j == 0 ){
                    f = 1;
                }
            }
            if(f == 0){
                System.out.println(i);
            }
        }
    }
}