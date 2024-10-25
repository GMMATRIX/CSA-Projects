package javaProjects_chap1;

public class OldLady {
	public static void main(String[] args) {
        fly_verse();
        spider_verse();
        bird_verse();
        cat_verse();
        dog_verse();
        cow_verse();
        horse_verse();}
   
    public static void fly_verse() {
        System.out.println("There was an old lady who swallowed a fly");
        System.out.println("I don't know why she swallowed the fly");
        System.out.println("Perhaps she'll die");
        System.out.println("But it's only a fly\nI think I'll cry\nShe gulped it out of the sky\nOh, my!\n");}
 
    public static void spider_verse() {
        System.out.println("There was an old lady who swallowed a spider");
        System.out.println("That wiggled and jiggled and tickled inside her.");
        spider_line(1);
        System.out.println("Gone to the by and by\nSigh\n");}
 
    public static void spider_line(int id) {
        if (id == 1){
            System.out.println("She swallowed the spider to catch the fly");
        }
        else{
            System.out.println("She swallowed the spider to catch the fly.");
        }
        refrain();}
 
    public static void bird_verse() {
        System.out.println("There was an old lady who swallowed a bird.");
        System.out.println("How absurd! She swallowed a bird!");
        bird_line(1);
        System.out.println("She'll leave us high and dry\n");}
 
    public static void bird_line(int id) {
        System.out.println("She swallowed the bird to catch the spider.");
        spider_line(id);}
 
    public static void cat_verse() {
        System.out.println("There was an old lady who swallowed a cat.");
        System.out.println("Imagine that! She swallowed a cat.");
        cat_line(0);
        System.out.println("I hope it's a lie.\n");}
 
    public static void cat_line(int id) {
        System.out.println("She swallowed the cat to catch the bird.");
        bird_line(id);}
 
    public static void dog_verse() {
        System.out.println("There was an old lady who swallowed a dog.");
        System.out.println("She went whole hog to swallow the dog.");
        dog_line(0);
        System.out.println("There's a tear in my eye.\n");}
 
    public static void dog_line(int id) {
        System.out.println("She swallowed the dog to catch the cat.");
        cat_line(id);}
 
    public static void cow_verse() {
        System.out.println("There was an old lady who swallowed a cow.");
        System.out.println("I don't know how she swallowed the cow.");
        cow_line(0);
        System.out.println("I'd rather have ham on rye.\nAnd she had a frog on the sly.\nShe did it in one try.\n");}
 
    public static void cow_line(int id) {
        System.out.println("She swallowed the cow to catch the dog.");
        dog_line(id);}
 
    public static void horse_verse() {
        System.out.println("There was an old lady who swallowed a horse.");
        System.out.println("She died, of course.");
        System.out.println("It was the last course.");
        System.out.println("I'm filled with remorse.\nWhat's left to say...\nEven the artist is crying.\nWe'll miss her dearly.");
        System.out.println("It is such a loss.\nShe had no time to floss.\nShe missed out on the sauce.\n\nMoral: Never swallow a horse.\n");}
 
    public static void refrain() {
        System.out.println("I don't know why");
        System.out.println("She swallowed the fly");
        System.out.println("Perhaps she'll die.");}
}
