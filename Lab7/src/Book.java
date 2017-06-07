
public class Book implements GameThing, Readable, Openable{

	private boolean isOpen = false;
	
	public String getName() {
		return "A dusty old book";
		}
	public String getDescription() {
		String description = "This book appears to be old and dusty. It's also quite heavy.";
		if (isOpen) {description+="The book is open.";}
		else {description+="The book is closed.";}
		return description;
	}
	public void read() {
		if(isOpen) {
			System.out.println("The book seems to be written in an unknown language.");
		}
		else {
			System.out.println("I can't read closed books!");
		}
	}
	public void open() {
		if(isOpen) {
			System.out.println("The book is already open.");
		}
		else {
			System.out.println("Dust comes out of the pages as the book is opened.");
			isOpen=true;
		}
	}
	public void close() {
		if(isOpen) {
			System.out.println("Book makes a loud noise when closed.");
			isOpen=false;
		}
		else {
			System.out.println("The book is already closed.");
		}
	}
}
