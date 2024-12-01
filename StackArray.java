package ClassAssignment;

import java.util.*;
//code by Rakib Mridha
public class StackArray {
    public static void main(String [] args){
        Stack<String> games = new Stack<String>();
        games.push("Call of Duty");
        games.push("PUBG");
        games.push("Valorant");
        games.push("Mobile Legand");

        System.out.println("Initial Stack: " + games);

        games.push("Free Fire");
        games.push("Fifa");

        System.out.println("Final Stack: " + games);
    }
}