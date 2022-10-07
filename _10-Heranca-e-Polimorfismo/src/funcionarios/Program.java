package funcionarios;

import funcionarios.entidades.Employee;
import funcionarios.entidades.OutsourceEmployee;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scan.nextInt();

        List<Employee> employee = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            scan.nextLine();
            System.out.printf("Employee # %d data: %n", i);
            System.out.print("Outsourced (y/n)? ");
            String x = scan.nextLine();

            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Hours: ");
            int hour = scan.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = scan.nextDouble();

            if (Objects.equals(x, "y")) {
                System.out.print("additionalCharge");
                Double additionalCharge = scan.nextDouble();
                employee.add(new OutsourceEmployee(name, hour, valuePerHour, additionalCharge));
            } else {
                employee.add(new Employee(name, hour, valuePerHour));
            }

        }
        System.out.println();
        for (Employee emp : employee){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }


    }


    }
