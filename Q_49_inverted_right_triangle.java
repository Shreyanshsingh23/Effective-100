import java.util.Scanner;

public class Q_49_inverted_right_triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n bro : ");

        int n = sc.nextInt();
        int m=n;
        int row = 0;

        while( row < n){
    
            int col = 0;
           

            while(col < m){

                System.out.print("* ");
               
                col++;
                

            }

            System.out.println();
            row++;
             m=m-1;
             
        }
    }
}
