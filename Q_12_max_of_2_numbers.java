import java.util.Scanner;

public class Q_12_max_of_2_numbers {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to compare :");

        int a = sc.nextInt();
        int b = sc.nextInt();
      
        System.out.println("Maximum of the two numbers is : " + Math.max(a, b));
        
    }
}
