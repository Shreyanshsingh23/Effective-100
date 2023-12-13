import java.util.*;

public class factorial_by_recursion {
   
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial : ");

        int n = sc.nextInt();

        int fac = factorial(n);

        System.out.println(fac);
    }

    static int factorial(int a){
        if(a==0 || a==1){  // this is the base case because the factorial of 0 & 1 is '1' only
            return 1 ;
        }

        else{
            return a * factorial(a-1);
        }
    }
    
}
