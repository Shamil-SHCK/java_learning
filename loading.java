//method overloading 
//compile time polymorphism
class overloading {
    //metrhods given with same name different signature
    //signature : number of parameter or type of parameteter differ
    void smpl(){
        System.out.println("e1 overloading");
    }
    void smpl(int a){
        System.out.println("e2 overloading : "+a);
    }
    void smpl(int a ,int b){
        System.out.println(a+" : e3 overloading : "+b);
    }
}
class loading{
    public static void main(String args[]){
        overloading eg1 = new overloading();
        eg1.smpl();
        eg1.smpl(3);
        eg1.smpl(4,8);
        System.out.println("execution completed");
    }
}

