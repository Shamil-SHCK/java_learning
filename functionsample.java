import java.util.Scanner;

public class functionsample {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        
        int n1 =sc.nextInt();
        int n2 = sc.nextInt();

        //calling function
        int result = sum(n1,n2);
        System.out.println("RESULT = "+result);
    }
    //function
    static int sum(int a,int b){
        int s= a+b;
        return s;
    }
}
