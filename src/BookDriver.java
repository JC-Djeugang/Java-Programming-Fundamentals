
public class BookDriver {
	public static void main(String [] args) {
	
		Book firstBook = new Book();
		
		firstBook.setIsbn(125);
		firstBook.setTitle("Harry Potter");
		System.out.println(firstBook.toString());
		discount(firstBook);
		firstBook.toString();
		
		Book secondBook = new Book("Java is fun", 54.55);
		secondBook.setIsbn(765);
		System.out.println(secondBook.toString());
		discount(secondBook);
		secondBook.toString();
		
		
		Book thirdBook = new Book("cooking", 14.75, 987);
		System.out.println(thirdBook.toString());
		discount(thirdBook);
		thirdBook.toString();
		
	}
	public static void discount(Book discountBook) {
		double newPrice;
		double discountPrice = discountBook.getPrice() * 0.2;
		newPrice = discountBook.getPrice() - discountPrice; 
		discountBook.setPrice(newPrice);
		System.out.printf("The price is now %.2f \n", newPrice);
	}
}
