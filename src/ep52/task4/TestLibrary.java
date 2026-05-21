package ep52.task4;

import java.util.ArrayList;

public class TestLibrary {

    public static void main(String[] args) {

        Library lib1 = new Library(10);
        Library lib2 = new Library(10);

        Book b1 = new Book("Java基础", "张三", "001");
        Book b2 = new Book("Java高级", "张三", "002");
        Book b3 = new Book("Python基础", "李四", "003");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b3);

        System.out.println("总藏书量：" + Library.getTotalBooks());

        // 借书
        lib1.borrowBook("001", "小明");

        System.out.println(
                b1.getTitle() +
                        " 借阅人：" +
                        b1.getBorrowedBy()
        );

        // 查书
        ArrayList<Book> result =
                Library.searchAllLibraries(
                        new Library[]{lib1, lib2},
                        "张三"
                );

        System.out.println("查找到图书：");

        for(Book b : result) {
            System.out.println(b);
        }

        // 最受欢迎作者
        System.out.println(
                "藏书最多作者：" +
                        lib1.getMostPopularAuthor()
        );
    }
}