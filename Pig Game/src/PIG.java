import java.util.Random;
import java.util.Scanner;

public class PIG {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	       
        int plr_one_score = 0;
        int plr_two_score = 0;
 
        int round_score = 0;
 
        boolean should_run = true;
 
 
        System.out.println("------------PIG-------------");
        System.out.println("Roll dice as many repeatedly.");
        System.out.println("But do not roll the number 1.");
        System.out.println("Click enter to play the PIG!!");
        input.nextLine();
 
        while (plr_one_score < 100 && plr_two_score < 100){
            System.out.println("Player 1's turn...press enter to roll dice...");
            input.nextLine();
            while (should_run){
                Random rand = new Random();
   
                if (plr_one_score < 100){
                    int roll = (rand.nextInt(6) + 1);
                    System.out.println("You have rolled a " + roll + ".");
   
                    if (roll > 1){
                        System.out.print("Would you like to roll again? (roll/bank): ");
                        String choice =  input.next();
                        if (choice.equals("roll")){
                            round_score += roll;
                            System.out.println();
                        }
                        else if (choice.equals("bank")){
                            round_score += roll;
                            plr_one_score += round_score;
                            System.out.println();
                            System.out.println("Player 1, here are your total points. " + plr_one_score + ".\n");
                            round_score = 0;
                            should_run = false;
                        }
                        else{
                            round_score += roll;
                            System.out.println("Invalid command!");
                        }
                    }
                    else{
                        System.out.println("Unfortunate, you lose all your round points and your turn ends!");
                        round_score = 0;
                        System.out.println("Player 1, here are your total points. " + plr_one_score + ".\n");
                        should_run = false;
                    }
                }
               
            }
            System.out.println("Player 2's turn...press enter to roll dice...");
            input.nextLine();
            input.nextLine();
            while (!should_run){
                Random rand = new Random();
   
                if (plr_two_score < 100){
                    int roll = (rand.nextInt(6) + 1);
                    System.out.println("You have rolled a " + roll + ".");
   
                    if (roll > 1){
                        System.out.println("Would you like to roll again? (roll/bank): ");
                        String choice =  input.next();
                        if (choice.equals("roll")){
                            round_score += roll;
                            System.out.println();
                        }
                        else if (choice.equals("bank")){
                            round_score += roll;
                            plr_two_score += round_score;
                            System.out.println();
                            System.out.println("Player 2, here are your total points. " + plr_two_score + ".\n");
                            round_score = 0;
                            should_run = true;
                        }
                        else{
                            round_score += roll;
                            System.out.println("Invalid command!");
                        }
                    }
                    else{
                        System.out.println("Unfortunate, you lose all your round points and your turn ends!");
                        round_score = 0;
                        System.out.println("Player 2, here are your total points. " + plr_two_score + ".\n");
                        should_run = true;
                    }
                }else{
                    break;
                }
 
            }
               
        }
 
        if (plr_one_score >= 100 && plr_two_score < 100){
            System.out.println("The WINNER of the game of PIG is PLAYER 1!");
        }
        else if (plr_one_score < 100 && plr_two_score >= 100){
            System.out.println("The WINNER of the game of PIG is PLAYER 2!");
        }


	}
}
