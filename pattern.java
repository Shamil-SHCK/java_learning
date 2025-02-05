//Program to print the following pattern 
import java.util.Scanner;
public class pattern {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of levels : ");
        int n = sc.nextInt();
        for( int i = 1 ; i <= n ; i++ ){
            for( int j = 0 ; j < i ; j++ ){
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
