package book;

public class BookApp {
	
	public static void main(String[] args) {
		String wordToFind = "";
		if(args.length > 0){
			wordToFind = args[0];
		}
		Book[] books = new Book[3];
		books[0] = new Book("Az","Stephen King");
		books[1] = new Book("Java In Action","XY");
		books[2] = new Book("Legyek ura","William Golding");
		for(Book b: books){
			if(b.searchByTitle(wordToFind)){
				System.out.println(b);
			}
		}
	}
}