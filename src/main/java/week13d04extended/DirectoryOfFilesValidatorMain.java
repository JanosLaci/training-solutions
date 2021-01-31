package week13d04extended;
//template file-ok helye (directory): src/main/resources/week13d04extendedResources


import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoryOfFilesValidatorMain {
    public static void main(String[] args) {

        List<String> templateFileNames
                = DirectoryOfFilesValidator
                .getListOfFileNames("src/main/resources/week13d04extendedResources");

        System.out.println(templateFileNames);
        //[templateEmployeeEnglish.txt, ...


        Stream<Path> templatePathsStream
                = DirectoryOfFilesValidator
                .getStreamPathOfFiles("src/main/resources/week13d04extendedResources");

     Set<Path> setOfTemplatePaths = templatePathsStream.collect(Collectors.toUnmodifiableSet());
        System.out.println(setOfTemplatePaths);
        //[src\main\resources\week13d04extendedResources\templateEmployeeHibasNincsNev.txt, ...



    }

}
