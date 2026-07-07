
public class Book {
	private int isbn;
	private String title;
	private double price;
	public Book() {
		price = 15.99;
		
	}
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public Book(String title, double price, int isbn) {
		this.title = title;
		this.price = price;
		this.isbn = isbn;
	}
	public String toString() {
		return "isbn: " + isbn + ", title: " + title + ", price: " + price;
	}
	
	public void setIsbn(int isbn){
		this.isbn = isbn;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    public int getIsbn()
    {
    return isbn;
    }
    public double getPrice()
    {
    	return price;
    }
   public String getTitle()
   {
	   return title;
   }
   public void tostring() {
		  System.out.println("isbn: " + isbn + " price: " + price + " title: " + title);
		  
		  
	  }
    
}
