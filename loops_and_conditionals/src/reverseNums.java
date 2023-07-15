import java.util.Random;
public class reverseNums {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(2345678);
        System.out.println(number+" is the actual number.");
        int reverse=0;
        while (number>0){
            int num = number%10;
            reverse=reverse*10+num;
            number=number/10;
        }
        System.out.println(reverse+" is the reverse of the number.");
    }
}
