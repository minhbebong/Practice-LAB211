public class Flight {
private String route; private int fare;
    public Flight(String route, int fare) {
     this.route = route;
     this.fare = fare;
    }
  
    /*Complete the below function for second test case*/
    public String getDeparture() {
     String s = route.substring(0,route.indexOf("-"));
     /*
      String [] a = route.split("-");
      return(a[0]);     
     */
     return(s);
    }
    
 public String toString() {
   return(route + "  " + fare);  
 }   
   //add and complete your other methods here (if needed)

   
}
