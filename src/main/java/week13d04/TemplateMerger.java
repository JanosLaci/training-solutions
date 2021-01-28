package week13d04;

//Viczián István  9:57 AM
//Mai junior feladat:
//Írj egy a TemplateMerger osztályba egy public String merge(Path file, List<EmployeeForTemplate> employees)
//metódust, ami felolvassa a fájlt, melynek tartalma:
//Az alkalmazott neve: {nev}, születési éve: {ev}
//Nyugodtan beolvashatod egy utasítással!
//Majd a visszatérési értékként add vissza soronként az alkalmazottakat, abban a formátumban,
//mint ahogy a fájlban van, azaz:
//Az alkalmazott neve: John Doe, születési éve: 1980
//Az alkalmazott neve: Jack Doe, születési éve: 1990
//(Persze ehhez kell egy EmployeeForTemplate osztály is a megfelelő attribútumokkal.

//Megj.: a file elérési útvonala: src/main/resources/week13d04resources/templateEmployee.txt

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public static String merge(Path file, List<EmployeeForTemplate> employees){

        StringBuilder outPutRowsAllinOne = new StringBuilder();
        String templateString;

        try {
            templateString = Files.readString(file);
            for (EmployeeForTemplate employee:
                 employees) {
                String actualName = employee.getName();
                String actualYearOfBirth = Integer.toString(employee.getYearOfBirth());
                String nameReplaced= templateString.replace("{nev}", actualName);
                String nameAndYearOfBirthReplaced = nameReplaced.replace("{ev}", actualYearOfBirth);
                outPutRowsAllinOne.append(nameAndYearOfBirthReplaced + "\n");
            }
        } catch (IOException e) {
            throw  new IllegalStateException("Cannot read file.", e);
        }


        return outPutRowsAllinOne.toString();
    }



}
