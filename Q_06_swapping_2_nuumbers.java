import java.util.Scanner;

public class Q_06_swapping_2_nuumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to swap");

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println("Before swapping : x= " + x + " , y= " + y  );
        int z;
        // Part- 1 
        // using third variable
        z = x; 
        x = y;
        y = z;

        System.out.println("After swapping : x= " + x + " , y= " + y  );

          System.out.println(" \n ///////////////////////////// \n" );


        // Part- 2 
        // without using third variable
        // we will use XOR(^) operator

        // let's store the original values to variables
     
        z = x; 
        x = y;
        y = z;

        System.out.println("Before swapping : x= " + x + " , y= " + y  );  

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

          System.out.println("After swapping : x= " + x + " , y= " + y  );









        

         





        
    }
}
