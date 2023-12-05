import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your Name and Age respectively :- ");

        String name = sc.nextLine();
        int age = sc.nextInt();

        if(age>= 18){ 
            System.out.println("Hey " + name + ", You are a valid voter !");
    }
        else{
             System.out.println("Hey " + name + ", You are not a valid voter !");
        }
    }
}