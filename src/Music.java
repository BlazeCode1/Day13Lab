import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    @Override
    public String getMediaType() {
        if(super.getPrice() >=10 ){
            return "Premium Music " + super.getMediaType();
        }
        return " Music " + super.getMediaType();
    }

    public void listen(User user){
        user.addToCart(this);
    }

    //TODO: use generatePlayList in main
    public ArrayList<Music> generatePlayList(ArrayList<Music> musicCatalog){
        ArrayList<Music> songs = new ArrayList<>();
        for (Music c : musicCatalog){
            if(c.getArtist().equals(this.getArtist())){
                songs.add(c);
            }
        }
        return songs;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nartist: " + artist + "\n";
    }
}
