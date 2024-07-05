package Interface;

public class Lion implements Animal{

    @Override
    public void feed() {
        System.out.println("Lion eats: Flesh");

    }

    @Override
    public void makeSound() {
        System.out.println("Lion make sound of Roar");

    }
}
