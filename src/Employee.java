

import java.util.Objects;

public class Employee {

    private String fullName;
    private int salary;
    private static int counter = 1;
    private int department;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.id = counter++;
        this.salary = validateSalary(salary);
        this.department = validateDepartment(department);
    }

    public int getId (){
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setFullName() {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = validateSalary(salary);
    }

    public void setDepartment(int department) {
        this.department = validateDepartment(department);
    }

    private int validateDepartment(int department){
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Error!!! Enter the correct department number.");
        }
        return department;
    }

    private int validateSalary(int salary){
        if (salary < 0) {
            throw new IllegalArgumentException("Error!!! The salary cannot be negative.");
        }
        return salary;
    }

    @Override
    public String toString() {
        return "№: " + id + " | ФИО: " + fullName + " | Отдел № " + department + " | Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && department == employee.department && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department, id);
    }
}

