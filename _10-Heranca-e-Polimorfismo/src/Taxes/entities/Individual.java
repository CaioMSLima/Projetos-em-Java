package Taxes.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualIcome, Double healthExpenditures) {
        super(name, anualIcome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxValue() {

        Double tax = 0.0;

        if (anualIcome < 20000.00){
            tax = ( anualIcome * 0.15) - (0.5 * healthExpenditures);
        }

        else {
            tax =  ( anualIcome * 0.25) - (0.5 * healthExpenditures);
        }
        return tax ;
    }
}
