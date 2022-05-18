

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyCourse implements ICourse {

    @Override
    public void f1(List<Course> a, int st) {
        
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
        if (st == 1) {
            Collections.sort(a, new Comparator<Course>() {
                @Override
                public int compare(Course o1, Course o2) {
                    if (o1.fee > o2.fee) {
                        return 1;
                    } else if (o1.fee < o2.fee) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
        } else {
            Collections.sort(a, new Comparator<Course>() {
                @Override
                public int compare(Course o1, Course o2) {
                    if (o1.name.compareToIgnoreCase(o2.name) < 0) {
                        return 1;
                    } else if (o1.name.compareToIgnoreCase(o2.name) == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            });
        }
    }
    
    @Override
    public int f2(List<Course> a, double fee) {
    int count =0;
    for (int i=0;i<a.size();i++) {
        if (a.get(i).fee>=fee){
        count++;
        }
    }return count;
    }
    
}
