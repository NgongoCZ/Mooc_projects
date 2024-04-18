public class ClockHand {

    private int limit;
    private int value;

    public ClockHand(int limit){
        this.limit = limit;
        this.value = 0;
    }

    public void advance(){
        this.value++;
        if (this.value >= limit){
            this.value = 0;
        }
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        if (this.value < 10){
            return "0" + this.value;
        }else return "" + this.value;
    }
}
