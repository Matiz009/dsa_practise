public class Main {
    public static void main(String[] args) {
        //print(1);
        //int fact=calculateFactorial(4);
        //System.out.println("Factorial of num: \t"+fact);
        int [] array = {1,2,3,4,5,6,7,8,9,0,65,43,34};
        int target=43;
        int index=findNum(array,target,0,array.length-1);
        System.out.println(index);
        //System.out.println("Fibonacci:\t"+fibonacci(50));
        System.out.println("Fibonacci using formulae:\t"+Fibonacci_Formula(13));
    }
    static void print(int n){
        System.out.println(n);//body
        if(n==5){//base condition
            return;
        }
        print(n+1);//recursive step and also called tail recursion because it's the last one
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
    static long Fibonacci_Formula(int n){
        long num1=(int) (Math.pow((1+Math.sqrt(5))/2,n));
//        long num2=(int) (Math.pow((1-Math.sqrt(5))/2,n));
//        return (long) ((num1-num2)/Math.sqrt(5));
         return (long) (num1/Math.sqrt(5));//both formulas are correct
    }
    static int findNum(int [] arr, int target,int start,int end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(target<arr[mid]){
            return findNum(arr,target,start,mid-1);
        }else if(target>arr[mid]){
            return findNum(arr,target,mid+1,end);
        }else {
            return -1;
        }
    }
}