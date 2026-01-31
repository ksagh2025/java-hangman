package pl.edu.agh.hangman;

public class RenderHangman {
    // Renderowanie obrazków z klasy hangman
    // Pobieram dane z tablicy z metody "Word"
    // Zwracam krok z tablicy HANGMANPICS odpowiadający liczbie błędnych prób
    
    
    private final Word word;

    public RenderHangman(Word word) {
        this.word = word;
    }

    public String render() {
        int failedAttempts = word.getFailedAttempts();

        // zabezpieczenie przed wyjściem poza zakres tablicy
        if (failedAttempts < 0) {
            failedAttempts = 0;
        }

        if (failedAttempts >= Hangman.HANGMANPICS.length) {
            failedAttempts = Hangman.HANGMANPICS.length - 1;
        }

        return Hangman.HANGMANPICS[failedAttempts];
    }
}
