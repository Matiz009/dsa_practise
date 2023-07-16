public class Shadowing {
    static int a=45;
    public static void main(String[] args) {
        System.out.println(a);//45
        int a=12;
        System.out.println(a);//12
        fun1();//45
        fun2();//67
        //Shadowing is a computer programming phenomenon
        // in which a variable declared in one scope (like decision block, method, or inner class)
        // has the same name as another declaration of the enclosing scope.
        //But when we call or print the value, the upper scope value will be shadowed by the lower level
        // as a=12 shadowed a=45 which is outside the psvm.
    }
    static void fun1(){
        System.out.println(a);
    }
    static  void fun2(){
        int a=67;
        System.out.println(a);
    }
}
