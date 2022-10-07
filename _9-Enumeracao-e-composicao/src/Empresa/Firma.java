package Empresa;

import Empresa.emtities.Departamento;
import Empresa.emtities.HorasContrato;
import Empresa.emtities.NivelTrabalhador;
import Empresa.emtities.Trabalhador;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) throws ParseException {

        /*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
        do usuário um mês e mostrar qual foi o salário do funcionário nesse mês.*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamento = scan.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = scan.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalhador = scan.nextLine();
        System.out.print("Salário: ");
        double salarioBase = scan.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador),salarioBase,new Departamento(departamento));

        System.out.print("Quantos contratos esse trabalhador vai ter");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Digite os dados do contrato " + i);
            System.out.print("Data (DD/MM/YYYY): " );
            Date contratoData = sdf.parse(scan.next());
            System.out.print("Valor por hota: ");
            double valorHora = scan.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = scan.nextInt();
            HorasContrato contrato = new HorasContrato(contratoData,valorHora,horas);
            trabalhador.adicionarContratos(contrato);
        }
        System.out.println();
        System.out.print("Entre com o mês e ano para calcular o  salário(MM/YYYY): ");
        String mesAno = scan.next();
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Salario de "+ mesAno + ": " + String.format("%.2f",trabalhador.ganhos(ano,mes)));
        scan.close();
    }




}
