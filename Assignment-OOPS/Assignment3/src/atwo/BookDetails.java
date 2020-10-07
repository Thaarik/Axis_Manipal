package atwo;





class EngineeringBook extends Book{
	private String Category;

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
}
public class BookDetails {

	public static void main(String[] args) {
		Book book = new Book();
		EngineeringBook engg = new EngineeringBook();
		book.setAuthor("aaaa");
		book.setBookNo(1);
		book.setPrice(1000);
		book.setTitle("ADAD");
		engg.setCategory("Comedy");
		System.out.println(book.getAuthor()+"\n"+
				book.getBookNo()+"\n"+
				book.getPrice()+"\n"+
				book.getTitle()+"\n"+
				engg.getCategory()+"\n");
	}
}


