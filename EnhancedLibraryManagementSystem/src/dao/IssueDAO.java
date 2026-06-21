package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBConnection;

public class IssueDAO {

    public void issueBook(int bookId, int memberId) {

        String issueQuery =
                "INSERT INTO issue_records(book_id, member_id, issue_date, status) VALUES (?, ?, CURDATE(), 'ISSUED')";

        String updateQuery =
                "UPDATE books SET quantity = quantity - 1 WHERE book_id = ? AND quantity > 0";

        try (
                Connection con = DBConnection.getConnection()
        ) {

            PreparedStatement updatePs =
                    con.prepareStatement(updateQuery);

            updatePs.setInt(1, bookId);

            int rows = updatePs.executeUpdate();

            if(rows > 0) {

                PreparedStatement issuePs =
                        con.prepareStatement(issueQuery);

                issuePs.setInt(1, bookId);
                issuePs.setInt(2, memberId);

                issuePs.executeUpdate();

                System.out.println("Book Issued Successfully");

            } else {

                System.out.println("Book Not Available");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void returnBook(int issueId, int bookId) {

        String returnQuery =
                "UPDATE issue_records SET return_date = CURDATE(), status = 'RETURNED' WHERE issue_id = ?";

        String quantityQuery =
                "UPDATE books SET quantity = quantity + 1 WHERE book_id = ?";

        try (
                Connection con = DBConnection.getConnection()
        ) {

            PreparedStatement returnPs =
                    con.prepareStatement(returnQuery);

            returnPs.setInt(1, issueId);

            int rows = returnPs.executeUpdate();

            if(rows > 0) {

                PreparedStatement qtyPs =
                        con.prepareStatement(quantityQuery);

                qtyPs.setInt(1, bookId);

                qtyPs.executeUpdate();

                System.out.println("Book Returned Successfully");

            } else {

                System.out.println("Issue Record Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    } 
}
