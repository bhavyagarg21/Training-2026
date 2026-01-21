import java.util.ArrayList;
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    private String borrowerName;
    private boolean available = true;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void setBorrowerName(String name) {
        this.borrowerName = name;
        this.available = false;
    }

    public boolean isAvailable() {
        return available;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Basics", "James"));
        items.add(new Magazine(2, "Tech Weekly", "Editor"));
        items.add(new DVD(3, "Inception", "Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();

            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem();
        }
    }
}

class Book extends LibraryItem implements Reservable {

    Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        System.out.println("Book reserved");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable {

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable {

    DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD reserved");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}


