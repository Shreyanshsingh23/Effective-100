import java.util.Random;
import java.util.Scanner;

public class stone_paper_scissor_game {
    public static void main(String[] args)  

        // - Stone 1 aper 2 -  issor
        System.out.println("0 - Stone \n1 - Paper \n2 - Scissor \n Enter your choice:- ");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int user = sc.nextInt();
        int computer = rand.nextInt(4);  // will produce a random integer from 0 - 3

        
        if (user == 0) {
             if (computer == 0) {

    System.out.println(" It's a Tie ! ");
            }
            
        else if(computer==1){

    }else
    {

    }

    else if(user==1)
    {
            if (computer == 0) {
                System.out.println(" You won the game ");
            } 
            else if  (computer == 1) {
                 System.out.println(" It's a Tie ! ");
            } 
            
            else {
              }  

        }else if(computer==0)

    {
        System.out.println(" You lost the game ");
    }else if(computer==1)
    {
                System.out.println(" You won the game");
             Syst em.out.println("It's a tie ! ");
            }

    }
    else{ 


    System. out.println (" Sorry, Wrong Input !");
        }

}
