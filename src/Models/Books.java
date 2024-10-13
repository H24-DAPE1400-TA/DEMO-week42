package Models;

import java.util.ArrayList;
import java.util.List;

public class Books {
/**
@Param Name of book
@Param Author
@Param isbn
 **/
    //getters and setters, constructur
    private String bookName;
    private String author;
    private String isbn;

    public Books(String bookName, String author, String isbn) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    //todo: implement a toString Method
}
