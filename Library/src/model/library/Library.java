package model.library;

import model.book.Book;
import model.book.BookType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library {

    private Librarian manager;
    private String name;
    private List<Library> branches;
    private List<Book> referenceBooks;
    private List<Book> fictionBooks;
    private List<Book> nonfictionBooks;
    private List<Book> textBooks;
    private List<Book> cookBooks;

    public Library(String name, Librarian manager) {
        this.manager = manager;
        this.name = name;

        branches = new ArrayList<>();

        referenceBooks = new ArrayList<>();
        fictionBooks = new ArrayList<>();
        nonfictionBooks = new ArrayList<>();
        textBooks = new ArrayList<>();
        cookBooks = new ArrayList<>();
    }

    // getters
    public String getName() { return name; }
    public Librarian getManager() { return manager; }

    // REQUIRES: bk != null
    // MODIFIES: this
    // EFFECTS: stores the given Book bk into the appropriate container within this class
    public void storeBook(Book bk) {
        BookType type = bk.getType();
        switch (type) {
            case REFERENCE:
                referenceBooks.add(bk);
                break;
            case COOKING:
                cookBooks.add(bk);
                break;
            case FICTION:
                fictionBooks.add(bk);
                break;
            case TEXTBOOK:
                textBooks.add(bk);
                break;
            case NONFICTION:
                nonfictionBooks.add(bk);
                break;
            default:
                nonfictionBooks.add(bk);
        }
    }

    // REQUIRES: bk != null
    // EFFECTS: return true if the given book is in the catalogue,
    //          regardless of its loan status, else return false
    public boolean inCatalogue(Book bk) {
        BookType type = bk.getType();
        switch (type) {
            case REFERENCE:
                return referenceBooks.contains(bk);
            case COOKING:
                return cookBooks.contains(bk);
            case FICTION:
                return fictionBooks.contains(bk);
            case TEXTBOOK:
                return textBooks.contains(bk);
            case NONFICTION:
                return nonfictionBooks.contains(bk);
            default:
                return false;
        }
    }

    // REQUIRES: bk != null
    // EFFECTS: return true if the given book is available to loan
    //          Note: What requirements should a book meet to be available?
    public boolean canLoan(Book bk) {
        return !bk.onLoan();
    }

    // REQUIRES: branch != null
    // EFFECTS: add branch to current library's branches list
    public void addBranch(Library branch) {
        branches.add(branch);
    }

    // REQUIRES: bk != null
    // EFFECTS: return true if the given book is available in the catalogue of this library's
    //          other branches; else, return false
    public boolean isInDiffBranch(Book bk) {
        boolean result = false;
        if (branches != null) {
            for (Library branch : branches) {
                result = false || branch.inCatalogue(bk);
            }
        }
        return result;
    }

    // REQUIRES: bk != null
    // MODIFIES: this
    // EFFECTS: set bk as being checked out from this library if possible
    //          return true if successful, else false
    public boolean checkOutBook(Book bk) {
        bk.nowOnLoan();
        return bk.onLoan();
    }

    // REQUIRES: bk != null
    // MODIFIES: this
    // EFFECTS: set bk as being back in the library if it has been borrowed previously
    //          return true if successful, otherwise false
    public boolean returnBook(Book bk) {
        bk.notOnLoan();
        return !bk.onLoan();
    }

    // REQUIRES: manager != null
    // MODIFIES: this
    // EFFECTS: sets this library's librarian to manager; return true if successful, else false
    public boolean hireLibrarian(Librarian manager) {
        this.manager = manager;
        return this.manager == manager;
    }


    // Utility method, do not touch its implementation
    public void printCatalogue() {
        List<Book> totalCatalogue = new LinkedList<>();
        totalCatalogue.addAll(this.cookBooks);
        totalCatalogue.addAll(this.fictionBooks);
        totalCatalogue.addAll(this.nonfictionBooks);
        totalCatalogue.addAll(this.textBooks);
        totalCatalogue.addAll(this.referenceBooks);

        for (Book b : totalCatalogue) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }

}
