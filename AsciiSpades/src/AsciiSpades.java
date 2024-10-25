/*
 * The Program AsciiSpades produces a playing card with the face of Ace of Spades
 * ------------------------------------------------------------------------------
 * The program begins with the piecing together of several print lines to create the shape of an A (representing Ace)
 * Then a method by the name of smallSpadesTop (which takes in two parameters; number of lines and the character to be used for the spade shape)
 * is created. This method has a nested for loop to create a small spade pointing upwards.
 * Under that, there is another method by the name of centerSpade which has many printlines to create an intricate large spade shape.
 * Then the final method, smallSpadesBottom (which takes two parameters; number of lines and the character to be used for the spade shape),
 * uses another nested for loop to create a small spade pointing downwards.
 * Finally, to finish the program, several print lines have been used to piece together an A pointing downwards to create the
 * image of a playing card with the face, ACE OF SPADES.
 */
 
public class AsciiSpades {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("     a");
        System.out.println("    aaa");
        System.out.println("   aa aa");
        System.out.println("  aa   aa");
        System.out.println("  aaaaaaa");
        System.out.println(" aaaaaaaaa");
        System.out.println(" aa     aa");
        System.out.println("aaaa   aaaa\n");
 
        smallSpadesTop(5, "s");
        centerSpade();
        smallSpadesBottom(1, "s");
 
        System.out.println("\n                                                              aaaa   aaaa");
        System.out.println("                                                               aa     aa");
        System.out.println("                                                               aaaaaaaaa");
        System.out.println("                                                                aaaaaaa");
        System.out.println("                                                                aa   aa");
        System.out.println("                                                                 aa aa");
        System.out.println("                                                                  aaa");
        System.out.println("                                                                   a");
        System.out.println("");
 
    }
 
    public static void smallSpadesTop(int line, String character){
        for (; line>=1; line--){
            for (int i = 1; i<=(line+1)-1; i++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(11-2*line); j++){
                System.out.print(character);
                if (j == 9){
                    System.out.println("\n sssssssss\n sssssssss\n  ss s ss \n    sss\n    sss".replace("s", character));
                }
            }
            System.out.println();
        }
    }
 
    public static void centerSpade(){
        System.out.println("""
 
 
                                                    s
                                                   sss
                                                  sssss
                                                 sssssss
                                                ssss ssss
                                               ssss s ssss
                                              ssss sss ssss
                                             ssss sssss ssss
                                            ssss sssssss ssss
                                           ssss ssss ssss ssss
                                          ssss ssss s ssss ssss
                                         ssss ssss sss ssss ssss
                                        ssss ssss ss ss ssss ssss
                                       ssss ssss ss s ss ssss ssss
                                      ssss ssss ss sss ss ssss ssss
                                     ssss ssss sss sss sss ssss ssss
                                    ssss ssss sssss s sssss ssss ssss    
                                   ssss ssssss sssss sssss ssssss ssss
                                   sss ssssssss sss s sss ssssssss sss
                                  ssss sss sssss s sss s sssss sss ssss
                                  sss sssss ss ss ss ss ss ss sssss sss
                                  sss sssss ssss s sss s ssss sssss sss
                                 sss ssss  ssss sss s sss ssss  ssss sss
                                 sss sss sssss sssss sssss sssss sss sss
                                 sss sss ssss sssssssssssss ssss sss sss
                                 sss sss sss sssss sss sssss sss sss sss
                                 sss ssss   sssss s s s sssss   ssss sss
                                 sss sssssssssss sss sss sssssssssss sss
                                 sss ssssssssss sssssssss ssssssssss sss
                                 ssss ssssssss sssssssssss ssssssss ssss
                                  sss  sssss  ssss sss ssss  sssss  sss
                                  sssss     sssss  sss  sssss      ssss
                                   sssssssssssss   sss   sssssssssssss
                                    sssssssssss   sssss   sssssssssss
                                      sssssss     sssss     sssssss  
                                                 sssssss
                                                 sssssss
                                                sssssssss
                                               sssssssssss                        
 
 
                """);
    }
 
    public static void smallSpadesBottom(int line, String character){
        String[] tail = {"   sss", "   sss", " ss s ss", "sssssssss", "sssssssss"};
        for (; line<= 5; line ++){
            for (int i = 1; i<=63; i++){
                System.out.print(" ");
            }
            System.out.println(tail[line-1].replace("s", character));
        }
 
        for (int l = 1; l <= 5; l ++){
            for (int i = 1; i<=(l-1)+63; i++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(11-2*l); j++){
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
 
 
 
 

