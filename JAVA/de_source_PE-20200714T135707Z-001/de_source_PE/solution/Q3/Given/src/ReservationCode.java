public class ReservationCode {
    private String customerName;
    private String code;

    public ReservationCode(String code, String customerName) {
        this.customerName = customerName;
        this.code = code;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
     
    String getCode() {
        //K2M1D9
        String result = "";
        for (int i = 0; i < code.length(); i++) {
            result = result + code.charAt(i);//K2M-
            if((i+1) % 3==0 && i != code.length()-1){
                result = result + "-";
            }
        }
        
        return result;
    }

    @Override
    public String toString() {
        return customerName +"\t"+code;
    }
    
    
}
