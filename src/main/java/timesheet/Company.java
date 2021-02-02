/*
package timesheet;

//A Company osztály tartalmazza
// a projekteket,
// alkalmazottakat,
// valamint annak listáját, hogy ki min mettől-meddig dolgozott.
// A projekteket és alkalmazottak neveit egy-egy fájlból kell beolvasni a konstruktorban,
// (alkalmazottnál vezeték-, keresztnevet külön-külön).
//Az addTimeSheetItem metódusban lehet új elemet felvenni.
//https://e-learning.training360.com/courses/take/java-backend-kepzesi-anyagok/lessons/20463212-01-29-senior-csoport-junior-java-backend-fejleszto-konzultacio-2021-01-04-29-10-00-11-30

//Megj.: a resources file-ok elérési útvonala:
//src/main/resources/timesheet/employees.txt
//src/main/resources/timesheet/projects.txt

import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {


    private InputStream
            employeesFile, projectsFile;

    private List<Employee> employees;
    private List<Project> projects;
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectsFile) {

        this.employeesFile = employeesFile;
        this.projectsFile = projectsFile;

        //kérdés: itt érdemes példányosítani, vagy az attribútumnál?


        List<Employee> generatedListOfEmployees = new ArrayList<>();
        List<Project> generatedListOfProjects = new ArrayList<>();

        BufferedReader readerOfEmployees = new BufferedReader(new InputStreamReader(employeesFile));
        BufferedReader readerOfProjects = new BufferedReader(new InputStreamReader(projectsFile));

        String projectNameFromFile;
        String employeeNameFromFile;
        try {
            while ((projectNameFromFile = readerOfProjects.readLine()) != null) {
                generatedListOfProjects.add(new Project(projectNameFromFile));
            }
            while ((employeeNameFromFile = readerOfEmployees.readLine()) != null) {
                generatedListOfEmployees.add(new Employee(employeeNameFromFile));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }

        this.employees = generatedListOfEmployees;
        this.projects = generatedListOfProjects;

    }


    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));


    }

    //A calculateProjectByNameYearMonth() metódus adja vissza,
// hogy az adott alkalmazott az adott évben és hónapban melyik projekten mennyit dolgozott.

   public List<ReportLine> calculateProjectByNameYearMonth(String employeeName, int year, int month){
        List<ReportLine> outPutListProjectByNameYearMonth = new ArrayList<>();

        //Map előállítása a Company osztályban lévő TimesheetItem-ek listájából,
       // amit az addTimeSheetItem metódus állított össze
       //ez a employeeNameToListOfTimeSheetItemsMap minden employee.getName() String kulcshoz
       //(mivel a kalkulációhoz az employee nevét kérjük - ez egyben feltételezi, h nincs ugyanolyan nevű alkalmazott)
       // visszaadja az employeehoz tartozó eddig felvitt TimesheetItem-eket egy listában
       //kérdés: nem lenne-e jobb egy halmaz, akkor úgymond a véletlen, kétszer bevitt duplikációkat kiszűrné

        Map<String, List<TimeSheetItem>> employeeNameToListOfTimeSheetItemsMap = new HashMap<>();
        List<TimeSheetItem> perEmployeeTimesheetItemsList = new ArrayList<>();

        for (TimeSheetItem timeSheetItem:
             timeSheetItems) {

            if (!employeeNameToListOfTimeSheetItemsMap.containsKey(timeSheetItem.getEmployee().getName())) {
                employeeNameToListOfTimeSheetItemsMap.put(timeSheetItem.getEmployee().getName(), )
            }


        }



        return outPutListProjectByNameYearMonth;

    }



    public void printToFile(String employeeName, int year, int month, Path file) {

        try {
            Writer writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read the file.", ioe);
        }


    }


    public InputStream getEmployeesFile() {
        return employeesFile;
    }

    public InputStream getProjectsFile() {
        return projectsFile;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }


}
*/
