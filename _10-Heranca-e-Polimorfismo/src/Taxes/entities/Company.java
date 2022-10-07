package Taxes.entities;

public class Company  extends TaxPayer{

    private Integer employeeNumber;

    public Company(String name, Double anualIcome, Integer employeeNumber) {
        super(name, anualIcome);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public double taxValue() {
        double tax = 0.0;

        if (employeeNumber < 11) {

            tax = anualIcome * 0.16;
        }

        else {
            tax = anualIcome * 0.14;
        }

        return tax;
    }
}
