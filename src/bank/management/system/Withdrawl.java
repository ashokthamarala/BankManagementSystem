
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField amt;
    JButton withdraw,back;
    JLabel text;
    String pin;
    Withdrawl(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0, 0, 900,900);
        add(image);
        
        text = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(175,350,400,35);
        image.add(text);
        
        amt = new JTextField();
        amt.setFont(new Font("Raleway", Font.BOLD, 22));
        amt.setBounds(175,420,320,25);
        image.add(amt);
        
        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(390,588,150,35);
        image.add(withdraw);
        withdraw.addActionListener(this);
        
        
        back= new JButton("BACK");
        back.setBounds(390,633,150,35);
        image.add(back);       
        back.addActionListener(this);
        
        setSize(900,900);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==withdraw){
                String amount = amt.getText();
                Date date = new Date();
                if(text.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    try{
                    Conn c1 = new Conn();
                    String query = "insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                    c1.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdraw Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }catch(Exception e){
                    System.out.println(e);
          }
            }
}           else if(ae.getSource()==back){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }
    
    public static void main(String[] args){
        new Withdrawl("").setVisible(true);
    }
}
