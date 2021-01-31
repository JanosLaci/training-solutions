package week13d04Senior;

//Viczián István  9:47 AM
//Mai senior feladat:
//Írj egy sablonkezelő rendszert! Hozz létre egy TemplateEngine nevezetű osztályt, benne egy
//void merge(BufferedReader reader, Map<String, Object>, BufferedWriter writer)
//metódussal. Az első paraméter a sablon, a második paraméter pedig az értékek, melyeket ki kell cserélni a sablonban.
//Képzeljük el, hogy ez a sablon:
//Kedves {nev}!
//Megküldjük önnek a következő esedékes számláját {datum} dátummal,
//melynek összege: {osszeg} Ft!
//A fizetési határidő {hatarido}.
//Üdvözlettel,
//Ügyfélszolgálat
//A metódus második paraméterként egy Map-ben kapja az értékeket:
//{"nev" = "John Doe", "datum" = LocalDate}
//A feladat, hogy a writer-be ki kell írni a levelet, de már
//kicserélve az értékeket. (edited)

//Megj.: példa template txt: src/main/resources/week13d04resourcesSenior/templateFile.txt

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Map;

public class TemplateEngine {

    void merge(BufferedReader reader, Map<String , Object> inputMap, BufferedWriter writer){



    }

}
