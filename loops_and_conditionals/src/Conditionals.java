import java.util.Random;

public class Conditionals {
    public static void main(String[] args) {
        Random random = new Random();
        int salary = random.nextInt(30000);
        System.out.println(salary+" before adds on");
        if(salary>20000){
            salary=salary+3000;
        } else if (salary>10000) {
            salary=salary+2000;
        } else {
            salary=salary+1000;
        }
        System.out.println(salary+" after adds on");
    }
}