package entities;

public class Informacoes {

    private int numeroConta;
    private String nome;
    private double valor;

    public Informacoes(int numeroConta, String nome, double valorInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(valorInicial);
    }

    public Informacoes(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void deposito(double valor){
        this.valor += valor;
    }

    public void  saque(double valor){
        this.valor -= (valor + 5);
    }

    public String toString() {
        return "Account " +
                numeroConta +
                " Holder: "+
                nome+
                String.format(" Balance: $ %.2f", valor);
    }
}

