import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;


    public User() {
    this.shoppingCart = new ArrayList<>();
    this.purchaseMediaList = new ArrayList<>();
    this.username = "user";
    this.email = "example@company.com";
    }

    public User(String username, String email) {
        this.shoppingCart = new ArrayList<>();
        this.purchaseMediaList = new ArrayList<>();
        this.username = username;
        this.email = email;
    }
    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    //TODO: addToCart for user
    public void addToCart(Media media){
    shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }
    // TODO: using checkout in main
    public void checkout(){
        purchaseMediaList.addAll(getShoppingCart());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //TODO: use this in main.
    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }
    //TODO: getShoppingCart
    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return
                "\nusername='" + username + '\'' +
                "\nemail='" + email + '\'' ;
    }
}
