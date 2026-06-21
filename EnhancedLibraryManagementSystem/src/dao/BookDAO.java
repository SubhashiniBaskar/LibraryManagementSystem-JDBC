package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import model.Book;
import util.DBConnection;

public class BookDAO {

    public void addBook(Book book) {

        String query =
                "INSERT INTO books(title, author, quantity) VALUES(?,?,?)";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setInt(3, book.getQuantity());

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Book Added Successfully");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void viewBooks() {

        String query = "SELECT * FROM books";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n===== BOOK LIST =====");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getInt("quantity"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateBookQuantity(int bookId, int quantity) {

        String query =
                "UPDATE books SET quantity = ? WHERE book_id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            ps.setInt(1, quantity);
            ps.setInt(2, bookId);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Book Updated Successfully");
            } else {
                System.out.println("Book ID Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteBook(int bookId) {

        String query = "DELETE FROM books WHERE book_id = ?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)
        ) {

            ps.setInt(1, bookId);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Book Deleted Successfully");
            } else {
                System.out.println("Book ID Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}