import java.util.Locale;

public class TiposDeDados {
    public static void main(String[] args) {

        double x = 10.35784;
        String nome = "Dexter";
        int idade = 21;
        double renda = 1500;

        Locale.setDefault(Locale.ENGLISH);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n",x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f  metros%n" , x);

        System.out.printf("%s tem %d anos e ganha %.2f reais por dia%n", nome,idade, renda);



    }
}
