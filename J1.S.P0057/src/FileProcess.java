
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class FileProcess {
    static List<Account> getListAccounts(String fileName) {
        try {
            BufferedReader in  = new BufferedReader(new FileReader(fileName));
            String str = "";
            List<Account> list = new ArrayList<>();
            while ((str = in.readLine()) != null) {                
                String data [] = str.split("[;]");
                Account account = new Account(data[0], data[1]);
                list.add(account);
            }
            return list;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileProcess.class.getName ()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(FileProcess.class.getName ()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        List<Account> listAccounts = FileProcess.getListAccounts("user.dat");
        System.out.println(listAccounts);
    }
    public static void appendAccount(String fileName) {
        
    }
    
    
}
