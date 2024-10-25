import java.util.Random;
import java.util.Scanner;

public class RPS_Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
        System.out.print("Player 1,\nHow many games would you like to play: ");
        int p1_games = input.nextInt();
        for (int i = 1; i <= p1_games; i++){
            String[] choices = {"rock", "paper", "scissors"};
            Random rand = new Random();
            String cpu_choice = choices[rand.nextInt(3)];
   
            System.out.print("Player 1, enter your move: ");
            String p1_choice = input.next();
            p1_choice = p1_choice.toLowerCase();
   
            if (p1_choice.equals(cpu_choice)){
                System.out.println("It's a tie!");
            }
            else if (p1_choice.equals("rock") && cpu_choice.equals("paper")){
                System.out.println("You lost!");
            }
            else if (p1_choice.equals("rock") && cpu_choice.equals("scissors")){
                System.out.println("You win!");
            }
            else if (p1_choice.equals("paper") && cpu_choice.equals("scissors")){
                System.out.println("You lost!");
            }
            else if (p1_choice.equals("paper") && cpu_choice.equals("rock")){
                System.out.println("You win!");
            }
            else if (p1_choice.equals("scissors") && cpu_choice.equals("rock")){
                System.out.println("You lost!");
            }
            else if (p1_choice.equals("scissors") && cpu_choice.equals("paper")){
                System.out.println("You win!");
            }
            else{
                System.out.println("Invalid move");
            }
        }
        System.out.println();
 
        System.out.print("Now Player 2,\nHow many games would you like to play: ");
        int p2_games = input.nextInt();
        for (int i = 1; i <= p2_games; i++){
            String[] choices = {"rock", "paper", "scissors"};
            Random rand = new Random();
            String cpu_choice = choices[rand.nextInt(3)];
   
            System.out.print("Player 2, enter your move: ");
            String p2_choice = input.next();
            p2_choice = p2_choice.toLowerCase();
   
            if (p2_choice.equals(cpu_choice)){
                System.out.println("It's a tie!");
            }
            else if (p2_choice.equals("rock") && cpu_choice.equals("paper")){
                System.out.println("You lost!");
            }
            else if (p2_choice.equals("rock") && cpu_choice.equals("scissors")){
                System.out.println("You win!");
            }
            else if (p2_choice.equals("paper") && cpu_choice.equals("scissors")){
                System.out.println("You lost!");
            }
            else if (p2_choice.equals("paper") && cpu_choice.equals("rock")){
                System.out.println("You win!");
            }
            else if (p2_choice.equals("scissors") && cpu_choice.equals("rock")){
                System.out.println("You lost!");
            }
            else if (p2_choice.equals("scissors") && cpu_choice.equals("paper")){
                System.out.println("You win!");
            }
            else{
                System.out.println("Invalid move");
            }
        }
        System.out.println();
 
        System.out.print("Player 1: \n - How many times did you play the game? : ");
        int one_play = input.nextInt();
        System.out.print(" - How many times did you win the game? : ");
        int one_win = input.nextInt();
        System.out.print(" - How many moves did it take you before you won the game? : ");
        int one_move = input.nextInt();
 
        System.out.print("\nNow Player 2: \n - How many times did you play the game? : ");
        int two_play = input.nextInt();
        System.out.print(" - How many times did you win the game? : ");
        int two_win = input.nextInt();
        System.out.print(" - How many moves did you play in the game? : ");
        int two_move = input.nextInt();
        System.out.println();
 
        double one_stats = (one_win/one_play);
        double two_stats = (two_win/two_play);
 
        if (one_stats == two_stats) {
        	System.out.println("It's a tie. Both players have similar performance! Time for a tie breaker");
            if (one_move > two_move){
                System.out.println("Player 2 wins the tiebreaker!");
            }
            else if (one_move < two_move){
                System.out.println("Player 1 wins the tiebreaker!");
            }
            else{
                System.out.println("Unbelievable..It's another tie!");
            }
        }
        if (one_stats > two_stats){
            System.out.println("Player one has performed better with better win percentage! of " + one_stats);
        }
        else if (two_stats > one_stats){
            System.out.println("Player two has performed better with better win percentage! of " + two_stats);
        }
        else{
            System.out.println("Something went wrong");
        }


	}
}
