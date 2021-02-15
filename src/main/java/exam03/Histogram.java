package exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Histogram {


    public String createHistogram(BufferedReader reader) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        int numberOfStars = 0;
        while ((line = reader.readLine()) != null) {
            numberOfStars = Integer.parseInt(line);
            for (int i = 0; i < numberOfStars; i++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

   /* public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream("histogram.txt")))) {
            new Histogram().createHistogram(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read the file", ioe);
        }*/
}
