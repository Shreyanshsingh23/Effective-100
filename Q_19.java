import java.util.Scanner;

public class Q_19 {
    
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the current year :- ");

        int year = sc.nextInt();

        if(year % 4 == 0){
            System.out.println(year + " is a Leap Year ");
            return; 
        }

        else{
             System.out.println(year + " is not a Leap Year ");
        }
}
}