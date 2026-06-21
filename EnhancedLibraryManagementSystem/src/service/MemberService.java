package service;

import dao.MemberDAO;
import model.Member;

public class MemberService {
	private MemberDAO memberDAO = new MemberDAO();

	public void addMember(Member member) {
	    memberDAO.addMember(member);
	}
	public void viewMembers() {
	    memberDAO.viewMembers();
	}

}
