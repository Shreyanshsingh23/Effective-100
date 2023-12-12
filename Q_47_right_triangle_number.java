import java.util.Scanner;

public class Q_47_right_triangle_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n bro : ");

        int n = sc.nextInt();
        
        int row = 1;

        while( row <= n){
    
            int col = 1;
           

            while(col <= row){

                System.out.print(col + " ");
               
                col++;
                

            }

            System.out.println();
            row++;
             
             
        }
    }
}
