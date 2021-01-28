package week13d04;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class TemplateMergerMain {

    public static void main(String[] args) {

        //Nem lehet csak year-t megadni: int használata year-hez
       /* List<EmployeeForTemplate> employeeList = List.of(
                new EmployeeForTemplate("Első Sándor", LocalDate.of(1980,01,01)),
                new EmployeeForTemplate("Második Lujza", LocalDate.of(1990, 01,01))
        );*/


        List<EmployeeForTemplate> employeeList = List.of(
                new EmployeeForTemplate("Első Elemér", 1991),
                new EmployeeForTemplate("Második Marika", 1992)
        );

        Path myPath = Path.of("src/main/resources/week13d04resources/templateEmployee.txt");

        String outPutToPrint = TemplateMerger.merge(myPath, employeeList);
        System.out.println(outPutToPrint);

    }

}
