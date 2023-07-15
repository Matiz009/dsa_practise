import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:\t");
        int num1= input.nextInt();
        System.out.print("Enter second number:\t");
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.printf("Sum:\t"+sum+"\n");
    }
}
