package week13d04extended;

import java.nio.file.Path;
import java.util.List;

public class TemplateMergerMainExtended {

    public static void main(String[] args) {

        //Nem lehet csak year-t megadni: int használata year-hez
       /* List<EmployeeForTemplateExtended> employeeList = List.of(
                new EmployeeForTemplateExtended("Első Sándor", LocalDate.of(1980,01,01)),
                new EmployeeForTemplateExtended("Második Lujza", LocalDate.of(1990, 01,01))
        );*/


        List<EmployeeForTemplateExtended> employeeList = List.of(
                new EmployeeForTemplateExtended("Első Elemér", 1991),
                new EmployeeForTemplateExtended("Második Marika", 1992)
        );

        Path myPath = Path.of("src/main/resources/week13d04resources/templateEmployee.txt");

        String outPutToPrint = TemplateMergerExtended.merge(myPath, employeeList);
        System.out.println(outPutToPrint);

    }

}
