import java.util.*;

public class Q_09_area_of_triangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 sides of triangle : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int s = a+b+c;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("Area of triangle = " + area);

    }
}