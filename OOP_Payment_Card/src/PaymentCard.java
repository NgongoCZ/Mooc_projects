public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance){
        if (openingBalance <= 150){
            this.balance = openingBalance;
        }
    }

    @Override
    public String toString(){
        return "Balance: " + this.balance;
    }

    public void eatAffordably(){
        if (this.balance >= 2.60){
            this.balance -= 2.60;
        }
    }

    public void eatHeartily(){
        if (this.balance >= 4.60){
            this.balance -= 4.60;
        }
    }

    public void addMoney(int amount){
        if (this.balance < 150 && amount >= 0){
            this.balance += amount;
            if (this.balance > 150){
                this.balance = 150;
            }
        }
    }
}
