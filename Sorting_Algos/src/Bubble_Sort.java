import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        bubble_sort(arr);

    }
    static void bubble_sort(int [] arr){
        boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}