import java.util.Scanner;

public class ifsmaple {
    public static void main(String a[]){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if (num<0){
            System.out.println("negative - "+num);
        }
        else{
            System.out.println("positive - "+num);
        }
    }
}
