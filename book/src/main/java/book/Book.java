package book;

public class Book {

	private String title;
	
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}


	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean searchByTitle(String word) {
		return title.indexOf(word) >= 0;
	}

	@Override
	public String toString() {
		return "book.Book{" +
				"title='" + title + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}