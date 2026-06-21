package service;

import dao.IssueDAO;

public class IssueService {

    private IssueDAO issueDAO = new IssueDAO();

    public void issueBook(int bookId, int memberId) {
        issueDAO.issueBook(bookId, memberId);
    }
    public void returnBook(int issueId, int bookId) {
        issueDAO.returnBook(issueId, bookId);
    }
}