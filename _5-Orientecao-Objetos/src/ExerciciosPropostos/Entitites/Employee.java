package ExerciciosPropostos.Entitites;

public class Employee {

    public String Name;
    public  double GrossSalary;
    public double Tax;

    public  double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary( double percnetage){
        GrossSalary = GrossSalary * (1 +( percnetage / 100));
    }

    public String toString(){
        return Name  + ", $" + String.format("%.2f", NetSalary());
    }
}
