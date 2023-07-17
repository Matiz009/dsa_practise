import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr= new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int [] [] array = new int[3][3];
        int [][][] Array_3D= new int[3][3][3];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column]= random.nextInt(5);
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    Array_3D[i][j][k]= random.nextInt(20);
                }

            }
        }
        System.out.println("3d array");

//using loops
//        for (int i = 0; i < 3; i++) {
//            System.out.println(" ");
//            for (int j = 0; j < 3; j++) {
//                System.out.println(" ");
//                for (int k = 0; k < 3; k++) {
//                    System.out.print(Array_3D[i][j][k]+"\t");
//                }
//
//            }
//        }
        //using enhanced for loop
        for (int [][] num2:Array_3D){
            for (int [] num : num2){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(" ");
        }


    }
}