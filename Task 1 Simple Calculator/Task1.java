import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = cin.nextInt();

        System.out.print("Enter Operater(+,-,/,*): ");
        String opt = cin.next();

        System.out.print("Enter Num2: ");
        int num2 = cin.nextInt();

        switch (opt) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Can't divide by zero!");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Enter a valid operator (+, -, *, /)");
        }
        cin.close();
    }
}