package timesheet;

public class Employee {

    private String name;

    public Employee(String firstName, String lastName) {
        this.name = firstName + " " + lastName; }

    public Employee(String fullName){
        this.name = fullName;
    }


    public String getName() {
        return name;

    }
}
