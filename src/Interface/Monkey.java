package Interface;

public class Monkey implements Animal,Climmable{

    @Override
    public void feed() {

    }

    @Override
    public void makeSound() {
        System.out.println("Monkey make sounds Ooh aah!");
    }

    @Override
    public void climb() {
        Climmable.super.climb();
    }
}
