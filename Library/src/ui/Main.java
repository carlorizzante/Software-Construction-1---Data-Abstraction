package ui;

import model.book.Book;
import model.library.Librarian;
import model.library.Library;

import static model.book.BookType.*;
import static model.book.BookType.COOKING;

/**
 * Created by carlorizzante on 24/08/17.
 */
public class Main {

    private static Library lib;
    private static Librarian librarian;

    public static void main(String[] args) {

        Book favBook;
        favBook = new Book("Introduction to Algorithms", "Thomas H. Cormen", TEXTBOOK, 1992, 1);

        librarian = new Librarian("Alan Kay", 11, lib, favBook);
        lib = new Library("Vancouver Public Library", librarian);

        Book bk1;
        Book bk2;
        Book bk3;
        Book bk4;
        Book bk5;

        bk1 = new Book("Encyclopedia Britannica", "John Williams", REFERENCE, 1850, 1);
        bk1.setHomeLibrary(lib);
        lib.storeBook(bk1);

        bk2 = new Book("Harry Potter and the Deathy Hallows", "J.K. Rowling", FICTION, 2007, 1);
        bk2.setHomeLibrary(lib);
        lib.storeBook(bk2);

        bk3 = new Book("The Immmortal Life of Henrietta Lacks", "Rebecca Skloot", NONFICTION, 2008, 1);
        bk3.setHomeLibrary(lib);
        lib.storeBook(bk3);

        bk4 = new Book("Introduction to Algorithms", "Thomas H. Cormen", TEXTBOOK, 1992, 1);
        bk4.setHomeLibrary(lib);
        lib.storeBook(bk4);

        bk5 = new Book("Mastering the Art of French Cooking", "Julia Child", COOKING, 1960, 1);
        bk5.setHomeLibrary(lib);
        lib.storeBook(bk5);

        Librarian manager = lib.getManager();
        System.out.println("Library name: " + lib.getName());
        System.out.println("Manager name: " + librarian.getName());

        lib.printCatalogue();

    }
}
