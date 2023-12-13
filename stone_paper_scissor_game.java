import java.util.Random;
import java.util.Scanner;

public class stone_paper_scissor_game {
    public static void main(String[] args){

    

        // 0- Stone 1- paper 2 -scissor
        System.out.println("0 - Stone \n1 - Paper \n2 - Scissor \n Enter your choice:- ");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int user = sc.nextInt();
        int computer = rand.nextInt(4);  // will produce a random integer from 0 - 3

        System.out.println("Computer chose " + computer);
        
        if (user == 0) {

        
             if (computer == 0) {
                System.out.println(" It's a Tie ! ");
            }
            
        else if(computer==1){
            System.out.println(" You lost the game ");
        }
        else{
            System.out.println("You won the game");
        }
    }
    

    else if(user==1) // paper
    {
            if (computer == 0) {
                System.out.println(" You won the game ");
            } 
            else if  (computer == 1) {
                 System.out.println(" It's a Tie ! ");
            } 
            
            else {
                System.out.println("You lost the game");
              }  
            }

        else if(user == 2) // scissor
        {
            if(computer == 0){
                System.out.println("You lost the game");
            }

        
        
             else if(computer==1){
                System.out.println(" You won the game");
             
            }

            else{
                System.out.println("It's a tie ! ");
            }
        }
    

    else{ 

           System. out.println (" Sorry, Wrong Input !");
        }

}


}

