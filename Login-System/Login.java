import javax.script.ScriptContext;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

import javax.swing.*;


class Login{
String name,email,pass,phone,nemail,npass;

    void signup(){
        JOptionPane.showMessageDialog(null,"Hi..!","Creating Account",JOptionPane.INFORMATION_MESSAGE);
        name=JOptionPane.showInputDialog(null,"Name:","Creating Account",JOptionPane.INFORMATION_MESSAGE);
        email=JOptionPane.showInputDialog(null,"Email:","Creating Account",JOptionPane.INFORMATION_MESSAGE);
        pass=getPasswordInput("Password:");
        phone=JOptionPane.showInputDialog(null,"Contact:","Creating Account",JOptionPane.INFORMATION_MESSAGE);
        login();
    }

    void login(){
        JOptionPane.showMessageDialog(null,"Login to your Account","Login..",JOptionPane.INFORMATION_MESSAGE);
        nemail=JOptionPane.showInputDialog(null,"Enter Email","Login..",JOptionPane.INFORMATION_MESSAGE);
        if(nemail.equals(email)){
          npass=getPasswordInput("Enter Password:");
            if(npass.equals(pass)){
                JOptionPane.showMessageDialog(null,"Greeting "+name,"Welcome <3",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                while (!npass.equals(pass)){
                    npass=getPasswordInput("Invalid Password! Please try again");
                }
                JOptionPane.showMessageDialog(null,"Greeting "+name,"Welcome <3",JOptionPane.INFORMATION_MESSAGE);
            }}
        else {
            while (!nemail.equals(email)){
                nemail=JOptionPane.showInputDialog(null,"Invalid Email! please try Again","Error",JOptionPane.INFORMATION_MESSAGE);
            }
            npass=getPasswordInput("Enter Password:");
            if(npass.equals(pass)){
                JOptionPane.showMessageDialog(null,"Greeting "+name,"Welcome <3",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                while (!npass.equals(pass)){
                    npass=getPasswordInput("Invalid Password! Please try again");
                }
                JOptionPane.showMessageDialog(null,"Greeting "+name,"Welcome <3",JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    private String getPasswordInput(String message) {
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(
                null, passwordField, message, JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            return new String(passwordField.getPassword());
        } else {
            return ""; // or handle cancel appropriately
        }
    }
}
class h{
    public static void main(String[] args) {
Login obj = new Login();
        obj.signup();
    }

}
