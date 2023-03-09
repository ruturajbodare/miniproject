package Book;

public class BookInfo {
	private String bookname;
	private float bookprice;
	private String booktype;
	
	public BookInfo() {
		
	}

	public BookInfo(String bookname, float bookprice, String booktype) {
		super();
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.booktype = booktype;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public float getBookprice() {
		return bookprice;
	}

	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}

	public String getBooktype() {
		return booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	@Override
	public String toString() {
		return "BookInfo [ bookname=" + bookname + ", bookprice=" + bookprice + ", booktype="
				+ booktype + "]";
	}
	

}
