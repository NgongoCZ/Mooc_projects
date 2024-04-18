public class Payment_Terminal {

    private double money;
    private int affordable_meals;
    private int hearty_meals;

    public Payment_Terminal(){
        this.money = 1000.00;
    }

    public double eat_affordably(double payment){
        if (payment < 2.50){
            return payment;
        }else {
            this.money += 2.50;
            affordable_meals++;
            return payment - 2.50;
        }
    }

    public double eat_heartily(double payment){
        if (payment < 4.30){
            return payment;
        }else {
            this.money += 4.30;
            hearty_meals++;
            return payment - 4.30;
        }
    }

    public boolean eat_affordably(Payment_Card card){
        if (card.getBalance() < 2.50){
            return false;
        }else {
            card.setBalance(card.getBalance() - 2.50);
            affordable_meals++;
            this.money += 2.50;
            return true;
        }
    }

    public boolean eat_heartily(Payment_Card card){
        if (card.getBalance() < 4.30){
            return false;
        }else {
            card.setBalance(card.getBalance() - 4.30);
            hearty_meals++;
            this.money += 4.30;
            return true;
        }
    }

    public void add_money_to_terminal(Payment_Card card, double sum){
        card.setBalance(card.getBalance() + sum);
    }

    @Override
    public String toString(){
        return "Money: " + this.money + ", affordable meals sold: " + this.affordable_meals + ", hearty meals sold: " + this.hearty_meals;
    }

}
