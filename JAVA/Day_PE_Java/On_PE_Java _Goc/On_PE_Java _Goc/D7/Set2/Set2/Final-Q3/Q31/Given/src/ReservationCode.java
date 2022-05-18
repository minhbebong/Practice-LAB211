public class ReservationCode {
    String code;
    String customerName;
    public ReservationCode(String code, String customerName) {
        this.code=code;
        this.customerName=customerName;
        
    }

    public String getCode() {
        String result ="";
        for (int i=0; i<code.length()-3;i=i+3){
            result=result+code.substring(i,(i+3))+"-";
        }
        result=result + code.substring(code.length()-3,code.length());
        return result;        
        
    }

    @Override
    public String toString() {
        return code + "\t" + customerName;
    }
    
    
    
    
    

    
}
