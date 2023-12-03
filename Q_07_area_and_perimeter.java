import java.util.Scanner;
public class Q_07_area_and_perimeter {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter the value of length and breadth of rectangle : ");

        int lenght = sc.nextInt();
        int breadth = sc.nextInt();

        int perimeter = 2* (lenght+breadth) ;
        
        int area = lenght * breadth;
        
        System.out.println("Perimeter of rectangle = " + perimeter + " \n  Area of rectangle = " + area );

        


    }
}
