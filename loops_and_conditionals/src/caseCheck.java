import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character:\t");
        char letter =scanner.next().trim().charAt(0);
        if(letter>'a' && letter<'z'){
            System.out.println(letter+" is the lower case");
        }else{
            System.out.println(letter+" is the upper case");
        }
    }
}
