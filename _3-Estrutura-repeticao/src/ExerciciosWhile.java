import java.util.Scanner;

public class ExerciciosWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha\n" +
                "incorreta informada, escrever a mensagem \"Senha Invalida\". Quando a senha for informada corretamente deve ser\n" +
                "impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere que a senha correta é o valor 2002\n");

        int senha = scan.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}
		System.out.println("Acesso Permitido");

		System.out.println("Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema\n" +
                "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo\n" +
                "menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)\n");

        int x = scan.nextInt();
        int y = scan.nextInt();

        while ((x != 0) && (y != 0)){

            if ((x > 0) && (y > 0)){
                System.out.println("primeiro quadrante ");
            }
            else if ((x < 0) && (y > 0)){
                System.out.println("segundo quadrante ");
            }
            else if ((x < 0) && (y < 0)){
                System.out.println("terceiro quadrante ");
            }
            else {
                System.out.println("quarto quadrante ");
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }

        System.out.println("Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva\n" +
                "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel\n" +
                "4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até\n" +
                "que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a\n" +
                "mensagem: \"MUITO OBRIGADO\" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo\n");


        int codigo = scan.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while ( codigo !=4){

            if (codigo == 1){
                alcool += 1;
            }
            else if (codigo == 2) {
                gasolina += 1;
            }
            else if (codigo == 3) {
                diesel += 1;
            }
            else{
                System.out.println("Esse coigo nao é valido");
            }
            codigo  = scan.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }

}

