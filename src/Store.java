import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
    private ArrayList<User> user;
    private ArrayList<Media> media;


    public Store() {
    this.media = new ArrayList<>();
    this.user = new ArrayList<>();
    }

    public void addUser(User user){
        this.user.add(user);
    }

    public void displayUsers(){
        for (User u : user){
            System.out.println(u);
        }
    }


    public void addMedia(Media media){
        this.media.add(media);
    }


    public void displayMedia(){
        for (Media e : media){
            System.out.println(e);
            System.out.println("-----");
        }
    }

    public Book searchBook(String title){
        for (Media b : media){
            if(b instanceof Book && b.getTitle().equalsIgnoreCase(title)){
                return (Book)b;
            }
        }
        return null;
    }


}
