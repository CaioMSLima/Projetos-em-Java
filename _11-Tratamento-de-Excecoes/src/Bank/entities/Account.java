package Bank.entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double winthdrawLimit;

    public Account(Integer number, String holder, Double balance, Double winthdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.winthdrawLimit = winthdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWinthdrawLimit() {
        return winthdrawLimit;
    }

    public void setWinthdrawLimit(Double winthdrawLimit) {
        this.winthdrawLimit = winthdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void Deposit(Double deposit){
        balance += deposit;
    }

    public void Winthdraw(Double winthdraw) throws Exception {

        if (winthdraw > winthdrawLimit) {
            throw  new Exception("Withdraw error: The amount exceeds withdraw limit");
        }

        if (winthdraw > balance){
            throw new Exception("Withdraw error: Not enough balance");
        }
        balance -= winthdraw;

    }
}

