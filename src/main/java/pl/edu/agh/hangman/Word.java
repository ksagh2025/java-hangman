package pl.edu.agh.hangman;

public class Word {

    public char [] createTableWylosowaneSlowo(String word){
        char [] tablicaWylosowanychSlowo = word.toCharArray();
        return  tablicaWylosowanychSlowo;
    }

    public char[] createTableOfWordToGuess (char[] table) {

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
            } else {
                found = false;
            }
        }
        return found;
    }

    public char[] completeWordToGuess(char[] tableWylosowaneSlowo, char[] tablicaSlowoDoZgadniecia, char letter) {

        for (int i = 0; i < tableWylosowaneSlowo.length; i++) {
            if (tableWylosowaneSlowo[i] == letter) {
                tablicaSlowoDoZgadniecia[i] = letter;
            }
        }
        return tablicaSlowoDoZgadniecia;
    }
}
