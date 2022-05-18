
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class ListClassRoom implements IClassRoom{

    @Override
    public void f1(List<ClassRoom> list) {
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    @Override
    public void f2(List<ClassRoom> list, int i, int i1) {
        for(int k=0;k<list.size();k++){
            if(list.get(k).seats>i&&list.get(k).seats<i1){
                list.remove(k);
            }
        }
    }

    @Override
    public int f3(List<ClassRoom> list, String string) {
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).name.toLowerCase().contains(string.toLowerCase())){
                count++;
            }
        }
        return count;
    }
    
}
