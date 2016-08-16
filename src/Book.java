
public abstract class Book {
	
	protected static String name;
	protected static String author;
	protected static Integer bookID;
	protected static Integer price;
	
	
		public Book(String name2, String author2, Integer bookID2, Integer price2) {
		
	}

		public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

		
		
     @Override
	public String toString() {
		return "Book [getPrice()=" + getPrice() + ", getName()=" + getName() + ", getAuthor()=" + getAuthor()
				+ ", getBookID()=" + getBookID() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
		
		
		
	    	
			
		
		
		
		
		
		

	}



