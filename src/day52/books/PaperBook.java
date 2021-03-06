package day52.books;

public class PaperBook extends Book implements Readable{

    int weight ;

    public PaperBook(String name, String author, int i) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void takeNotes() {
        System.out.println("Bookmark and Taking note from "
                + name);
    }

    @Override
    public void read() {
        System.out.println("Reading the " + name + " written by "
                + author);
    }

    @Override
    public void displayInfo() {

        System.out.println("Paper Book's name is: " + name
                + ", and the author is: " + author
                + " and it weigh " + weight + " pound"
        );
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", weight=" + weight +
                '}';
    }


}
