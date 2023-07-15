import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number:\t");
        float num1 = scanner.nextFloat();
        System.out.println(num1);
        //type casting
        int num = (int) (45.56);
        System.out.println(num);
        //automatic type promotion in expression
        int character = 'A';
        System.out.println("ASCII:"+character);
        int a = 345;
        byte b = (byte) (a); // 257 % 256 =1
        System.out.println(b);
    }
}
