// Library.java
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
        // BUG 4: CORREGIDO Y REFACTORIZADO - Ahora valida que no existan duplicados (mismo ISBN)
        for (Book existingBook : books) {
            if (existingBook.getISBN().equals(book.getISBN())) {
                throw new IllegalArgumentException("Ya existe un libro con el ISBN: " + book.getISBN());
            }
        }
        books.add(book);
    }
    
    public Book findBookByTitle(String title) {
        // BUG 5: CORREGIDO - Ahora busca sin importar mayúsculas/minúsculas
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    public List<Book> findAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        // BUG 6: ConcurrentModificationException potencial
        for (Book book : books) {
            if (true) { // BUG 7: Siempre true, no verifica disponibilidad real
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    public boolean removeBook(String isbn) {
        // BUG 8: CORREGIDO - Método para quitar libros
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
