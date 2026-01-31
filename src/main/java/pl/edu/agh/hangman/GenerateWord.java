package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class GenerateWord {
    public static String generateWord() {
        String word;
        int losowa;
        ArrayList<String> words = new ArrayList<>();
        String sciezkapliku="src/main/resources/slowa.txt";
        Path path = Paths.get(sciezkapliku);


        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                words.add(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s", x);}

        Random generator = new Random();
        losowa = generator.nextInt(words.size());
        word = "test";
        return words.get(losowa);
    }
}
