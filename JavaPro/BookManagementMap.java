//Write a program to create Book management System using Map.
import java.util.*;

class Book 
{
	private String name;
	private String author;
	private double price;
	
	public Book() {
	}
	 
	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}	 
	
	public String getName() {
		return name;
	}	 
	 
	public void setName(String name) {
		this.name = name;
	}	 
	
	public String getAuthor() {
		return author;
	}	 
	 
	public void setAuthor(String author) {
		this.author = author;
	} 
	
	public double getPrice() {
		return price;
	}
	 
	public void setPrice(double price) {
		this.price = price;
	}
}

public class BookManagementMap 
{
	private static void findAllBook(Map<String, ArrayList<Book>> map) 
	{
		System.out.println("Type\t\tBook Title\tPrice");
		Set<Map.Entry<String, ArrayList<Book>>> entries = map.entrySet();
		for (Map.Entry<String, ArrayList<Book>> entry : entries) 
		{
			String key = entry.getKey();
			System.out.println(key);
			ArrayList<Book> value = entry.getValue();
			for (Book book : value) 
			{
				System.out.println("\t\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
			}
		}
	}

	private static void addBook(Map<String, ArrayList<Book>> map) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the type of book you want to add:");
		String type = sc.next();
		 System.out.println("Please enter the title of the book to be added:");
		String name = sc.next();
		System.out.println("Please enter the author of the book to be added:");
		String author = sc.next();
		 System.out.println("Please enter the price of the book to be added:");
		double price = sc.nextDouble();
		Book book = new Book(name, author, price);
		 // Get the list of books
		ArrayList<Book> books = map.get(type);
		if (books == null) {
			books = new ArrayList<>();
			map.put(type, books);
		}
		books.add(book);
		 System.out.println("Add" + name + "success");
	}

	private static void deleteBook(Map<String, ArrayList<Book>> map) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the type of book to be deleted:");
		String type = sc.next();
		 System.out.println("Please enter the title of the book to be deleted:");
		String name = sc.next();
		
		ArrayList<Book> books = map.get(type);
		if (books == null) {
			 System.out.println("The type of book does not exist");
			return;
		}
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.getName().equals(name)) {
				 books.remove(i); // find this book, delete this book
				 System.out.println("Delete" + name + "Book successful");
				 return; // End method after deleting the book
			}
		}
	 	System.out.println("Not found" + name + "book");
	}

	private static void editBook(Map<String, ArrayList<Book>> map) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the type of book to be modify:");
		String type = sc.next();
		 System.out.println("Please enter the title of the book to be modify:");
		String oldName = sc.next();
		 
		 ArrayList<Book> books = map.get(type); 
		if (books == null) {
			 System.out.println("The book type does not exist");
			return;
		}
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.getName().equals(oldName)) {						
				 System.out.println("Please enter a new book title:");
				String newName = sc.next();						
				 System.out.println("Please enter a new book author:");
				String newAuthor = sc.next();
				 System.out.println("Please enter the new price:");
				double price = sc.nextDouble();
				book.setName(newName);
				book.setAuthor(newAuthor);
				book.setPrice(price);
				 System.out.println("Modified successfully");
				return; 
			}
		}
		 System.out.println("Not found" + oldName + "book");
	}

	public static void main(String[] args) 
	{
		Map<String, ArrayList<Book>> map = new HashMap<>();
		ArrayList<Book> it = new ArrayList<Book>();
		 it.add(new Book("Computer_Security", "William_Stallings", 600));
		 it.add(new Book("Intro_to_Machine_Learning", "Ethem_Alpaydin", 580));
		 map.put("Text_books", it);
		ArrayList<Book> mz = new ArrayList<Book>();
		 mz.add(new Book("Cryptography_and_Security", "CK_Shyamala", 900));
		 mz.add(new Book("Software_Testing", "Paul_C_Jorgensen", 750));
		 map.put("Reference_Books", mz);
		 
		while (true) 
		{
			 System.out.println("--------Book management system--------");
			 System.out.println("1. List all books");
			 System.out.println("2. Add new Book");
			 System.out.println("3. Delete existing book");
			 System.out.println("4. Update Book Details");
			 System.out.println("5. Exit");
			 System.out.println("Please enter your choice:");
			 
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch (ch) 
			{
				case 1:
					findAllBook(map);
					break;
				case 2:
					addBook(map);
					break;
				case 3:
					deleteBook(map);
					break;
				case 4:
					editBook(map);
					break;
				case 5:
				 	System.out.println("Thank you for using");
				 	System.exit(0); // JVM exit
					break;
				default:
				 	System.out.println("Input error, please re-enter");
					break;
			}
		}
	}
}
/*
Output :
\Training\JavaPro>Javac BookManagementMap.java

\Training\JavaPro>Java BookManagementMap
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
1
Type            Book Title      Price
Text_books
                Computer_Security       William_Stallings       600.0
                Intro_to_Machine_Learning       Ethem_Alpaydin  580.0
Reference_Books
                Cryptography_and_Security       CK_Shyamala     900.0
                Software_Testing        Paul_C_Jorgensen        750.0
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
2
Please enter the type of book you want to add:
Programming
Please enter the title of the book to be added:
Java_Pro
Please enter the author of the book to be added:
Herbert_Scilidt
Please enter the price of the book to be added:
950
AddJava_Prosuccess
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
1
Type            Book Title      Price
Text_books
                Computer_Security       William_Stallings       600.0
                Intro_to_Machine_Learning       Ethem_Alpaydin  580.0
Programming
                Java_Pro        Herbert_Scilidt 950.0
Reference_Books
                Cryptography_and_Security       CK_Shyamala     900.0
                Software_Testing        Paul_C_Jorgensen        750.0
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
3
Please enter the type of book to be deleted:
Text_books
Please enter the title of the book to be deleted:
Computer_Security
DeleteComputer_SecurityBook successful
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
1
Type            Book Title      Price
Text_books
                Intro_to_Machine_Learning       Ethem_Alpaydin  580.0
Programming
                Java_Pro        Herbert_Scilidt 950.0
Reference_Books
                Cryptography_and_Security       CK_Shyamala     900.0
                Software_Testing        Paul_C_Jorgensen        750.0
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
4
Please enter the type of book to be modify:
Reference_Books
Please enter the title of the book to be modify:
Software_Testing
Please enter a new book title:
Software_Testing_Concepts
Please enter a new book author:
P_C_Jorgensen
Please enter the new price:
850
Modified successfully
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
1
Type            Book Title      Price
Text_books
                Intro_to_Machine_Learning       Ethem_Alpaydin  580.0
Programming
                Java_Pro        Herbert_Scilidt 950.0
Reference_Books
                Cryptography_and_Security       CK_Shyamala     900.0
                Software_Testing_Concepts       P_C_Jorgensen   850.0
--------Book management system--------
1. List all books
2. Add new Book
3. Delete existing book
4. Update Book Details
5. Exit
Please enter your choice:
5
Thank you for using

*/