import java.util.ArrayList;

public class Movie extends Media{
    private int duration;


    public Movie(){
    this.duration = 0;
    }
    public Movie(String title, String auteur, String ISBN, double price, int duration){
    super(title,auteur,ISBN,price);
    this.duration=  duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    //TODO: use recommendMovies in main
    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        ArrayList<Movie> similarMovies = new ArrayList<>();
        for (Movie e : movieCatalog){
            if (e.getAuteur().equals(this.getAuteur())){
                similarMovies.add(e);
            }
        }
        return similarMovies;
    }


    @Override
    public String toString() {
        return super.toString() +
                " duration: " + duration;
    }
}
