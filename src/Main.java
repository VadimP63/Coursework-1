import java.io.OptionalDataException;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов И.И.", 1, 45_536);
        employees[1] = new Employee("Кулешов Н.Н.", 2, 94_850);
        employees[2] = new Employee("Комаров М.С.", 3, 76_654);
        employees[3] = new Employee("Козлов А.В.", 4, 52_225);
        employees[4] = new Employee("Морозов А.В.", 5, 73_621);
        employees[5] = new Employee("Чуксаев Д.Ю.", 2, 92_155);
        employees[6] = new Employee("Хованец М.В.", 1, 53_114);
        employees[7] = new Employee("Бухтин А.С.", 2, 100_000);
        employees[8] = new Employee("Смускин С.В.", 5, 80_756);
        employees[9] = new Employee("Житников А.С.", 5, 87_777);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        int sum = getSum(employees);

        System.out.println("Сумма зарплат сотрудников = " + sum);

        int min = minSalary(employees);

        System.out.println("Минимальная зарпалата сотрудника = " +min);

        int max = maxSalary(employees);

        System.out.println("Максимальная зарплата сотрудника = " + max);

        float averageSalary = sum / employees.length;

        System.out.println("Средняя заработная плата = " + averageSalary);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }

    }

    public static int getSum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;

    }

    public static int minSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }
    public static int maxSalary(Employee[] employees) {
        int max = employees[1].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }
    public void printName () {

    }
}
