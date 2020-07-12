package ru.valiev.lesson17;

import java.io.Serializable;

public class Book implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private String author;
    private String year;

    @Override
    public String toString() {
        return "Book: " +
                "Name of the book='" + name + '\'' +
                ", Author='" + author + '\'' +
                ", Year Of Publishing='" + year + '\'';
    }

    public Book(String name, String author, String yearOfPublic) {
        this.name = name;
        this.author = author;
        this.year = yearOfPublic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfPublic() {
        return year;
    }

    public void setYearOfPublic(String yearOfPublic) {
        this.year = yearOfPublic;
    }
}
