public class Simple {
    public static void main(String[] args) {
        //fun(10);
        //funBoth(5);
        int fact=factorial(7);
        System.out.println("Factorial of number:\t"+fact);
        int ans=sumOfDigits(345678432);
        System.out.println(ans);
        int ans2=productOfDigits(5235505);
        System.out.println(ans2);
        //printDigits(5);
        //reverseNum(54321);
        //System.out.println(sum);
        palindrome(4244);
        countZeroes(104642030,0);
        countSteps(14);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sumOfDigits(int n){
        if(n<10){
            return n;
        }
        int num=n%10;
        int num2=n/10;
        return num+sumOfDigits(num2);
    }
    static int productOfDigits(int n){
        if(n<10){
            return n;
        }
        int num=n%10;
        int num2=n/10;
        return num*productOfDigits(num2);
    }
    static int printDigits(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return printDigits(--n); //there is a difference between n-- and --n, n-- will parse the value first then subtract -1 and
        // --n will subtract first then parse
        //return printDigits(n--);
    }
    static int sum=0;
    static void reverseNum(int n){
       if(n==0){
           return;
       }
       int rem=n%10;
       sum=sum*10+rem;
       reverseNum(n/10);

    }
    static void palindrome(int n){
        int number=n;
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverseNum(n/10);
        if(number==sum){
            System.out.println("Number is a palindrome.");
        }else{
            System.out.println("Number is not a palindrome.");
        }
    }

    static void countZeroes(int n,int count){
        int num=n%10;
        boolean flag=false;
        n=n/10;
        if(n<1){
            System.out.println(count);
            return;
        }
        if(num==0){
            countZeroes(n,++count);
        }else{
            countZeroes(n,count);
        }

    }
    static int steps=0;
    static void countSteps(int n){
        if(n==0){
            System.out.println(steps);
            return;
        }
        if(n%2==0){
            steps=steps+1;
            countSteps(n/2);
        }else if(n%2==1){
            steps=steps+1;
            countSteps(n-1);
        }
    }
}
