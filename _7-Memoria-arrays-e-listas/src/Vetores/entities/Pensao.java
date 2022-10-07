package Vetores.entities;

public class Pensao {
    private String nome;
    private String email;
    private double quarto;

    public Pensao(String nome, String email, double quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getQuarto() {
        return quarto;
    }

    public void setQuarto(double quarto) {
        this.quarto = quarto;
    }
    public String toString(){
        return quarto
                + ": "
                + nome
                + ", "
                + email;
    }
}
