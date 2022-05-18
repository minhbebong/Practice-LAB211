public class Book {
    public String name;
    public int price;
   
    public Book(String name, int price) {
        this.name=name;
        this.price=price;
    }    
   //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return name + "\t" + price;
    }
    
}
