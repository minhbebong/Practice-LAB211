//your job is to complete this class
public class Cake{ 
     double price;
     String name;
     double itax;
     Cake(String name, double price, double itax) { 
         //your code goes here    
         this.name=name;
         this.price=price;
         this.itax=itax;
    }
     
    //add and complete you other methods (if needed) here   

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getItax() {
        return itax;
    }

    public void setItax(double itax) {
        this.itax = itax;
    }
 
}
