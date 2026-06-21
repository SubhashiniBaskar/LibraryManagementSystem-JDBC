package app;

import java.util.Scanner;

import model.Book;
import model.Member;
import service.BookService;
import service.MemberService;
import service.IssueService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookService service = new BookService();
        MemberService memberService = new MemberService();
        IssueService issueService = new IssueService();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Add Member");
            System.out.println("6. View Members");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

            case 1:

                System.out.print("Enter Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author: ");
                String author = sc.nextLine();

                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();

                Book book = new Book(0, title, author, quantity);

                service.addBook(book);

                break;

            case 2:

                service.viewBooks();

                break;

            case 3:

                System.out.print("Enter Book ID: ");
                int bookId = sc.nextInt();

                System.out.print("Enter New Quantity: ");
                int qty = sc.nextInt();

                service.updateBookQuantity(bookId, qty);

                break;

            case 4:

                System.out.print("Enter Book ID to Delete: ");
                int deleteId = sc.nextInt();

                service.deleteBook(deleteId);

                break;

            case 5:

                 // fixes Scanner issue after nextInt()

                System.out.print("Enter Member Name: ");
                String memberName = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                Member member = new Member(0, memberName, email);

                memberService.addMember(member);

                break;

            case 6:

            	  memberService.viewMembers();

                break;
                
            case 7:

                System.out.print("Enter Book ID: ");
                int issueBookId = sc.nextInt();

                System.out.print("Enter Member ID: ");
                int issueMemberId = sc.nextInt();

                issueService.issueBook(issueBookId, issueMemberId);

                break;
                
            case 8:

                System.out.print("Enter Issue ID: ");
                int issueId = sc.nextInt();

                System.out.print("Enter Book ID: ");
                int returnBookId = sc.nextInt();

                issueService.returnBook(issueId, returnBookId);

                break;

            case 9:

                System.out.println("Thank You!");
                sc.close();
                System.exit(0);

                break;

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}