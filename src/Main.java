public class Main {

    private static Employee[] employees = new Employee[10];

    public static void employees() {
        employees[0] = new Employee("Иванов Николай Евгеньевич", 85000, 3);
        employees[1] = new Employee("Аватков Иван Олегович", 80000, 3);
        employees[2] = new Employee("Паравозова Ольга Викторовна", 70500, 1);
        employees[3] = new Employee("Орлов Степан Иванович", 92050, 2);
        employees[4] = new Employee("Романов Иван Сергеевич", 105000, 4);
        employees[5] = new Employee("Гусев Матвей Михайлович", 115000, 4);
        employees[6] = new Employee("Егоров Владлен Данилович", 17000, 1);
        employees[7] = new Employee("Морозов Ермолай Сергеевич", 60000, 5);
        employees[8] = new Employee("Шарапов Корней Алексеевич", 37000, 3);
        employees[9] = new Employee("Самсонов Иосиф Никитевич", 13000, 5);
    }

    public static void main(String[] args) {
        employees();
        printAllInfo();
        System.out.println();
        System.out.println("Сумма зарлат ровна = " + sumSalary());
        System.out.println();
        System.out.println("Сумма мининальной зарлаты у сотрудника " + minSalary());
        System.out.println();
        System.out.println("Сумма максимальной зарлаты у сотрудника " + maxSalary());
        System.out.println();
        System.out.println("Сумма средней зарлаты у сотрудников " + middleSalary());
        System.out.println();
        printFullName();
        System.out.println();
    }

    private static void printAllInfo() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int sumSalary() {
        int summa = 0;
        for (Employee employee : employees) {
            summa += employee.getSalary();
        }
        return summa;
    }

    private static Employee minSalary() {
        Employee minSalary = null;
        for (Employee employee : employees) {
            if (minSalary == null || employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    private static Employee maxSalary() {
        Employee maxSalary = null;
        for (Employee employee : employees) {
            if (maxSalary == null || employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    private static double middleSalary() {
        return(double) sumSalary() / employees.length;
    }

    private static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}