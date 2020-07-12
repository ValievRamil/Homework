package ru.valiev.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    public static void printInterface() {
        System.out.println("Welcome yo the LIBRARY!");
        System.out.println("Press 1 to view library contents.");
        System.out.println("Press 2 to add a book.");
        System.out.println("Press 3 to exit.");
    }

    public static void addBook() {
        List<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        do {
            switch (sc.nextInt()) {
                case 1: {
                    List<Book> bookList = getBook("library.dat");
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                }
                System.out.println();
                printInterface();
                break;
                case 2: {
                    System.out.println("Please, enter book title:");
                    String name = sc.next();
                    System.out.println("Please, enter author name:");
                    String author = sc.nextLine();
                    System.out.println("Please, enter the year of publication:");
                    String year = sc.next();
                    books.add(new Book(name, author, year));
                    try (OutputStream os = new FileOutputStream("library.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(os)) {
                        oos.writeObject(books);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println();
                    printInterface();
                }
                break;
                case 3:
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    private static List<Book> getBook(String fileName) {
        if (new File(fileName).exists()) {
            try (InputStream is = new FileInputStream(fileName);
                 ObjectInputStream ois = new ObjectInputStream(is)) {
                return (List<Book>) ois.readObject();

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Library is empty");
        return new ArrayList<>();
    }
}
