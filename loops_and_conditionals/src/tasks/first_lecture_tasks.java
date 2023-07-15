package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class first_lecture_tasks {
    public static void main(String[] args) {
        /*
        Write a program to print whether a number is even or odd, also take input from the user.
        Take name as input and print a greeting message for that particular name.
        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Take 2 numbers as input and print the largest number.
        Input currency in rupees and output in USD.
        To calculate Fibonacci Series up to n numbers.
        To find out whether the given String is Palindrome or not.
        To find Armstrong Number between two given number.
         */

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter any number:\t");
//        int num= scanner.nextInt();
//        if (num%2==1){
//            System.out.println("Number is an odd number");
//        }else if(num%2==0) {
//            System.out.println("number is an even number");
//        }else{
//            System.out.println("invalid number");
//        }
//        System.out.println("Enter your name");
//        String name = scanner.nextLine();
//        System.out.println("Hello "+name);
//        System.out.print("Enter principle amount:\t ");
//        int p= scanner.nextInt();
//        System.out.print("Enter time period:\t ");
//        int t= scanner.nextInt();
//        System.out.print("Enter interest rate:\t ");
//        float r= scanner.nextFloat();
//        double interest = p*t*r;
//        System.out.println("Interest :"+interest);
//        System.out.println("Enter the first number");
//        int num1= scanner.nextInt();
//        System.out.println("Enter the second number");
//        int num2= scanner.nextInt();
//        System.out.println("Enter the operator");
//        char operator= scanner.next().trim().charAt(0);
//        if(operator=='+'){
//            System.out.println("Sum: "+(num1+num2));
//        }else if(operator=='-'){
//            System.out.println("Subtraction: "+ (num1-num2));
//        }else if(operator=='*'){
//            System.out.println("Product: "+num1*num2);
//        }else if(operator=='/'){
//            if(num2==0){
//                System.out.println("invalid");
//            }
//            System.out.println("Division: "+num1/num2);
//        }else{
//            System.out.println("invalid");
//        }
//        System.out.print("Enter the amount in RS:\t");
//        int pkr= scanner.nextInt();
//        double usd=pkr*0.0037;
//        System.out.println("Amount in USD:\t"+usd+" $");
//        System.out.print("Enter first number:\t");
//        int number1= scanner.nextInt();
//        System.out.print("Enter second number:\t");
//        int number2= scanner.nextInt();
//        System.out.print("Enter nth value:\t");
//        int nth= scanner.nextInt();
//        int counter=2;
//        while (counter<=nth){
//            int temp=number2;
//            number2=number1+number2;
//            number1=temp;
//            counter++;
//        }
//        System.out.println("Fibonacci value of "+nth+" term:"+number2);
//        System.out.println("Enter any word");
//        String word = scanner.nextLine().trim().toLowerCase();
//        int length= word.length()-1;
//        int i=0;
//        boolean isPalindrome=true;
//        while (i<=length) {
//           if(word.charAt(i)!=word.charAt(length)){
//                System.out.println(word.charAt(i)+" "+word.charAt(length));
//                isPalindrome=false;
//            }
//            i++;
//            length--;
//        }
//        if(isPalindrome){
//            System.out.println(word+" is a palindrome");
//        }else{
//            System.out.println(word+" is not a palindrome");
//        }
//        System.out.print("Enter the number:\t");
//        int number= scanner.nextInt();
//        int number2=number;
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        while (number>0){
//            nums.add(number%10);
//            number=number/10;
//        }
//        int total=0;
//        for (int i = 0; i < nums.size(); i++) {
//            int temp=total;
//            total= (nums.get(i)*nums.get(i)*nums.get(i))+temp;
//        }
//        if(number2==total){
//            System.out.println("Number is an armstrong number");
//        }else{
//            System.out.println("Number is not an armstrong number");
//        }

    }
}
