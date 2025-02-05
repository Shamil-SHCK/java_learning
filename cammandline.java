//Write a java program to calculate sum and average of 5 numbers. ( Read input as command line argument) 
public class cammandline {
    public static void main(String a[]){
        int sum = 0 ;
        int i=0;
        for(i=0;i<6;i++){
            sum += Integer.parseInt(a[i]);
        }
        int avg = sum/6;
        System.out.println("sum ="+sum);
        System.out.println("average = "+avg);
    }
}
