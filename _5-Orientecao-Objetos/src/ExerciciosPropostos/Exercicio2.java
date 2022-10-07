package ExerciciosPropostos;

import ExerciciosPropostos.Entitites.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

       /* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
        seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
        salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
        afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
        projetada abaixo*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();



        System.out.println("Nome: ");
        employee.Name = scan.nextLine();
        System.out.println("Gross Salary:  " );
        employee.GrossSalary = scan.nextDouble();
        System.out.println("Tax:");
        employee.Tax = scan.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scan.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + employee);


    }
}
