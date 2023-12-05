import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter three numbers :- ");

        int num_1 = sc.nextInt();
         int num_2 = sc.nextInt();
          int num_3 = sc.nextInt();

        if(num_1 > num_2 && num_1 > num_3){
             System.out.println(num_1 + " is the greatest among three numbers");
             return;
        }

        if(num_2 > num_1 && num_2 > num_3){
             System.out.println(num_2 + " is the greatest among three numbers");
             return;
        }

        if(num_3 > num_2 && num_3 > num_1){
             System.out.println(num_3 + " is the greatest among three numbers");
        }
}

}