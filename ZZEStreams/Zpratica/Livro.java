package ZZEStreams.Zpratica;

public class Livro {
    private String title;
    private double assessment;
    private double price;

    public Livro(String title, double price, double assessment) {
        this.title = title;
        this.price = price;
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "title='" + title + '\'' +
                ", assessment=" + assessment +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }
}

