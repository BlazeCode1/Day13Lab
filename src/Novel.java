import java.util.ArrayList;


public class Novel extends Book{
    private String genre;

    public Novel(){
        this.genre = "Example";
    }

    public Novel(int stock, String genre) {
        super(stock);
        this.genre = genre;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> review, String genre) {
        super(title, auteur, ISBN, price, stock, review);
        this.genre = genre;
    }
    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String getMediaType() {
        if(super.isBestSeller()){
            return "Bestselling Novel " + super.getMediaType();
        }
        return " Novel "+super.getMediaType();
    }

    @Override
    public String toString() {
        return super.toString() +
                "genre: '" + genre + '\'';
    }
}
