package JavaConcepts;

public class MethodOverLoading {
    public static void main(String[] args){
    methodOne(3,4);
    }

    public static void methodOne(){
        System.out.println("methodOne");
    }
    public static  void methodOne(int a){
        System.out.println("methodOne"+a);
    }
    public static void methodOne(int a,int b){
        System.out.println("methodOne int a , int b " +a+b);
    }
    public static void methodOne(boolean a){
        System.out.println("Boolean of methodOne"+a);
    }
}
