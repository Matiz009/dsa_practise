package switch_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your favourite weather:\t");
        String weather=scanner.next().toLowerCase();
        switch (weather){
            case "summer": {
                System.out.println("Its hot");
                break;
            }
            case "winter": {
                System.out.println("Its cold");
                break;
            }
            case "spring": {
                System.out.println("Its awesome");
                break;
            }
            case "autumn": {
                System.out.println("Its sad");
                break;
            }
            default:{
                System.out.println("Its not valid");
            }
        }
    }
}
