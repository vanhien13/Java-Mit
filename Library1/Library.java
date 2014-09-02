package MitJava;

public class Library {
    // Add the missing implementation to this class
	
	String address;
	String title;
	static String hours = "Library hours are from 9AM to 5PM";
	Book[] catalog = new Book[0];
	int numberofbook= 0;
	
	public Library(String address){
		this.address = address;
	}
	
	public static void printOpeningHours() {
	    System.out.println(hours);
	}

	public void printAddress() {
	    System.out.println(address);
	}
	
	public void addBook(Book newbook){
		if (numberofbook >= 0){
			Book[] bookarray = new Book[(numberofbook + 1)];
			System.arraycopy(catalog, 0, bookarray, 0, numberofbook);
			catalog = bookarray;
	}
	
	catalog[numberofbook] = newbook;
	numberofbook++;
}
	
	//Check out book from catalog
	public void borrowBook(String title) {
	    this.title = title;
	    if (catalog.length == 0) {
	        System.out.println("We don't have this book");
	    }
	    for (int i = 0; i < catalog.length; i++) {
	        if (title.equals(catalog[i].titleofbook) && catalog[i].isBorrowed() == false) {
	            catalog[i].Borrow();
	            System.out.println("You successfully borrowed " + catalog[i].getTitle());
	            break;
	        } else if (title.equals(catalog[i].titleofbook) && catalog[i].isBorrowed() == true) {
	            System.out.println("Sorry, this book is already borrowed.");
	            break;
	        } else if (title.equals(catalog[i].titleofbook) == false) {
	            System.out.println("Sorry, this book is not in our catalog");
	            break;
	        }
	    }   
	}
	

	    //Return book to library
	public void returnBook(String title) {
	    String string1 = title;
	    for (int i = 0; i < catalog.length; i++) {
	        if (string1.equals(catalog[i].titleofbook) && catalog[i].isBorrowed() == true) {
	            catalog[i].Return();
	            System.out.println("You successfully returned " + catalog[i].getTitle());
	            break;
	        } 
	    }
	}

	public void printAvailableBooks() {
	    if (catalog.length > 0) {
	        for (int i=0; i<numberofbook; i++) {
	        System.out.println(catalog[i].titleofbook);
	        }   
	    } else {
	        System.out.println("No books in catalog currently.");
	    }
	}

	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("14 Martin Luther King.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The World is Flat"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("Real Analysis"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
