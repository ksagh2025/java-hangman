package pl.edu.agh.hangman;

public class testowo {
    public static void main(String[] args) {
        GenerateWord generateWord = new GenerateWord();
        System.out.println(generateWord.generateWord());

        RenderHangman renderHangman = new RenderHangman();
         renderHangman.render(1);
         System.out.println(renderHangman.render(1));


    }
}
