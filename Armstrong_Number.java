import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number :- ");

        int n = sc.nextInt();

        boolean bool = isArmstrong(n);

        System.out.println(bool);

    }

    static boolean isArmstrong(int a){
 
         int temp = a;
        int sum = 0;
        while(a != 0){

            int digit = a %10;
            sum = sum + digit*digit*digit ;
            a = a/10;

        }
        return sum == temp;
    }
}
