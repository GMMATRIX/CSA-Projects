import java.util.Scanner;
 
public class PokemonBattle{
 
    static String pokemon;
 
    public static void main(String[] args) {
        battleStart();
        damage();
    }
 
    public static void battleStart(){
        Scanner input = new Scanner(System.in);
        System.out.println("Another trainer is issuing a challenge!\n");
        System.out.println("Zebstrika appeared.\n");
        System.out.print("Which Pokemon do you chose? ");
        String user_pokemon = input.nextLine();
        pokemon = user_pokemon;
        System.out.println("\nYou chose " + pokemon + "!");
        System.out.println("\nIt's a Pokemon battle between " + pokemon + " and Zebstrika! Go!\n");
    }
 
    public static void damage(){
        Scanner input = new Scanner(System.in);
        System.out.println("Zebstrika used Thunderbolt!\n");
        System.out.println("Trainer, what are your " + pokemon + "'s stats?");
        System.out.print("Level: ");
        int level = input.nextInt();
        System.out.print("Attack: ");
        int attack = input.nextInt();
        System.out.print("Defense: ");
        int defense = input.nextInt();
        System.out.print("Base: ");
        int base = input.nextInt();
        System.out.print("STAB: ");
        int stab = input.nextInt();
        System.out.print("HP: ");
        int hp = input.nextInt();
        System.out.print("Learned Moves: ");
        input.nextLine();
        String moves = input.nextLine();
        double modifier =  stab * Math.random() * (1-0.85) + 0.85;
        double damage  = (((2*level+10)/250) + (attack/defense) + 2) * base * modifier;
        System.out.println("\n" + pokemon + " sustained " + (int)damage + " points damage. HP are now " + Math.max((int)(hp - damage), 0) + "\n");
 
        statsTable(level, attack, defense, base, stab, hp, moves);
    }
 
    public static void statsTable(int level, int attack, int defense, int base, int stab, int hp, String moves){
        System.out.println(pokemon + "'s stats: ");
        System.out.println("Level: " + level);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Base: " + base);
        System.out.println("STAB: " + stab);
        System.out.println("HP: " + hp);
        System.out.println("Your pokemon's learned moves: \n" + moves);
    }
}
 
 

