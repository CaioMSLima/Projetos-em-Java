package Empresa.emtities;

public class Departamento {

    private String nome;

    public Departamento(){

    }

    public Departamento(String name) {
        this.nome = name;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }
}
