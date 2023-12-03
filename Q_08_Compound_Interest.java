 import java.util.*;
public class Q_08_Compound_Interest {
   


    public static void main (String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Principal amount \n Annual rate(in %) \n number of times that interest is compounded per unit time \n time the money is invested/borrowed for (in years), respectively ");

     float p = sc.nextInt();
     float r = sc.nextInt();
     float n = sc.nextInt();
     float t = sc.nextInt();

     double total = p * Math.pow((1 + r/n), n*t );
     System.out.println(total);
     total = total * p;

     double CI = total - p;

      System.out.println("Total Amount = " + total + "\n Compound Interest = Total Amount - Principal Amount =  " + CI );

     

    }
}

    

