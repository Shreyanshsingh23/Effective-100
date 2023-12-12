import java.util.Scanner;

public class Q_38_Strong_Number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check that whether it's a Strong number or not :- ");

        int n = sc.nextInt();

        boolean bool = isStrong(n);

        System.out.println(bool);
    }

    static boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        
        while(n != 0){

            int digit = n % 10;
            sum = sum + factorial(digit);
            n = n / 10;
        }

        return sum == temp;
    }

    static int factorial(int n){

        int fac = 1;
        while(n != 0){
            fac = fac * n;
            n--;
        }

        return fac;
    }
}
