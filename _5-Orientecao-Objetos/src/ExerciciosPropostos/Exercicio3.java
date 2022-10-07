package ExerciciosPropostos;

import ExerciciosPropostos.Entitites.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
        ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        resolver este problema
        }*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Nome: ");
        student.name = scan.nextLine();
        System.out.println("Grade1: ");
        student.grade1 = scan.nextDouble();
        System.out.println("Grade2: ");
        student.grade2 = scan.nextDouble();
        System.out.println("Grade3: ");
        student.grade3 = scan.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.println("FINAL GRADE = " + finalGrade);
        student.pass();

    }


}
