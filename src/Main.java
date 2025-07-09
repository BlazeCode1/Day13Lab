import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        //Creating different variants of media
        AcademicBook ac1 = new AcademicBook("Data Structures", "Prof. Smith", "222-222", 49.99, 5, "Computer Science");
        // Reviews for AcademicBook ac1
        Review revAc1_1 = new Review("Ali", 5, "Excellent explanations!");
        Review revAc1_2 = new Review("Sara", 5, "Very helpful for understanding concepts.");
        Review revAc1_3 = new Review("John", 5, "Good, but needs more examples.");
        ac1.addReview(revAc1_1);
        ac1.addReview(revAc1_2);
        ac1.addReview(revAc1_3);
        System.out.println("Title: " + ac1.getTitle());
        System.out.println("Reviews: ");
        for (Review r : ac1.getReview()){
            System.out.println(r.toString());
        }
        System.out.println("Average Rating : " +ac1.getAverageRating());
        System.out.println("Media Type: " + ac1.getMediaType());
        System.out.println("\n------------\n");

        //Second AcademicBook
        //Using the second constructor with List of reviews
        ArrayList<Review> reviews = new ArrayList<>();
        Review revAc2_1 = new Review("Lina", 5, "Made calculus fun!");
        Review revAc2_2 = new Review("Omar", 4, "Clear and concise.");
        Review revAc2_3 = new Review("Fatima", 2, "A bit outdated, but useful.");
        reviews.add(revAc2_1);
        reviews.add(revAc2_2);
        reviews.add(revAc2_3);
        AcademicBook ac2 = new AcademicBook("Calculus made Easy!", "Silvanus Phillips Thompson", "222-222", 15.99, 3, reviews,"Math");

        System.out.println("Title: "+ ac2.getTitle());
        System.out.println("Reviews: ");
        for (Review r : reviews){
            System.out.println(r.toString());
        }
        System.out.println("Average Rating : " +ac2.getAverageRating());
        System.out.println("Media Type: " + ac2.getMediaType());
        System.out.println("\n------------\n");



        Novel n1 = new Novel("Mystery in Riyadh", "Ahmed AlSayed", "333-333", 24.99, 15, "Mystery");

        // Reviews for Novel n1
        Review revN1_1 = new Review("Khalid", 5, "Couldn’t put it down!");
        Review revN1_2 = new Review("Amani", 4, "Great plot and twists.");
        Review revN1_3 = new Review("Yousef", 3, "Nice but slow in the middle.");
        n1.addReview(revN1_1);
        n1.addReview(revN1_2);
        n1.addReview(revN1_3);
        System.out.println("Title: " +  n1.getTitle());
        System.out.println("Reviews: ");
        for (Review r : n1.getReview()){
            System.out.println(r.toString());
        }
        System.out.println("Average Rating:" + n1.getAverageRating());
        System.out.println("Media Type:" + n1.getMediaType());
        System.out.println("\n------------\n");


        // Reviews for Novel n2
        //Using Second Constructor
        ArrayList<Review> secondNovelreviews = new ArrayList<>();
        Review revN2_1 = new Review("Nora", 5, "A classic masterpiece.");
        Review revN2_2 = new Review("Hassan", 4, "Beautifully written.");
        Review revN2_3 = new Review("Layla", 3, "Good read but overhyped.");
        secondNovelreviews.add(revN2_1);
        secondNovelreviews.add(revN2_2);
        secondNovelreviews.add(revN2_3);
        Novel n2 = new Novel("The Great Gatsby", "Scott Fitzgerald", "212-990", 12.99, 22, secondNovelreviews,"Tragedy");
        System.out.println("Title: " + n2.getTitle());
        System.out.println("Reviews:" );
        for (Review r : secondNovelreviews){
            System.out.println(r.toString());
        }
        System.out.println("Media Type:" + n2.getMediaType());


        System.out.println("\n------------\n");

        Music mu1 = new Music("9", "Drake", "000-000", 22.00, "Drake");

        ArrayList<Music> musicCatalog1 = new ArrayList<>();
        musicCatalog1.add(mu1);
        ArrayList<Music> generated = mu1.generatePlayList(musicCatalog1);
        System.out.println("Generated Music: ");
        for (Music c : generated){
            System.out.println(c);
        System.out.println("Media Type: " + mu1.getMediaType());
        }

        System.out.println("\n------------\n");
        Music mu2 = new Music("Greatest Hits", "StudioX", "000-000", 9.99, "The Weekend");
        ArrayList<Music> musicCatalog2 = new ArrayList<>();
        musicCatalog2.add(mu2);
        ArrayList<Music> generated2 = mu2.generatePlayList(musicCatalog2);
        System.out.println("Generated Music: ");
        for (Music c : generated2){
            System.out.println(c);
            System.out.println("Media Type: " + mu2.getMediaType());
        }


        System.out.println("\n------------\n");
        Movie movie = new Movie("Cyber War", "Nora Tech", "000-000", 14.99, 120);
        System.out.println(movie);
        System.out.println("\n------------\n");


        //Initializing Store
        Store store = new Store();

        //Creating Users
        User u1 = new User("Faisal", "Faisal@gmail.com");
        User u2 = new User("Mohammed", "Mohammed@gmail.com");
        //Adding media to Store

        store.addMedia(ac1);
        store.addMedia(ac2);
        store.addMedia(n1);
        store.addMedia(n2);
        store.addMedia(mu1);
        store.addMedia(mu2);
        store.addMedia(movie);
        System.out.println("Media in store: ");
        store.displayMedia();
        //Adding users to store
        store.addUser(u1);
        store.addUser(u2);
        System.out.println("Users in Store: ");
        store.displayUsers();

        System.out.println("----------------------");
        System.out.println("User 1 Shopping: \n");
        u1.addToCart(mu1);
        u1.addToCart(mu2);
        System.out.println(u1.getUsername() + " Cart: {");
        for (Media m : u1.getShoppingCart()){
            System.out.println(" title: " + m.getTitle());
        }
        System.out.println("}");
        System.out.println("User removed an item from his cart..");
        u1.removeFromCart(mu2);
        System.out.println();
        u1.checkout();
        System.out.println(u1.getUsername() + " Purchase List: {");
        for (Media m : u1.getPurchaseMediaList()){
            System.out.println("Title: "+ m.getTitle());
        }
        System.out.println("}");
        System.out.println();
        System.out.println("User listening to music: ");
        mu1.listen(u1);


        System.out.println("------------------");
        System.out.println("User 2 Shopping: ");
        System.out.println("User 2 Searching for an academic book: "+ store.searchBook("Data Structures"));

        u2.addToCart(n1);
        u2.addToCart(ac2);
        u2.addToCart(ac1);
        u2.checkout();
        System.out.println(u2.getUsername() + " Cart: {");

        for (Media m : u2.getShoppingCart()){
            System.out.println(" title: " + m.getTitle());
        }
        System.out.print("}\n");
        System.out.println();
        System.out.println(u2.getUsername() + " Purchase List: {");
        for (Media m : u2.getPurchaseMediaList()){
            System.out.println("Title: "+ m.getTitle());
        }
        System.out.println("}");





    }
}
