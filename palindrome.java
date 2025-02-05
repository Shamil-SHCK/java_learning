//Check whether a number is palindrome or not 
import java.util.Scanner;
public class palindrome {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check palindrome : ");
        int n = sc.nextInt();
        int m= n;
        int d,w = 0;
        while(n>0)
        {
            d = n%10;
            w = w*10 +d;
            n = n/10;
        }
        if(w == m){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
}
