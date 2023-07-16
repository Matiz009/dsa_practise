import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(sum());
        swap(12,34);
        String name = "Mati";
        System.out.println(changeName(name));
        System.out.println(name);
        int [] array ={12,34,56,77};
        changeByCopyOfRef(array);
        System.out.println(Arrays.toString(array));
    }

     static void changeByCopyOfRef(int[] nums) {//passing by the copy of reference
        nums[0]=44;
    }

    static String changeName(String name) {//passing the value and scope is limited
        name="Ali";
        return name;
    }

    static int sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1:\t");
        int num1=scanner.nextInt();
        System.out.print("Enter number2:\t");
        int num2=scanner.nextInt();
        return num1+num2;
    }
    static void swap(int a, int b){
        int temp = b;
        b=a;
        a=temp;
        System.out.println(a+" "+b);
    }

}