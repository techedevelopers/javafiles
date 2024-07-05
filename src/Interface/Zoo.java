package Interface;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.makeSound();
        lion.feed();

        System.out.println();

        Animal penguine = new Penguine();
        penguine.makeSound();

        System.out.println();

        Animal monkey = new Monkey();
        monkey.makeSound();
        monkey.feed();
    }
}
