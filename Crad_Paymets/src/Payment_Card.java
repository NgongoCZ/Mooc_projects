public class Payment_Card {
    private double balance;

    public Payment_Card(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void addMooney(double increase){
        this.balance += increase;
    }

    public void setBalance(double amount){
        this.balance = amount;
    }

    public boolean takeMoney(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            return true;
        }else return false;
    }

    @Override
    public String toString(){
        return "Balance: " + this.balance;
    }

}
