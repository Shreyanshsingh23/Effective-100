import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your gender -   ");

        char a = sc.next().charAt(0);

        if(a == 70 || a == 102 ){   // 70 and 102 are the ascii values of 'M' and 'm' respectively

          System.out.println("Good Morning Ma'am :) ");
          return; 
          // need to use this return statement because after executing this 'if' block compiler continues to compile so it executes 'else' block below

        }

        if( a == 77 || a == 109){
        
            System.out.println("Good Morning Sir :) ");

        }

        else{
             System.out.println("Sorry, Wrong Input :( ");
        }
         
    }
    
}

