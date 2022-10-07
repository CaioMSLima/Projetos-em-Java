package funcionarios.entidades;

public class OutsourceEmployee  extends Employee {

    public Double additionalCharge;

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getaDoubleCharge() {
        return additionalCharge;
    }

    public void setaDoubleCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge ;
    }



}


