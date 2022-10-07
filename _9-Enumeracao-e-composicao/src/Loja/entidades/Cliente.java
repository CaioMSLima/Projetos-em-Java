package Loja.entidades;

import javax.xml.crypto.Data;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date dataNacimento;

    private Cliente(){

    }

    public Cliente(String nome, String email, Date dataNacimento) {
        this.nome = nome;
        this.email = email;
        this.dataNacimento = dataNacimento;
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

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNacimento = dataNacimento;
    }
}


