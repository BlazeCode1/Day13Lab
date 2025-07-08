import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;


    public AcademicBook(String subject) {
        this.subject = subject;
    }

    public AcademicBook(int stock, String subject) {
        super(stock);
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> review, String subject) {
        super(title, auteur, ISBN, price, stock, review);
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        if(super.isBestSeller()){
            return "Bestselling Academic "+ super.getMediaType();
        }else {
            return " Academic" + super.getMediaType();
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return super.toString()  +
                "subject: '" + subject + '\'' +
                '}';
    }
}
