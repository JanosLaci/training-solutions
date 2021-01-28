package week13d04;

import java.time.LocalDate;

class EmployeeForTemplate {
    private String name;
    int yearOfBirth;

    public EmployeeForTemplate(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
