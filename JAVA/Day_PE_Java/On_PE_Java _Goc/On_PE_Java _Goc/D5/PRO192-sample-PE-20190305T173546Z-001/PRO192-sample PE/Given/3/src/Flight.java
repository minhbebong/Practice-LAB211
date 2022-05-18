public class Flight {
    String route;
    int fare;
    public Flight(String route, int fare) {
        this.route = route;
        this.fare = fare;
    }
  
    /*Complete the below function for second test case*/
    public String getDeparture() {
    //route=ICN-HAN
    String [] word = route.split("-");
    
    return word[0];
    }

    @Override
    public String toString() {
        return route + "\t" + fare;
    }
    

   
}
