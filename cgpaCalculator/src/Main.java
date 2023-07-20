import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of courses in which you are enrolled:\t");
        int courses= scanner.nextInt();
        double [] crHours= new double[courses];
        double [] earnedGrade= new double[courses];
        double totalCRH=0;
        double totalGrade=0;
        for (int i = 0; i <crHours.length ; i++) {
            System.out.print("Enter the credit hours of course "+(i+1)+" :\t");
            crHours[i]=scanner.nextDouble();
            System.out.print("Enter the obtained grade (1.3-4) in case of F enter 0:\t");
            earnedGrade[i]=scanner.nextDouble()*crHours[i];
        }
        for (double crHour : crHours) {
            double temp = totalCRH;
            totalCRH = crHour + temp;
        }

        for (double v : earnedGrade) {
            double temp = totalGrade;
            totalGrade = v + temp;
        }
        double gpa=totalGrade/totalCRH;
        System.out.print("Your semester grade is :\t"+gpa);
    }
}