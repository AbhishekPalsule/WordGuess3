/**
 * Created by dullus on 7/27/2016.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) throws IOException
    {
        final int DIFFICULTY = 3;
        ArrayList<String> words = playDiamond(DIFFICULTY);
        //  for(String i : words)
        //  {
        //      System.out.println(i);
        //  }
        Random rand = new Random();
        int randNum = rand.nextInt(words.size());
        //System.out.println(words.get(randNum));
        System.out.println("How many characters match?");
        Scanner sc = new Scanner(System.in);
        int matchCount = sc.nextInt();
        //System.out.println(matchCount);
        while(matchCount != DIFFICULTY){

        }


    }


    public static ArrayList<String> playDiamond(int level)
    {
        ArrayList<String> dictionary = new ArrayList<>();


        if( level == 3) {
            try {
                FileReader fileReader = new FileReader("C:\\Users\\shadabm\\IdeaProjects\\mastermind\\src\\sowpods.txt");
                BufferedReader bufferReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferReader.readLine()) != null) {
                    String word = line;
                    if(word.length() == 3 )
                        dictionary.add(word);
                }

            }catch (Exception e) {

            }
        }
        return dictionary;
    }
}