public class ReservationCode {
    public String customerName;
    public String code;
    public ReservationCode(String code, String customerName) {
        this.code=code;
        this.customerName=customerName;
    }
    
     
    String getCode() {
        String s="";
        String s1=code;
        int i =0;
        
        if(this.code.length()%3==0){
            s+=s1.substring(0, 3);
            i=3;
            while(i<=s1.length()-3){
            s=s+'-'+s1.substring(i, i+3);
            i+=3;
            }
        }
        
        return s;
    }
    
    /*add and complete your other methods here (if needed)*/

    @Override
    public String toString() {
        return customerName +"\t"+code;
    }
    
}
