import java.util.ArrayList;
import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println("Ali"+ "Hassan");//operator overloading is basically defining usage of operators with different definitions
        //it is allowed in c++ not in java
        float a = 12.34567f;
        System.out.printf("PI: %.4f\n",Math.PI);
        System.out.printf("Formatted Number upto 2 decimal: %.2f\n",a);
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4}));
        System.out.println('a'-'b');//it will give -1 as ASCII value of a is 97 and b is 98
        //97-98=-1
        System.out.println("Alpha "+45+new ArrayList<>());//one must be string for working
    }
}
