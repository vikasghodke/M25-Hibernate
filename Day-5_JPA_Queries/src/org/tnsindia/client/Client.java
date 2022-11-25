package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.services.BookService;
import org.tnsindia.services.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BookService service=new BookServiceImpl();
		System.out.println("Listing book with specific ID:");
		System.out.println("Enter the book ID:");
		int id=s.nextInt();
		System.out.println("Book with ID"+id+":"+service.getBookById(id));
		
		
		System.out.println("Listing book with specific title:");
		System.out.println("Enter the bookTitle:");
		String title=s.next();
		System.out.println("Book with title"+title+":"+service.getBookByTitle(title));
		
		
		System.out.println("Listing book with specific author:");
		System.out.println("Enter the book author:");
		String author=s.nextLine();
		System.out.println("Book with author "+author+":"+service.getAuthorBooks(title));
		
		System.out.println("Listing book with specific price:");
		System.out.println("Enter the book price:");
		double low=s.nextDouble();
		double high=s.nextDouble();
		System.out.println("Book with specific price:"+service.getBooksBypriceRange(300, 600));
		
		System.out.println("Listening all the bookd: ");
		System.out.println(service.getAllBooks());
	}

}
