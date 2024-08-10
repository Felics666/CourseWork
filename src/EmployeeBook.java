import java.util.Arrays;

public class EmployeeBook {

    public final Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    ////---------------------------------------------------------------------------------/////

    /// Basic difficulty
    public void printEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    } /// output of all fields

    public int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    } /// the amount of expenses per month

    public Employee findEmployeeWithMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary.getSalary()) {
                    minSalary = employee;
                }
            }
        }
        return minSalary;
    } /// Search for a min wage

    public Employee findEmployeeWithMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary.getSalary()) {
                    maxSalary = employee;
                }
            }
        }
        return maxSalary;
    } /// Search for a max wage

    public int size() {
        int size = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                size++;
            }
        }
        return size;
    }

    public float calculateTheAverageValueOfSalaries() {
        return calculateTotalSalary() / (float) size();
    } /// The average value of salaries

    public void printEmployeeFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    } /// Print the full name of all employees

    ////---------------------------------------------------------------------------------/////

    ///// Increased difficulty
    public void indexEmployeeSalaries(int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    } /// salary indexation by percentage

    public Employee findEmployeeWithMinSalaryOfDepartment(int dep) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != dep) {
                    continue;
                }
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    } /// Search for the min wage by department

    public Employee findEmployeeWithMaxSalaryOfDepartment(int dep) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != dep) {
                    continue;
                }
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    } /// Search for the max wage by department

    public int departmentCount(int dep) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    count++;
                }
            }
        }
        return count;
    }

    public int calculateTotalSalaryOfDepartment(int dep) {

        int sum = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    sum += employee.getSalary();
                }
            }
        }
        return sum;
    } /// The amount of expenses by department

    public float calculateTheAverageValueOfSalariesOfDepartment(int dep) {
        return calculateTotalSalaryOfDepartment(dep) / (float) departmentCount(dep);
    } /// Average salary by department

    public void indexEmployeeSalariesOfDepartment(int dep, int percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    int currentSalary = employee.getSalary();
                    employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
                }
            }
        }
    } /// salary indexation by percentage

    public void printDepartment(int dep) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == dep) {
                    System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата " + employee.getSalary());
                }
            }
        }
    } /// Print all employees of the department

    public void printAllEmployeesWithSalaryLessThanTheNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < number) {
                    System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата " + employee.getSalary());
                }
            }
        }
    } /// All employees with fewer than one salary

    public void printAllEmployeesWithSalaryGreaterThanOrEqualTheNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= number) {
                    System.out.println(employee.getId() + ". ФИО: " + employee.getFullName() + ", зарплата " + employee.getSalary());
                }
            }
        }
    } /// All employees with a salary greater than (or equal to) the number

    ////---------------------------------------------------------------------------------/////

    //////  It's very difficult
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public boolean addNewEmployees(Employee newEmployees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployees;
                return true;
            }
        }
        return false;
    }

    public void searchForAnEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getId() == id) {
                    System.out.println("ФИО: " + employee.getFullName() + " | Отдел: " + employee.getDepartment() + " | зарплата " + employee.getSalary());
                }
            }
        } /// searchForAnEmployeeById

    }

}
