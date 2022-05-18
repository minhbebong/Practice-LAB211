/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyCal implements Calculateble {

    @Override
    public String isBeautiful(int number) {

        int n = number;
        boolean check = true;
        while (n > 0) {
            if ((n % 10) % 2 == 1) {
                check = false;
                break;
            }
            n /= 10;
        }
        String s = number + "";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(i);
        }

        if (s.equals(s1) && check == true) {
            s = "Beatify";
        } else {
            s = "Not beatify";
        }
        return s;
    }

    @Override
    public String separate(String name) {
        name=name.trim();
        String first=name.substring(0, name.indexOf(" "));
        String middle=name.substring(name.indexOf(" ")+1, name.lastIndexOf(" "));
        String last=name.substring(name.lastIndexOf(" ")+1, name.length());
        return "first: "+first+", middle: "+middle+", last: "+last;
    }

}
