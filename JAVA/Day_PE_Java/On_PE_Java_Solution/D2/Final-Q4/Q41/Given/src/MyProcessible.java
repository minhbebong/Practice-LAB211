/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyProcessible implements Processible{

    @Override
    public String intersect(String s1, String s2) {
        String word1[]=s1.trim().split("\\s+");
        String word2[]=s2.trim().split("\\s+");
        
        String result="";
        for(int i=0;i<word1.length;i++){
            for(int j=0;j<word2.length;j++){
                if(word1[i].equalsIgnoreCase(word2[j])&&!result.contains(word1[i])){
                    result=result+word1[i]+" ";
                }
            }
        }
        return result.trim();
    }

    @Override
    public String getEmail(String fullname) {
        String [] word=fullname.split("\\s+");
        String result=word[word.length-1];
        for(int i=0;i<word.length-1;i++){
            result=result+word[i].charAt(0);
        }
        result+="@fpt.edu.vn";
        return result;
    }
    
}
