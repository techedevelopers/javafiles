package Inheritance;

class Book{
    private String name;
    private String author;
    private int year;
    private int pages;


    public Book(String name, String author, int year, int pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;

    }
    public void bookName(){
        System.out.println("What is the name of this book?  " + name);
    }
    public void authorName(){
        System.out.println("Who is the author of this book? " + author);
    }
    public void productionYear(){
        System.out.println("In which year does this book published?  " + year);
    }

    static class Fictional extends Book {
        private String Genre;

        public Fictional(String name, String author, int year, int pages, String Genre) {
            super(name, author, year, pages);
            this.Genre = Genre;
        }
        public void genreofBook(){
            System.out.println("What is the genre of the book? " + Genre);
        }
    }
    static class NonFictional extends Book {
        private String theme;

        public NonFictional(String name, String author, int year, int pages, String theme) {
            super(name, author, year, pages);
            this.theme = theme;
        }

        public void themeBase(){
            System.out.println("What is the theme of the book? " + theme);
        }
    }

}
public class Novel {
    public static void main(String[] args) {
        Book.Fictional book1 = new Book.Fictional("The name of the Wind", "Patrick Rothfuss",2007,251,"Sci-fi");
        book1.bookName();
        book1.authorName();
        book1.productionYear();
        book1.genreofBook();

        System.out.println(" ");
        Book.NonFictional book2 = new Book.NonFictional("The Silent Spring","Rachel Carson",1962,151,"Real Incident");
        book2.bookName();
        book2.authorName();
        book2.productionYear();
        book2.themeBase();



    }
}
