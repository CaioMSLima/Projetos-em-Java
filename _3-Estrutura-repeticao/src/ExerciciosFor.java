import java.util.Locale;
import java.util.Scanner;

public class ExerciciosFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* System.out.println("Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o\n" +
                "X, se for o caso.\n");

        int valor = scan.nextInt();

        for (int x = 1 ;(x >= 1) && (x <= valor); x++){
            if (x % 2 !=0 ){
                System.out.println(x);
            }

             System.out.println("Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.\n" +
                "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando\n" +
                "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo).000000\n");

        int n = scan.nextInt();
        int in = 0;
        int out = 0;


        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            if((x >= 10) && (x <= 20)){
                in += 1;
            }
            else {
                out ++;
            }
        }
        System.out.printf("%d in  %n", in);
        System.out.printf("%d out %n", out);
        }

        System.out.println("Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste\n" +
                "de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes\n" +
                "conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem\n" +
                "peso 5.\n");

        Locale.setDefault(Locale.US);
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){

            System.out.println("Caso de teste: " +  i ++);
            double valor1 = scan.nextDouble();
            double valor2 = scan.nextDouble();
            double valor3 = scan.nextDouble();

            double media = (valor1*2 + valor2*3 + valor3*5)/(5+3+2);
            System.out.printf("A media %d = %.1f%n",i,media);
        }

       System.out.println("Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo\n" +
                "segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\n");

        int N = scan.nextInt();

        for(int i =0;i < N;i++){
            double z = scan.nextInt();
            double x = scan.nextInt();

            if (x == 0){
                System.out.println("Divisao impossivel");
            }
            else {
             double divisao = z/x;
                System.out.println("O resultado de divisao = " +  divisao);
            }

        }

         System.out.println("Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.\n" +
                "Lembrando que, por definição, fatorial de 0 é 1.");

        int n = scan.nextInt();
        int fatorial = 1;
        for(int i =1; i <= n; i++){
                fatorial *=  i;
        }
        System.out.println("O fatorial é = "+ fatorial);

        System.out.println("Ler um número inteiro N e calcular todos os seus divisores.\n");

        int n = scan.nextInt();

        for (int i = 1; i <= n; i ++){
            if (n % i == 0){
                System.out.println(i + " e divisor de " + n);
            }
        }
        */
        System.out.println("Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,\n" +
                "começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme\n" +
                "exemplo\n");

        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            double elevadoQuadrado = Math.pow(i,2);
            double elevadoCubo = Math.pow(i,3);

            System.out.printf("numero %d, numero elevado ao quadrado %.1f, elevado ao cubao %f.1 %n",i ,elevadoQuadrado , elevadoCubo);
        }


    }
}
