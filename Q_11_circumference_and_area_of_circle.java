import java.util.*;

public class Q_11_circumference_and_area_of_circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");

        int r = sc.nextInt();

        double circ = Math.ceil(2 * 3.14 * r);

        double area = 3.14 * Math.pow(r,2);
        
        System.out.println("Circumference of Circle = "  + circ + " units ");
        System.out.println("Area of Circle = "  + area + " units ");
    }
}