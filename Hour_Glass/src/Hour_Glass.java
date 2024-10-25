public class Hour_Glass {
    public static void main(String[] args) {
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
        // go through the number of rows needed
        for (int line = 1; line <= 4; line++){
            // print the number of spaces needed using alogrithm
            for (int i = 1; i <= line; i++){
                System.out.print(" ");
            }
            System.out.print("\\");
            // go through algorithm to print out colons
            for (int j = 1; j <= (10 - 2*line); j++){
                System.out.print(":");
            }
            System.out.print("/");
            System.out.println();
        }
        System.out.println("     ||");
        // go through the number of rows needed
        for (int line = 1; line <= 4; line++){
            // print the number of spaces needed using an algorithm
            for (int i = 1; i <= 5-line; i++){
                System.out.print(" ");
            }
            System.out.print("/");
            // go thorugh algorithm and write colons
            for (int j = 1; j <= 2*(line); j++){
                System.out.print(":");
            }
            System.out.print("\\");
            System.out.println();
        }
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
}

