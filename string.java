public class string {
    public static void main(String[] args){
        //Strings
        String name = "amaan ali ";
        //.............0123456789
        System.out.println(name.charAt(8));
        System.out.println(name.length());
        String name2 = name.replace('m','b');
        System.out.println("new name :"+name2);
        System.out.println("name :"+name);
        //substring or slicing
        System.out.println(name.substring(6, 10));
    }
    
}
