import java.util.*;

/**
 *
 * @author Admin
 */
public class MyFan implements IFan {

    @Override
    public void f1(List<Fan> list, String xCode) {
        for (Fan e : list){
            if (e.getCode().startsWith(xCode)){
                e.setPrice(e.getPrice()*1.1);
            }
        }
    }

    @Override
    public int f2(List<Fan> list, double d) {
        int count = 0;
        for (Fan e : list){
            if(e.getPrice() <= d) count += 1;
        }
        return count;
    }

    @Override
        public void f3(List<Fan> list) {
        Collections.sort(list,(Fan a, Fan b) -> {
            if (a.getPrice() == b.getPrice()){
                return a.getCode().compareToIgnoreCase(b.getCode());
            }
            return Double.compare(a.getPrice(), b.getPrice());
        });
    }
}

