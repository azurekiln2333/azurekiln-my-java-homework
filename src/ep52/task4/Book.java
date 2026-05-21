package ep52.task4;

public class Book {

    private String title;
    private String author;
    private String isbn;

    private boolean borrowed;
    private String borrowedBy;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void borrow(String userName) {

        if(!borrowed) {
            borrowed = true;
            borrowedBy = userName;
        } else {
            System.out.println("该书已被借出！");
        }
    }

    public void returnBook() {

        borrowed = false;
        borrowedBy = null;
    }

    @Override
    public String toString() {
        return title + " - " + author + " - " + isbn;
    }
}