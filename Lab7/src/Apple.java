
public class Apple implements GameThing, Edible{
	
	public String getName() {
		return "An apple";
	}
	public String getDescription() {
		return "A red apple that appears to be rotten.";
	}
	public void eat() {
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
		System.out.println("I hope not to get indigestion from a rotten apple.");
	}

}
