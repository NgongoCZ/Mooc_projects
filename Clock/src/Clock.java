public class Clock {

    private Clockhand second;
    private Clockhand minutes;
    private Clockhand hours;

    public Clock(){
        this.second = new Clockhand(60);
        this.minutes = new Clockhand(60);
        this.hours = new Clockhand(24);
    }

    public void advance(){
        this.second.advance();

        if (this.second.valueOf() == 0){
            this.minutes.advance();

            if (this.minutes.valueOf() == 0){
                this.hours.advance();
            }
        }
    }

    @Override
    public String toString(){
        return second + " : " + minutes + " : " + hours;
    }


}
