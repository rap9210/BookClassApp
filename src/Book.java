public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private String isInStock;

    public Book(){

    }

    public Book(String title, String author, String description){
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public String getDisplayText(){
    return title + " by " + author + "\n" + description;}

    public String getTitle(){
        return title;
    }
    public String setTitle(String title){
        this.title = title;
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String setAuthor(String author){
        this.author = author;
        return author;
    }
    public String getDescription(){
        return description;
    }
    public String setDescription(String description){
        this.description = description;
        return description;
    }
    public double getPrice(){
        return price;
    }
    public double setPrice(double price){
        this.price = price;
        return price;
    }
    public String getInStock(){
        return isInStock;
    }
    public String setInStock(String isInStock){
        this.isInStock = isInStock;
        return isInStock;
    }

}
