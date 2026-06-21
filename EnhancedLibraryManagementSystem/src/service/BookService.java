package service;

import dao.BookDAO;
import model.Book;

public class BookService {

    private BookDAO bookDAO = new BookDAO();

    public void addBook(Book book) {
        bookDAO.addBook(book);
    }
    public void viewBooks() {
        bookDAO.viewBooks();
    }
    public void updateBookQuantity(int bookId, int quantity) {
        bookDAO.updateBookQuantity(bookId, quantity);
    }
    public void deleteBook(int bookId) {
        bookDAO.deleteBook(bookId);
    }
}