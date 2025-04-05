package weektwodayone;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added Successfully");
		return "bookTitle";
	}
	public String issuebook(String issuebook)
	{
		System.out.println("Book issued Successfully");
		return "issuebook";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library books = new Library();
		books.addBook("String");
		books.issuebook("String");

	}


}
