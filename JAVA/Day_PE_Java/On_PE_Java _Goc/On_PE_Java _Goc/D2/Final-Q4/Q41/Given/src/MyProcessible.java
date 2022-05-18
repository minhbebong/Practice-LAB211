/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyProcessible implements Processible {

    @Override
    public String intersect(String s1, String s2) {
        String [] word_S1 = s1.split(" ");
        String [] word_S2 = s2.split(" ");
        String result="";
        for(int i=0;i<word_S1.length;i++){
            for(int j=0;j<word_S2.length;j++){
                if(word_S1[i].equalsIgnoreCase(word_S2[j])&&!result.contains(word_S1[i])){
                    result=result+word_S1[i]+" ";
                }
            }
        }
        return result.trim();
    }

    @Override
    public String getEmail(String fullname) {
        String []word = fullname.split(" ");
        String email=word[word.length-1];
        //email=Bang;
        for(int i=0;i<word.length-1;i++){
            //voi i=0
            //email=email+word[0].charAt(0)=BangTA
            email=email+word[i].charAt(0);
        }
        email=email+"@fpt.edu.vn";
        return email;
    } 
    
}
