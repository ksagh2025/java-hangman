package pl.edu.agh.hangman;

public class Word {



    public char [] createRandomWordTable(String word){
        return word.toLowerCase().toCharArray();
    }

    public char[] createWordToGuessTable(char[] table) {

        int wordLength = table.length;
        char [] guess = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            guess[i] = '_';
        }
        return guess;
    }

    public void printTable(char[] table) {

        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]);
        }
    }

    public boolean checkIfWordContainsEnteredChar(char[] table, char letter) {

        boolean found = false;
        for (int i = 0; i < table.length; i++) {
            if (table[i] == letter) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        return found;
    }

    public char[] completeWordToGuess(char[] randomWordTable, char[] wordToGuessTable, char letter) {

        for (int i = 0; i < randomWordTable.length; i++) {
            if (randomWordTable[i] == letter) {
                wordToGuessTable[i] = letter;
            }
        }
        return wordToGuessTable;
    }
}
