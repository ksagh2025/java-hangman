package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanStarter {
    public static void run () {

        GenerateWord generateWord = new GenerateWord();
        Word word = new Word();
        String wordToGuess = generateWord.generateWord();
        System.out.println("HANGMAN");
        System.out.println("/Aby wyjść z gry wpisz: exit/");
        System.out.println("Zgadnij słowo:");
//        System.out.println(wylosowaneSlowo);
        char[] randomWordTable = word.createRandomWordTable(wordToGuess);
        char[] wordToGuessTable = word.createWordToGuessTable(randomWordTable);
        word.printTable(wordToGuessTable);
        Scanner scanner = new Scanner(System.in);
        String input;
        int counter = 0;

        boolean done = true;
        while (done) {

            System.out.println();
            System.out.println("Podaj literę:");
            input = scanner.nextLine().toLowerCase();
            char letter = input.charAt(0);
            if(input.equals("exit")) break;
            if(word.checkIfWordContainsEnteredChar(randomWordTable, letter)) {
                word.completeWordToGuess(randomWordTable, wordToGuessTable, letter);
                word.printTable(wordToGuessTable);
                if(Arrays.equals(randomWordTable, wordToGuessTable)){
                    System.out.println("\nBrawo Ty! Wygrałeś!");
                    done = false;
                }
            } else {
                counter++;
                System.out.println(Hangman.HANGMANPICS[counter - 1]);
                if(counter == Hangman.HANGMANPICS.length) {
                    System.out.println("GAME OVER");
                    System.out.println("Wylosowanym słowem było: " + wordToGuess);
                    done = false;
                }
            }
        }
        scanner.close();
    }
}
