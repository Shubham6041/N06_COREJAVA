// program to deomonstrate on access specifier

package in.bkcmet.library;

public class Library {
	public String libraryName;
	private long userId;
	String booksName;
	
	public void displayPublic()        // public method
	{
		System.out.println("Library Name: "+libraryName);
	}
	
	private void displayPrivate()
	{
		System.out.println("User Id : "+userId);
	}
	
	void displayDefault()
	{
		System.out.println("Book name is: "+booksName);
	}
}
