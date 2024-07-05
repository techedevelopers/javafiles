package Interface;

public class Penguine implements Animal, Swimmable{

    @Override
    public void feed() {

    }

    @Override
    public void makeSound() {
        System.out.println("Penguine make sound of Honk");
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
