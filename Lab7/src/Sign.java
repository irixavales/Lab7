public class Sign implements GameThing, Readable, Edible
{
	public String getName()
	{
		return "A chocolate sign";
	}
	public String getDescription()
	{
		return "This is a small sign made of chocolate. There seems to be some partially faded writing in it.";
	}
	public void read() 
	{
		System.out.print("You can see the following message: \"Beware!\"");
	}
	public void eat() {
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
		System.out.println("This is the best chocolate you have ever tasted! Shame the message is gone!");
	}
}
