public class Flight {
    String route;
    int fare;
    public Flight(String route, int fare) {
       this.route=route;
       this.fare=fare;
    }
  
    /*Complete the below function for second test case*/
    public String getDeparture() {
        return route.substring(0,route.indexOf("-"));
    }
   //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return route + "\t" + fare;
    }

   
}
