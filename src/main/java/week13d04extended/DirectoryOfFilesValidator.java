package week13d04extended;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DirectoryOfFilesValidator {

    static List<String> getListOfFileNames(String pathNameOfDirectory){
        List<String> stringListOfFileNames = new ArrayList<>();
        File[] templateFilesArray = new File(pathNameOfDirectory).listFiles();

        if (templateFilesArray != null){
            for (File file : templateFilesArray) {
            if (file.isFile())  stringListOfFileNames.add(file.getName()); } }

        return stringListOfFileNames;
    }

    static Stream<Path> getStreamPathOfFiles (String pathNameOfDirectory) {
        Stream<Path> streamPathOfFiles;
        try { streamPathOfFiles = Files.list(Path.of(pathNameOfDirectory)); }
        catch (IOException e) { throw new IllegalStateException("No such directory found."); }
        return streamPathOfFiles;
    }




}
