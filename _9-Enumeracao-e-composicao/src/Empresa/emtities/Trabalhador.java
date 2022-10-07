package Empresa.emtities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelTrabalhador level;
    private Double salarioBase;

   private Departamento departamento;
   private List<HorasContrato> contratos =  new ArrayList<>();

   public Trabalhador(){

   }

    public Trabalhador(String nome, NivelTrabalhador level, Double valorBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = valorBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getLevel() {
        return level;
    }

    public void setLevel(NivelTrabalhador level) {
        this.level = level;
    }

    public Double getValorBase() {
        return salarioBase;
    }

    public void setValorBase(Double valorBase) {
        this.salarioBase = valorBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContrato> getContratos() {
        return contratos;
    }

    public void adicionarContratos(HorasContrato contrato){

       contratos.add(contrato);
    }

    public void removerContratos(HorasContrato contrato){

       contratos.remove(contratos);
    }
    
    public double ganhos(int ano, int mes){
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(HorasContrato c: contratos){

            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);

            if (c_ano == ano && mes == c_mes){
                sum += c.valorTotal();
            }
        }
        return sum;
    }


}

