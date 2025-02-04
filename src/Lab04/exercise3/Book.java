package Lab04.exercise3;

public class Book {
    String title;
    double price;
    String ISBN;
    int pages;

    public Book(){
        this("Title Not Avilable", 0.00, "ISBN Not Available", 0);
    }

    public Book(String title, double price, String ISBN, int pages){
        this.title = title;
        this.price = price;
        this.ISBN = ISBN;
        this.pages = pages;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public String getISBN(){
        return ISBN;
    }

    public int getPages(){
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Title: "+getTitle()+"\tPrice: " + getPrice() + "\tISBN: " + getISBN() + "\tPages: " + getPages();
    }
}
