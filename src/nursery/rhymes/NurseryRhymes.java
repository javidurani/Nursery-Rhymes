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
        System.out.println("");
    }
    
    // TODO add your new methods here
    
}
