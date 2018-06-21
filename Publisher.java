
public class Publisher {
	
	private String name;
	private int numOfBooks=0;
	
	public Publisher() {
	
	}	
	
	public Publisher(String Name, int NumOfBooks){
		
		setName(Name);
		setNumOfBooks(NumOfBooks);
			
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumOfBooks() {
		return numOfBooks;
	}


	public void setNumOfBooks(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}
	
	public int numOfBooks(){
		
		return getNumOfBooks();
	}
	
	public void publisherInfo(){
		
		System.out.println("**************************************");
		System.out.println("PUBLISHER NAME : " + getName());
		System.out.println("PUBLISHER NUMOFBOOKS : " + getNumOfBooks());
		System.out.println("**************************************");
		
	}

}
