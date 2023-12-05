import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your gender -   ");

        char a = sc.next().charAt(0);

        if(a == 70 || a == 102 ){   // 70 and 102 are the ascii values of 'M' and 'm' respectively

          System.out.println("Good Morning Ma'am :) ");

        }

        if( a == 77 || a == 109){
        
            System.out.println("Good Morning Sir :) ");

        }
         
        /* 
        this is probably the toughest or lenghty method to compare two characters by their ascii values what we have done above
        
        if(a == 'm' || a == 'M'){
              System.out.println("Good Morning Sir :) ");
        }

        similarly for female also

        Now, the shortest and easiest method is 

        String b = sc.next();
        boolean bool = b.equalsIgnoreCase("male");
        boolean bool1 = b.equalsIgnoreCase("female");
        if(bool == true){
             System.out.println("Good Morning Sir :) ");

        }

        if(bool1 == true){
            System.out.println("Good Morning Ma'am :) ");

        }

        */
    }
}
