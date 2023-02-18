/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interactivestory;

/**
 *
 * @author allenhorton
 */
import java.util.Scanner;
        
public class InteractiveStory {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        startStory(input);
    }
    
    public static void startStory(Scanner input) {
        System.out.println("Walk: A Story");
        System.out.println("By Allen F. Horton");
        System.out.println("Start story? (Y/N)");
        
        String choice = input.nextLine();
        if(choice.equals("Y")) {
            treeStory(input);
        } else if (choice.equals("N")) {
            System.out.println("Thank you for reading.");
            System.exit(0);
        }
    }
    
    public static void treeStory(Scanner input) {
        System.out.println("\n\nWhat a beautiful day in God's creation.");
        System.out.println("B. stood in the shade of a sycamore.");
        System.out.println("Day was dying.  A magenta glow began to creep");
        System.out.println("over the treetops across the lake.");
        System.out.println("B. thought, \'What shall I do?\'");
        System.out.println("\\\\Type \'lake\' to go to the lake");
        System.out.println("\\\\Type \'home\' to go home.");
        
        String choice = input.nextLine();
        if (choice.equals("lake")) {
            lakeStory(input);
        } else if (choice.equals("home")) {
            homeStory(input);
        }
        
    }
    
    public static void lakeStory (Scanner input) {
        System.out.println("\n\n\'The lake\', B. thought.  And so he went.");
        System.out.println("It had been a hot day.  Humidity held close");
        System.out.println("to the skin.");
        System.out.println("The waters of the lake were growing darker");
        System.out.println("with white reflections glittering in its waves.");
        System.out.println("B. was walking among the cattails when");
        System.out.println("suddenly he heard a scream coming from the woods.");
        System.out.println("\\\\Type \'woods\' to go to the woods");
        System.out.println("\\\\Type \'home\' to go home.");
        
        String choice = input.nextLine();
        if (choice.equals("woods")) {
            woodsStory(input);
        } else if (choice.equals("home")) {
            homeStory(input);
        }
    }
    
    public static void homeStory (Scanner input) {
        System.out.println("\n\nB. went home.");
        System.out.println("Amidst nature and the late afternoon the house");
        System.out.println("had an industrial appearance - grey unpainted ");
        System.out.println("walls, a cube-like shape.  Banks of limpid");
        System.out.println("windows reflected back the magenta sky.");
        System.out.println("Coyotes yapped in chorus in the distance.");
        System.out.println("B. entered.");
        System.out.println("The exterior of the house had been indicative of");
        System.out.println("the interior.  Inside was cacophonous open space");
        System.out.println("filled with echos and the hum of systems.");
        System.out.println("The furniture was sparse.");
        System.out.println("B. wondered what he felt like doing.");
        System.out.println("\\\\Type \'drink\' to have a drink");
        System.out.println("\\\\Type \'tv\' to watch TV.");
        
        String choice = input.nextLine();
        if (choice.equals("drink")) {
            drinkStory(input);
        } else if (choice.equals("tv")) {
            tvStory(input);
        }
    }
    
    public static void tvStory (Scanner input) {
        System.out.println("\n\nB. let himself drop into cushions of the red");
        System.out.println("leather sofa.  In the crack between cushions he");
        System.out.println("found the remote.  The tube was a boxy analogue");
        System.out.println("type, its convex picture peppered with static snow.");
        System.out.println("Before he knew it, hours had passed.");
        System.out.println("Sleep crept into B.'s eyes; however, the night" );
        System.out.println("was young.");
        System.out.println("\\\\Type \'sleep\' to go to sleep.");
        System.out.println("\\\\Type \'drink\' to have a drink");
        
        String choice = input.nextLine();
        if (choice.equals("sleep")){
            sleepStory(input);
        } else if (choice.equals("drink")){
            drinkStory(input);
        }
    }
    
    
    
    public static void sleepStory (Scanner input) {
        System.out.println("\n\nB. threw his jeans and coat over a chair.");
        System.out.println("His bed was nothing but a mattress on the floor.");
        System.out.println("He collapsed into it.");
        System.out.println("B. laid his head upon a bank of pillows, ");
        System.out.println("the pillows placed like sandbags stacked against");
        System.out.println("a flood.  He pulled the desheveled blankets up to");
        System.out.println("his chest.  Sleep was heavy on him now.");
        System.out.println("B. felt the fabric between his fingers.");
        System.out.println("He made out shapes upon the ceiling.");
        System.out.println("Sleep fell like a thunderclap");
        System.out.println("\\\\Type \'end\' if you would like to end the");
        System.out.println("\\\\story here.");
        System.out.println("\\\\Type \'dream\' to find out B.'s dream.");
        
        String choice = input.nextLine();
        if (choice.equals("end")) {
            startStory(input);
        } else if (choice.equals("dream")) {
            dreamStory(input);
        }
    }
    
    public static void dreamStory(Scanner input) {
        System.out.println("\n\nB. dreamed -");
        System.out.println("He dreamed he stood upon purple sands.");
        System.out.println("A yellow sea scretched to the flat horizon.");
        System.out.println("The sky was blue, yet in it it was a green sun.");
        System.out.println("The wind chanted in a language he did not");
        System.out.println("understand -");
        System.out.println("\"Owoo ja nabwe je ah\"...");
        System.out.println("It was a sweet music-");
        System.out.println("\"Owoo ja nabwe je ah\"...\n\n");
        System.out.println("Thank you for reading!");
        System.out.println("Please type \"fin\" to return to the home screen.\n\n\n");
        
        String choice = input.nextLine();
        if (choice.equals("fin")) {
            startStory(input);
        } else {
            System.out.println("That is not a correct input.");
            dreamStory(input);
        }
    }
       
    }
