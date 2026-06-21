package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Member;
import util.DBConnection;
import java.sql.ResultSet;
public class MemberDAO {
	public void addMember(Member member) {

	    String query =
	            "INSERT INTO members(member_name,email) VALUES(?,?)";

	    try (
	            Connection con = DBConnection.getConnection();
	            PreparedStatement ps = con.prepareStatement(query)
	    ) {

	        ps.setString(1, member.getMemberName());
	        ps.setString(2, member.getEmail());

	        int rows = ps.executeUpdate();

	        if(rows > 0) {
	            System.out.println("Member Added Successfully");
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	public void viewMembers() {

	    String query = "SELECT * FROM members";

	    try (
	            Connection con = DBConnection.getConnection();
	            PreparedStatement ps = con.prepareStatement(query);
	            ResultSet rs = ps.executeQuery()
	    ) {

	        System.out.println("\n===== MEMBER LIST =====");

	        while(rs.next()) {

	            System.out.println(
	                    rs.getInt("member_id") + " | " +
	                    rs.getString("member_name") + " | " +
	                    rs.getString("email"));
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}

}
