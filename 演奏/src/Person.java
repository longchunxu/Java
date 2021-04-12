public class Person {
    public void play(Instrument instrument){

        instrument.play();
    }
    public static void main(String[] args) {
    Person p1= new Person();
    Erhu erhu =new Erhu();
    Piano piano= new Piano();
    p1.play(erhu);
    p1.play(piano);
    }
}
