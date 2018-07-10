package inheritance;

public class DVD extends Item{
    private int length;

    public DVD(String title, String author, int length){
        super(title, author);
        if(length <= 0){
            throw new IllegalArgumentException("...");
        }
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
