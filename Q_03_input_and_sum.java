import java.util.Scanner;

public class Q_03_input_and_sum {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter two values to get their addition :-");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum of " + a  + " & " + b + " = " + (a+b));
    }
}
