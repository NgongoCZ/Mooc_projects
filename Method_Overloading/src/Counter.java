public class Counter {
private int value;

public Counter(int startingValue){
    this.value = startingValue;
}
public Counter(){
    this(0);
}

public int getValue(){
    return this.value;
}

public void increment(){
    this.value++;
}
public void increment(int incrementValue){
    this.value += incrementValue;
}
public void decrement(int decrementValue){
    this.value -= decrementValue;
}

public void decrement(){
    this.value--;
}

}
