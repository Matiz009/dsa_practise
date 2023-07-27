public class Main {
    public static void main(String[] args) {
        print(1);
        int fact=calculateFactorial(4);
        System.out.println("Factorial of num: \t"+fact);
        System.out.println("Fibonacci:\t"+fibonacci(7));
    }
    static void print(int n){
        System.out.println(n);//body
        if(n==5){//base condition
            return;
        }
        print(n+1);//recursive step
    }
    static int calculateFactorial(int n){
        if(n<=1){
            return 1;
        }
        return n*calculateFactorial(n-1);
    }
    static int fibonacci(int n){
        if (n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}