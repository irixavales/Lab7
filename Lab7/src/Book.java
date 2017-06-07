
public class Book implements GameThing{

	public String getName() {
		return "A dusty old book";
		}
	public String getDescription() {
		return "This book appears to be old and dusty. It's also quite heavy.";
	}
	public void read() {
		System.out.println("The book seems to be written in an unknown language.");
	}
}
