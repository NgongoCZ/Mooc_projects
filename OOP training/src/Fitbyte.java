public class Fitbyte {

   private int age;

   public Fitbyte(){
       this.age = 0;
   }

    public void growOlder(){
        this.growOlder(8);
    }
   public void growOlder(int years){
       this.age += years;
   }


}
