import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter an english alphabet : ");
       char ch = sc.next().charAt(0);

       // check if the entered character is a letter 

       if(Character.isLetter(ch)){

        // convert it into lower case or upper case for easy comparisions
        char ch1 = Character.toLowerCase(ch);
        if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'  ){
            System.out.println("This is a vowel ! ");

        }
        else{
            System.out.println("This is a cosonant ! ");

        }
        

       }
        
       // if the entered character is not an alphabet print wrong input
       else{
             System.out.println("Wrong Input !");
       }



    
    }
}

