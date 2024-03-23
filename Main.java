import java.util.Scanner;

public class Main {
    public static String BMICategory(double w, double h) {
        double bmi = 0.0;
        bmi = w/(h*h);
        bmi = (double)  Math.round(bmi*10)/10;
        if (bmi < 18.5) {
            return "thiếu cân";
        } else if (bmi < 23) {
            return "bình thường";
        } else return "béo phì";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height;
        System.out.println("Enter your weight(kg): ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height(m): ");
        height = scanner.nextDouble();

        String res = BMICategory(weight, height);
        System.out.println(res);
    }
}