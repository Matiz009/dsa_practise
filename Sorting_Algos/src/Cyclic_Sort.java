import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic_sort(int [] arr){//we can only use cyclic sort when elements are continuous and is given from 1 till N
        int i=0;
        while (i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
