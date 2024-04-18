
public class Timer {
    private ClockHand hundredsOfSeconds;
    private ClockHand seconds;

    public Timer(){
        this.hundredsOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        hundredsOfSeconds.advance();
        if (hundredsOfSeconds.getValue() == 0){
            seconds.advance();
        }
    }

    @Override
    public String toString(){
        return this.seconds + " : " + this.hundredsOfSeconds;
    }
}
