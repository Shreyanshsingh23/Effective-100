import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number to check whether it's an odd or even number :-");

        int a = sc.nextInt();

       if(a==0){
        System.out.println("Entered number is 0 ");
        return;

       }
       
       else if(a%2 == 0){
            System.out.println("Entered number is an even number");
            return;
        }
        
        else{
             System.out.println("Entered number is an odd number");
        }

        
    }
}
