
import java.util.List;

public class MyBill implements IBill{
    @Override
    public int f1(List<Bill> a, boolean paid){
        int count = 0;
        for(int i=0; i<a.size(); i++)
        {
            if (a.get(i).isPaid() == paid)
                count ++;
        }
        return count;
    }
    
    @Override
    public void f2(List<Bill> a, double totalmoney){
        for(int i=0; i<a.size(); i++)
        {
            if(a.get(i).getTotalmoney() > totalmoney  &&  a.get(i).isPaid() == false)
                System.out.println(a.get(i).toString());
        }
    }
    
    @Override
    public double f3(List<Bill> a, String date){
        double sum = 0;
        for(int i=0; i<a.size(); i++)
        {
            if(a.get(i).isPaid() == true && a.get(i).getDate().equals(date))
                sum += a.get(i).getTotalmoney();
        }
        return sum;
    }
}
