import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TwoplayerHangman {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner Keybord = new Scanner(System.in);
        System.out.println("1 or 2 player");
        String player = Keybord.nextLine();
        String word;
        if (player.equals("1")){
            File file = new File("C:/Users/Asus/Documents/word.txt");
            Scanner scanner = new Scanner(file);

            List<String> words = new ArrayList<String>();
            while  (scanner.hasNextLine()){
                words.add(scanner.nextLine());
            }
            Random rand = new Random();
            word = words.get(rand.nextInt(words.size()));
            System.out.println(word);
        }else{
            System.out.print("player 1 enter ur word: ");
            word = Keybord.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Ready player 1");
        }


        List<Character> playergusess  = new ArrayList<>();
        /*HangmanSetup.printWordState(word,playergusess);*/

        int wrongcount = 0;

        while(true){

            HangmanSetup.printHangman(wrongcount);
            if (wrongcount>=6){
                System.out.println("U lose!");break;
            }
            HangmanSetup.printWordState(word,playergusess);
            if(!HangmanSetup.getplayerguesses(Keybord,playergusess,word)){
                wrongcount++;
            };

            if (HangmanSetup.printWordState(word,playergusess)){
                System.out.println("u win!");
                break;
            }
            System.out.print("Please enter ur Guess of the word: ");
            if (Keybord.nextLine().equals(word)){
                System.out.println("u win!");
                break;
            }
            else{
                System.out.println("try again");
            }
        }




    }

}
