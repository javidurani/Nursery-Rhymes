/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        farm("cow", "moo");
        farm("duck", "quack");        
        // TODO: add another animal to the farm here
        hickory_dickory(1);
        hickory_dickory(2);
        // TODO: make the clock strike three here
        monkeys(10);
        monkeys(9);
        // TODO: call your new methods here ( you must write them first! )
        milk(99);
//        milk(98);
        hokey_pokey("booty");
        bingo("(clap)-I-N-G-O");
        frogs(3);
        
        
      
        
        
    }
    
    
    
    public static void farm(String animal, String sound){
        System.out.println("Old MacDonald had a farm");
        System.out.println("e-i-e-i-o");
        System.out.println("And on that farm he had a " + animal);
        System.out.println("e-i-e-i-o");
        System.out.println("With a " + sound + " " + sound + " here");
        System.out.println("And a " + sound + " " + sound + " there");
        System.out.println("Here a " + sound + " , there a " + sound);
        System.out.println("Everywhere a " + sound + " " + sound);
        System.out.println("Old MacDonald had a farm");
        System.out.println("e-i-e-i-o");    
        
        System.out.println("------------------------------------");
        
    }
    
    public static void monkeys(int number){
        System.out.println(number + " little monkeys jumping on the bed");
        System.out.println("One fell off and bumped his head");
        System.out.println("Mama called the doctor, and the doctor said");
        System.out.println("\"No more monkeys jumping on the bed!\"");
         
        System.out.println("-----------------------------------");
        
    }
    
    public static void hickory_dickory(int time){
        System.out.println("Hickery dickory dock");
        System.out.println("The mouse ran up the clock");
        System.out.println("The clock struck " + time);
        System.out.println("The mouse ran down");
        System.out.println("Hickery dickery dock");
        
        System.out.println("-----------------------------------");
    }
    
    public static void milk(int milk) {
        System.out.println(milk + " bottles of milk on wall");
        System.out.println(milk + " bottles of milk");
        System.out.println("Take one down and pass it around");
        milk--;
        System.out.println(milk + " bottles of milk on the wall");
        
        System.out.println("-----------------------------------");
        
    }
    
    public static void hokey_pokey(String bodyPart) {
        System.out.println("You put your " + bodyPart + " in");
        System.out.println("You put your " + bodyPart + " out ");
        System.out.println("You put your " + bodyPart + " in");
        System.out.println("And you shake it all about");
        System.out.println("You do the Hokey Pokey");
        System.out.println("And you turn yourself about");
        System.out.println("That's what it's all about!");
        
        System.out.println("-----------------------------------");
        
    }

    public static void bingo(String bingo) {
        System.out.println("There was a farmer who had a dog");
        System.out.println("And Bingo was his name-o");
        System.out.println(bingo);
        System.out.println(bingo);
        System.out.println(bingo);
        System.out.println("And Bingo was his name-o");
        
        System.out.println("-----------------------------------");
    }
    
    public static void frogs(int frog) {
        System.out.println(frog + " little speckled frogs");
        System.out.println("sitting on a speckled log");
        System.out.println("eating the most delicious bugs");
        System.out.println("yum, yum");
        System.out.println("one jumped into the pool");
        System.out.println("where it is nice and cool");
        frog--;
        System.out.println("now there are " + frog + " little speckled frogs!");
        System.out.println("ribbit, ribbit");
    }
       
}

