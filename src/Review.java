public class Review {
    private String userName;
    private int rating;
    private String comment;


    public Review(){
        this.userName = "";
        this.rating = 0;
        this.comment = "";
    }
    public Review(String userName, int rating, String comment) {
        this.userName = userName;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return
                "\nuserName:'" + userName + '\'' +
                "\nrating: " + rating +
                "\ncomment: '" + comment + '\'' +
                '\n';
    }
}
