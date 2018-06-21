

public class Book {

	private String name;
	private int year;
	private int numOfPages;
	private String author;
	private String publisher;
	private boolean isLoaned;
	static int loanedCount = 0;
	static int totalCount = 0;
	
	public Book(){};

	public Book(String Name, int Year, int NumOfPages, String Author, String Publisher) {

		setName(Name);

		setYear(Year);

		setNumOfPages(NumOfPages);

		setAuthor(Author);

		setPublisher(Publisher);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {

		if (year > 99 && year < 2015)

			this.year = year;

		else
			System.out.println("");

	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isLoaned() {
		return isLoaned;
	}

	public void setLoaned(boolean isLoaned) {
		this.isLoaned = isLoaned;
	}

	public void loanBook() {
		this.isLoaned = true;
		loanedCount++;
	}

	public void bookInfo() {

		System.out.println("**************************************");
		System.out.println("BOOK NAME: " + getName());
		System.out.println("YEAR: " + getYear());
		System.out.println("PAGE COUNT: " + getNumOfPages());
		System.out.println("AUTHOR: " + getAuthor());
		System.out.println("PUBLISHER: " + getPublisher());

		if (isLoaned) {

			System.out.println("LOANED? : YES");
			System.out.println("**************************************");
		}

		else {

			System.out.println("LOANED? : NO");
			System.out.println("**************************************");
		}
		totalCount++;
	}

}