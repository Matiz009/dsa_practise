package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class function_tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :\t");
        int num= scanner.nextInt();
       // System.out.print("Enter the number2:\t");
        //int num2= scanner.nextInt();
        //isPrime(num);
        //primeFinder(num,num2);
        palindromeFinder(num);
    }
    static void isPrime(int num){
        if(num <= 1){
            System.out.println(num+" is not a prime number");
            return;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                return;
            }
        }
        System.out.println(num+" is a prime number");
    }
    static void primeFinder(int a, int b) {
        if(b-a<=0){
            System.out.println("invalid");
        }
        ArrayList <Integer> primeF = new ArrayList<Integer>();
        while (a<b){
            if(a%2!=0){
                primeF.add(a);
            }
            a++;
        }
        System.out.println(primeF);
    }
    static void factFind(int num){
        int factorial=1;
        for (int i = 1; i < num; i++) {
            int temp=factorial;
            factorial=factorial*i+temp;
        }
        System.out.println(factorial);
    }

    static void palindromeFinder(int num){
        int reverse=0;
        int num2=num;
        while (num>0){
            int rem = num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(num2==reverse){
            System.out.println(num2+" is a palindrome");
        }else{
            System.out.println(num2+" is not a palindrome");
        }

    }

}
