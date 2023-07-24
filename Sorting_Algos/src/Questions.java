import java.util.ArrayList;
import java.util.List;

public class Questions {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,10,8,7};
        int [] missingArr = {4,3,2,7,8,2,3,1};
        AllMissing(missingArr);
        int missing=MissingNumber(nums);
        System.out.println(missing+" is missing.");
    }

    static int MissingNumber(int[] arr) {//we can only use cyclic sort when elements are continuous and is given from 1 till N
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1) {
                return index;
            }
        }
        return arr.length;
    }
    static void AllMissing(int [] nums){
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i , correct);
                } else {
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1) {
                    ans.add(index + 1);
                    System.out.println(index+1);
                }
            }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
