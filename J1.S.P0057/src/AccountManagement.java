
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class AccountManagement {

    public void createAccount() {
        List<Account> listAccounts = FileProcess.getListAccounts("user.dat");
        String username = Validation.getString("Enter username: ", 
                "You must enter least at 5 character, and no space!", "^\\S(5,)$");
        
        String password = Validation.getString("Enter password: ", 
                "You must enter least at 8 character, and no space!", "^\\S*\\W+\\S*$");
        Account account = new Account(username, password);
        FileProcess.appendAccount("user.dat");
        System.out.println("Save account successful");
    }

    public void login() {
        String username = Validation.getString("Enter username: ", 
                "You must enter least at 5 character, and no space!", "^\\S(5,)$");
        
        String password = Validation.getString("Enter password: ", 
                "You must enter least at 8 character, and no space!", "^\\S*\\W+\\S*$");
        Account account = new Account(username, password);
        if (isUsernamePassWordCorrect(username, password)) {
            System.out.println("Login successful!");
        }else{
            System.out.println("Login fail.");
        }
    }

    private boolean isUsernamePassWordCorrect(String username, String password) {
        List<Account> listAccounts = FileProcess.getListAccounts("user.dat");
        for (Account account : listAccounts ) {
            if (account.getUsername().equalsIgnoreCase(username)
                    && account.getPassword().equalsIgnoreCase(password)) {
                return true;
            }
        }
        return false;
    }
    
}
