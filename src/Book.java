import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> review;

    public Book(){
        this.stock = 0;
        this.review = new ArrayList<>();
    }



    public Book(int stock) {
        this.stock = stock;
        this.review = new ArrayList<>();
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> review) {
        super(title, auteur, ISBN, price);
        this.review = review;
        this.stock = stock;
    }
    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.review = new ArrayList<>();
    }



    public void addReview(Review review){
        this.review.add(review);
    }


    public double getAverageRating(){
        double sum = 0;
        for(Review r : review){
            sum += r.getRating();
        }

        return sum / review.size();
    }


    public void purchase(User user){
    user.addToCart(this);
    this.stock--;
    }

    public boolean isBestSeller(){
        if(review == null){
            return false;
        }else {
            return this.getAverageRating() > 4.5;
        }
    }

    public void restock(int quantity){
        if (quantity < 0){
            throw new IllegalArgumentException("Invalid Quantity");
        }
        else
            this.stock += quantity;
    }


    @Override
    public String getMediaType() {
        if(isBestSeller()){
            return "BestSelling Book " + super.getMediaType();
        }
        return " Book "+super.getMediaType();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock < 0){
            throw new IllegalArgumentException("Stock should be positive");
        }
        this.stock = stock;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nstock: " + stock +
                "\nreviews:\n" + review +
                '\n';
    }
}
