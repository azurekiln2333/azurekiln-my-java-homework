package ep52.task4;

import java.util.ArrayList;

public class Library {

    private Book[] books;
    private int count;

    private static int totalBooks = 0;

    public Library(int size) {
        books = new Book[size];
    }

    // 添加图书
    public void addBook(Book b) {

        // ISBN检查
        for(int i = 0; i < count; i++) {

            if(books[i].getIsbn().equals(b.getIsbn())) {

                System.out.println("ISBN重复，添加失败！");
                return;
            }
        }

        books[count++] = b;

        totalBooks++;
    }

    // 根据作者查书
    public Book[] searchByAuthor(String author) {

        ArrayList<Book> list = new ArrayList<>();

        for(int i = 0; i < count; i++) {

            if(books[i].getAuthor().equals(author)) {

                list.add(books[i]);
            }
        }

        return list.toArray(new Book[0]);
    }

    // 借书
    public void borrowBook(String isbn, String userName) {

        for(int i = 0; i < count; i++) {

            if(books[i].getIsbn().equals(isbn)) {

                books[i].borrow(userName);

                return;
            }
        }

        System.out.println("未找到该书！");
    }

    // 还书
    public void returnBook(String isbn) {

        for(int i = 0; i < count; i++) {

            if(books[i].getIsbn().equals(isbn)) {

                books[i].returnBook();

                return;
            }
        }
    }

    // 当前图书馆藏书量
    public int getTotalBooksInLibrary() {
        return count;
    }

    // 所有图书馆查找
    public static ArrayList<Book> searchAllLibraries(
            Library[] libs,
            String author
    ) {

        ArrayList<Book> result = new ArrayList<>();

        for(Library lib : libs) {

            Book[] temp = lib.searchByAuthor(author);

            for(Book b : temp) {

                result.add(b);
            }
        }

        return result;
    }

    // 最受欢迎作者
    public String getMostPopularAuthor() {

        if(count == 0) {
            return null;
        }

        String popular = books[0].getAuthor();

        int max = 0;

        for(int i = 0; i < count; i++) {

            String currentAuthor = books[i].getAuthor();

            int currentCount = 0;

            for(int j = 0; j < count; j++) {

                if(books[j].getAuthor().equals(currentAuthor)) {

                    currentCount++;
                }
            }

            if(currentCount > max) {

                max = currentCount;
                popular = currentAuthor;
            }
        }

        return popular;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}