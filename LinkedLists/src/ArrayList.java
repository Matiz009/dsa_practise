import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayList {
    public static void main(String[] args) {
        int [] arr =new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        addNum(arr,15,12);
    }
    static void addNum(int[] arr, int index, int num){
       if(index>= arr.length){
           int [] newArr=new int[arr.length*2];
           for (int i = 0; i < arr.length; i++) {
               newArr[i]=arr[i];
           }
           newArr[index]=num;
           System.out.println(Arrays.toString(newArr));
       }

    }

}