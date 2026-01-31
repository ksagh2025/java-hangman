package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class GenerateWord {
    public static String generateWord() {
        String word;
        ArrayList<String> words = new ArrayList<>();
        String sciezkapliku="resources/slowa.txt";

        try (BufferedReader reader = Files.newBufferedReader(sci.toPath())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s", x);}

        word = "test";
        return word;
    }
}
