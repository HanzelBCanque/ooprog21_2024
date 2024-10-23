import java.util.Scanner;

public class SortingThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
       
        int max, mid, min;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
            if (num2 >= num3) {
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
            if (num1 >= num3) {
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        } else {
            max = num3;
            if (num1 >= num2) {
                mid = num1;
                min = num2;
            } else {
                mid = num2;
                min = num1;
            }
        }

        System.out.println("Ascending Order: " + min + " " + mid + " " + max);
        System.out.println("Descending Order: " + max + " " + mid + " " + min);
        
        scanner.close();
    }
}
