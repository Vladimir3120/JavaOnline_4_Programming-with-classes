package Simpleclass09;

public class Book {
	
	private int id;
	private String title;
	private String author;
	private String publishing;
	private int yearOfPublish;
	private int numberOfPages;
	private int price;
	private String bindingOfType;
	
	
	public Book(int id, String title, String author, String publishing, int yearOfPublish, int numberOfPages, int price,
			String bindingOfType) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishing = publishing;
		this.yearOfPublish = yearOfPublish;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingOfType = bindingOfType;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublishing() {
		return publishing;
	}


	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}


	public int getYearOfPublish() {
		return yearOfPublish;
	}


	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}


	public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBindingOfType() {
		return bindingOfType;
	}


	public void setBindingOfType(String bindingOfType) {
		this.bindingOfType = bindingOfType;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishing=" + publishing
				+ ", yearOfPublish=" + yearOfPublish + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", bindingOfType=" + bindingOfType + "]";
	}
	
	
	
	
	

}
