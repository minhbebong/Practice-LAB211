//your task is to complete this class
public class Book {
    String name;
    int price;

    public Book() {
    }
    
    public Book(String name, int price) {
         this.name=name;
         this.price=price;
    } 
    
    //add and complete you other methods (if needed) here   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
