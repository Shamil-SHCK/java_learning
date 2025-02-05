public class casting {
    //converting from one type to another type 
    /**
     * @param args
     */
    public static void main(String[] args){
        //casting 
        double price =100.00;
        double finalPrice  = price + 18;
        System.out.println(finalPrice);
        //smaller one can be casted into the bigger one 
        //bigger one cannot be casted to the smaller one 
        // example : int 10 can castped to double 
        //but , double 10.00 cannot be caseted to int
        int p=100;
        double f=18;
        int fp= p+f;
        System.out.println(); 
    }
     
}
