package timesheet;

//Az addTimeSheetItem metódusban lehet új elemet felvenni.
// Fontos, hogy itt az időpontok mindig egy napra essenek,
// valamint a mikortól korábbi időpont legyen mint a meddig.
// Ilyen elemeket bármikor hozzáadhatunk a nyilvántartáshoz.
// Ezeket a TimeSheetItem konstruktorában kell ellenőrizni.

import java.time.Duration;
import java.time.LocalDateTime;



public class TimeSheetItem {

    private Employee employee;
    private Project project;
    private LocalDateTime
            beginDate, endDate;

    public TimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {

        //az időpontok mindig egy napra essenek (IllegalArgumentException)
        if (!beginDate.toLocalDate().equals(endDate.toLocalDate()))
            throw new IllegalArgumentException("A kezdő időpont dátuma és a záró időpont dátuma nem egyezik!");

        //valamint a mikortól korábbi időpont legyen mint a meddig: isAfter nem elég, !isBefore kell

        else if (!beginDate.isBefore(endDate))
            throw new IllegalArgumentException("A kezdő időpont nem korábbi, mint a záró időpont!");

        else    this.employee = employee;
                this.project = project;
                this.beginDate = beginDate;
                this.endDate = endDate;


    }


    long hoursBetweenDates(){
        long durationBetweenDateTimes = Duration.between(beginDate, endDate).toHours();
        return durationBetweenDateTimes;
    }

    //immutable: csak getterek deklarálása


    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }
}
