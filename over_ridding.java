//method overRidding 
class ridding {
    //metrhods given with same name and same signature
    //signature : number of parameter or type of parameteter differ
    //uses inheritance to make use derived class
    void smpl(int a){
        System.out.println("over ridding");
    }
}
class a extends ridding{
    void smpl(int a){
        a=a*5;
        System.out.println(a+" is over ridding \n \t eq 1 ");
    }
    
}
class b extends ridding{
    void smpl(int a){
        a=a*6;
        System.out.println(a+" is over ridding \n \t eq 2 ");
    }
    
}
class c extends ridding{
    void smpl(int a){
        a=a*4;
        System.out.println(a+" is over ridding \n \t eq 3 ");
    }
}
class over_ridding{
    public static void main(String args[]){
        ridding e = new ridding();
        e=new a();
        e.smpl(5);
        e=new b();
        e.smpl(5);
        e=new c();
        e.smpl(5);
    }
}