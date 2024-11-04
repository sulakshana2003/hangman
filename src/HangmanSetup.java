import java.util.List;
import java.util.Scanner;

public class HangmanSetup {
    public static boolean printWordState(String word, List<Character> playergusess){
        int correctcount = 0;
        for (int i = 0;i< word.length();i++){
            if (playergusess.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                correctcount++;
            }else {
                System.out.print("-");
            }
        }
        System.out.println();
        return (correctcount == word.length());
    }
    public static boolean getplayerguesses(Scanner Keybord, List<Character> playergusess, String word){
        System.out.print("Enter a letter: ");
        String letterGuess = Keybord.nextLine();
        playergusess.add(letterGuess.charAt(0));
        /*printWordState(word,playergusess);*/
        return word.contains(letterGuess);
    }
    public static void printHangman(int wrongcount){
        System.out.println(" ---------");
        System.out.println(" |       |");
        if (wrongcount >= 1){
            System.out.println(" o");
        }

        if (wrongcount >= 2){
            System.out.print("\\ ");
            if (wrongcount >= 3){
                System.out.println("/");
            }else{
                System.out.println("");
            }
        }

        if (wrongcount >= 4){
            System.out.println(" |");
        }
        if (wrongcount >= 5){
            System.out.print("/ ");
            if (wrongcount >= 6){
                System.out.println("\\");
            }else{
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");
    }
}
