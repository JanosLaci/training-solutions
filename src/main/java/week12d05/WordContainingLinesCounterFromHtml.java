package week12d05;

//Viczián István  8:53 AM Mai junior/mid feladat:
//Töltsd le az index.hu nyitólapját böngészőből, ez egy html állomány!
// Másold be a projektedbe (index.html) néven! Ez egy szöveges állomány.
// Olvasd be, és számold meg, hány sorban szerepel a koronavírus szó!
//Megj.: a html file útvonala: src/main/resources/indexHuInHtmlFormat/Index.html

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WordContainingLinesCounterFromHtml {
    public static void main(String[] args) throws IOException {

        String fileLocation = "src/main/resources/indexHuInHtmlFormat/Index.html";
        Path htmlPath = Path.of(fileLocation);

        int wordCounter = 0;
        int wordCounterCaseInsensitive = 0;

        List<String> rowsFromHtml = Files.readAllLines(htmlPath);

        for (String rowString : rowsFromHtml) {
            if (rowString.contains("koronavírus")) wordCounter++;
            if (rowString.contains("koronavírus") || rowString.contains("Koronavírus")) wordCounterCaseInsensitive++;
        }

        System.out.println("A \"koronavírus\" szó "
                + wordCounter + " sorban jelenik meg legalább egyszer az \"" + fileLocation + "\" állományban.");
        System.out.println("A \"koronavírus\" vagy a \"Koronavírus\" szó "
                + wordCounterCaseInsensitive + " sorban jelenik meg legalább egyszer az \"" + fileLocation + "\" állományban.");
        System.out.println("A szó toldalékkal is találatnak minősül, pl: a \"koronavírussal\" szó is találat.");
    }
}
