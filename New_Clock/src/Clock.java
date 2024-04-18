public class Clock {
    private ClockHand seconds;
    private ClockHand minutes;
    private ClockHand hours;

    public Clock(){
        this.seconds = new ClockHand(60);
        this.minutes = new ClockHand(60);
        this.hours = new ClockHand(24);
    }

    public void advance(){
        seconds.advance();
        if (this.seconds.getValue() == 0){
            this.minutes.advance();
            if (this.minutes.getValue() == 0){
                this.hours.advance();
            }
        }
    }

    public String toString(){
        return this.hours + " : " + this.minutes + " : " + this.seconds;
    }
}
