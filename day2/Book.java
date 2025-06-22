package week1.day2;

public class Book {
	int bookId = 101;
	String title = "Anchor";
	String author = "Steve Joven";
	boolean isAvailable = true;
	
	void borrowBook()
	{
		if(isAvailable)   //it takes default value i.e true
		{
			isAvailable = false;
			System.out.println("Book borrowed Successfully");
		}
		else
		{
			System.out.println("Book is currently unavailable");
		}
	}
	void returnBook()
	{
		isAvailable = true;
		System.out.println("Book is returned Successfully");
	}
	void displayDetails()
	{
		System.out.println("bookId      : "+ bookId);
		System.out.println("title       : "+ title);
		System.out.println("Author      : "+ author);
		System.out.println("IsAvailable : "+ isAvailable);
	}
	public static void main(String[] args)
	{
		Book b=new Book();
		b.borrowBook();
		b.returnBook();
		b.displayDetails();
	}

}
