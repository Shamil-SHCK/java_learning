/*Create a class Student with instance variables : name, rollno, mark1, mark2 & mark3 and 
methods: calculateAverage() to calculate the average mark and displayData() to print name, 
rollno and average mark*/
class studentdetails{
    String name;
    int roll;
    int m1;
    int m2;
    int m3;
    int avg;
    public studentdetails(String a,int b ,int c, int d,int e){
        this.name=a;
        this.roll=b;
        this.m1=c;
        this.m2=d;
        this.m3=e;
    }
    void calculateAverage(){
        int sum =  m1 + m2 + m3;
        avg = sum / 3;
    }
    void displaydata(){
        System.out.println("name : "+name);
        System.out.println("roll number  : "+roll);
        System.out.println("mark 1 = "+m1);
        System.out.println("mark 2 = "+m2);
        System.out.println("mark 3 = "+m3);
         System.out.println("average = "+avg);
    }
}
class student{
    public static void main(String a[]){
         System.out.println("STUDENT 1");
        studentdetails s1 = new studentdetails("akash",1,98,97,99);
        s1.calculateAverage();
        s1.displaydata();
         System.out.println("\nSTUDENT 2\n");
        studentdetails s2 = new studentdetails("gaythri",3,95,99,89);
        s2.calculateAverage();
        s2.displaydata();
    }
}
