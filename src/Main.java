public class Main {

    public static void main(String[] args) {

        int number = 5473;

        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addNewEmployees(new Employee("Ivanov Ivan Jovanovich", 1, 5643));
        employeeBook.addNewEmployees(new Employee("Petrov Petr Petrovich", 2, 5342));
        employeeBook.addNewEmployees(new Employee("Mamaev Renat Maratovich", 3, 6543));
        employeeBook.addNewEmployees(new Employee("Simonova Olga Petrovna", 4, 5432));
        employeeBook.addNewEmployees(new Employee("Lavsky Artyom Viktorovich", 5, 4346));
        employeeBook.addNewEmployees(new Employee("Tukhovsky Pavel Leonidovich", 1, 8732));
        employeeBook.addNewEmployees(new Employee("Zvyagina Anastasia Petrovna", 2, 4532));
        employeeBook.addNewEmployees(new Employee("Kovalenko Ekaterina Ivanovna", 3, 8632));
        employeeBook.addNewEmployees(new Employee("Sidorov Evgeny Vladimirovich", 4, 4332));
        employeeBook.addNewEmployees(new Employee("Antropovich Tatyana Vitalievna", 5, 4532));

        ///-------------------------------------------------------------------------------

        System.out.println("------------------------------------------------------------------------------");
        employeeBook.printEmployee();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Сумма затрат на ЗП в месяц = " + employeeBook.calculateTotalSalary());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Сотрудник с минимальной ЗП: " + employeeBook.findEmployeeWithMinSalary());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Сотрудник с минимальной ЗП: " + employeeBook.findEmployeeWithMaxSalary());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Среднее значение зарплат = " + employeeBook.calculateTheAverageValueOfSalaries());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Список сотрудников: ");
        employeeBook.printEmployeeFullName();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Индексация зарплаты: ");
        employeeBook.indexEmployeeSalaries(15);
        employeeBook.printEmployee();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Сотрудник с минимальной зп по отделу " + employeeBook.findEmployeeWithMinSalaryOfDepartment(5));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Сотрудник с максимальной зп по отделу " + employeeBook.findEmployeeWithMaxSalaryOfDepartment(2));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Средняя зп по отделу = " + employeeBook.calculateTheAverageValueOfSalariesOfDepartment(3));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Индексация зарплаты по отделу: ");
        employeeBook.indexEmployeeSalariesOfDepartment(1, 10);
        employeeBook.printDepartment(1);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела): ");
        employeeBook.printDepartment(4);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Все сотрудники с зп больше и равно числу: " + number);
        employeeBook.printAllEmployeesWithSalaryGreaterThanOrEqualTheNumber(number);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Все сотрудников с зп меньше числа: " + number);
        employeeBook.printAllEmployeesWithSalaryLessThanTheNumber(number);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Удаление сотрудника по Id");
        employeeBook.removeEmployee(4);
        employeeBook.printEmployee();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Добавление нового сотрудника: ");
        employeeBook.addNewEmployees(new Employee("Streltsov Nikolai Petrovich", 2, 6785));
        employeeBook.printEmployee();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Получения сотрудника по id");
        employeeBook.searchForAnEmployeeById(5);
        System.out.println("------------------------------------------------------------------------------");

    }
}
