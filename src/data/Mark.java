package data;

public class Mark {
	private String fname;
	private String lname;
	
	public Mark()
	{
		this.fname="Mark";
		this.lname="Ritchie";
	}
	public void printName()
	{
		System.out.println("Name:");
		System.out.println(fname+" "+lname);
	}
	public void likes()
	{
		System.out.println("Likes:");
		System.out.println("Getting stuff done!");
	}
	public void dislikes()
	{
		System.out.println("Dislikes:");
		System.out.println("Excuses");
	}
	public void favJoke()
	{
		System.out.println("Joke:");
		String joke="I went for dinner with my Australian friend and he ordered a dessert.\n"
				+ "When it came out it was a meringue, and he cheered, which I thought was weird...\n"
				+ "because normally Australians boo meringue ";
		System.out.println(joke);
	}
	public void about()
	{
		System.out.println("CSSE Student:");
		
	}
}
