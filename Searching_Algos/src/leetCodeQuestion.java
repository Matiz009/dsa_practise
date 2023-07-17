public class leetCodeQuestion {
    public static void main(String[] args) {
        int [][] array={
                {2,3,7},
                {12,45,78},
                {12,2},
                {123,345,688,34,22}
        };
        calculateWealth(array);
//        int [] array = {12,345,2,6,7896};
//        int total=0;
//        for (int j : array) {
//            String temp = Integer.toString(j);
//            int length = countNums(temp);
//            if (length % 2 == 0) {
//                total++;
//            }
//        }
//        System.out.println(total);
    }
    static int countNums(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }
    static void calculateWealth(int [][] arr){
        int count=0;
        int [] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp=count;
                count=arr[i][j]+temp;
            }
            a[i]=count;
            count=0;

        }
        int max=a[0];
        int identity=0;
        for (int i = 1; i < a.length; i++) {
            if(max<a[i]){
                max=a[i];
                identity=i;
            }
        }
        System.out.println("Person "+(identity+1)+" has maximum wealth :"+max);
    }
}
