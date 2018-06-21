
public class Author {

	private String firstName;
	private String lastName;
	private int numOfBooks = 0;

	public Author(String firstName) {

		this.firstName = firstName;
	}

	public Author(String FirstName, String LastName, int NumOfBooks) {

		setFirstName(FirstName);
		setLastName(LastName);
		setNumOfBooks(NumOfBooks);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumOfBooks() {
		return numOfBooks;
	}

	public void setNumOfBooks(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}

	public int numOfBooks() {

		return getNumOfBooks();
	}

	public void authorInfo() {

		System.out.println("**************************************");
		System.out.println("AUTHOR F.NAME : " + getFirstName());
		System.out.println("AUTHOR L.NAME : " + getLastName());
		System.out.println("NUMOFBOOKS : " + getNumOfBooks());
		System.out.println("**************************************");

	}

}