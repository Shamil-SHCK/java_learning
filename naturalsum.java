import java.util.Scanner;

public class naturalsum {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("sum is : "+sum);


    }
}
