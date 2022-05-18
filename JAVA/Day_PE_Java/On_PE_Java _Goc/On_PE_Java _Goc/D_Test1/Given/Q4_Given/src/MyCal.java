/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyCal implements Calculateble{

    @Override
    public String isBeautiful(int number) {
        //123454321
        //54321
        String out="Beauty";
        String s1=number+"";
        String s2="";
        for(int i=s1.length()-1;i>=0; i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)){
            while(number>0){
                int c =number%10;
                if(c%2==1){
                    out="Not beautify";
                    break;
                }
                number=number/10;
            }
        }else{
            out="Not beautify";
        }
        return out;
    }

    @Override
    public String separate(String fullname) {
        String []word = fullname.split("\\s+");
        String first=word[0];
        String middle="";
        for(int i=1;i<word.length-1;i++){
            middle=middle+word[i]+ " ";
        }
        middle=middle.trim();
        
        String last=word[word.length-1];
        String result="first: "+first+", middle: "+ middle + ", last: " + last;
        return result;
    }
    
}
