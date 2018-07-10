package inheritance;

public class Item {

    private String title;
    private String author;

    public Item(String title, String author){
        if(title == null || title.isEmpty() || author == null || author.isEmpty()){
            throw new IllegalArgumentException("...");
        }
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
