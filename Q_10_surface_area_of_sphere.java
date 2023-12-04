import java.util.*;

public class Q_10_surface_area_of_sphere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of sphere");

        int r = sc.nextInt();

        double sa = 4 * 3.14 * Math.pow(r, 2);

        System.out.println("Surface Area of Sphere = " + sa + " sq.units ");
    }
}
