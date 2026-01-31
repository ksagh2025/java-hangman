package pl.edu.agh.hangman;

public class HangmanStarter {
    public static void run () {
        GenerateWord generateWord = new GenerateWord();
        String wylosowaneSlowo = generateWord.generateWord();
        System.out.println("Wylosowane słowo:" + wylosowaneSlowo);



    }
}
