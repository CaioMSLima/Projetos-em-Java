package Loja;

import Loja.entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Data do aniversário(DD/MM/YYYY): ");
        Date dataNacimento = sdf.parse(scan.next());

        System.out.println("Inicie os dados do pedido: ");
        System.out.print("Estatus: ");
        scan.nextLine();
        EstatusPedido estatusPedido = EstatusPedido.valueOf(scan.next());
        System.out.print("Quantos pordutos tem em seu pedido? ");
        int quantidade = scan.nextInt();
        Date momento = new Date();
        Pedidos cliente = new Pedidos(momento,estatusPedido,new Cliente(nome,email,dataNacimento));

        for (int i = 1; i <= quantidade;i++){

            System.out.println("Entre com  o dados do produto #" + i );
            System.out.print("Nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Preço do produto: ");
            double preco = scan.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = scan.nextInt();
            PedidosItem pedido = new PedidosItem(quantidadeProduto,preco,new Produtos(nomeProduto,preco));

            cliente.adicionarItem(pedido);
        }

        System.out.println(cliente);


    }

}
