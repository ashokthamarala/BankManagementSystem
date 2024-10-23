
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Transactions extends JFrame implements ActionListener {
     
    JButton deposit,withdrawal,fastcash,ministatement,balanceenquiry,pinchange,exit;
    String pin;
    
       Transactions(String pin) {
           this.pin= pin;
           
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
           Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel image = new JLabel(i3);
           add(image);
           
           JLabel text = new JLabel("Please select your Transactions");
           text.setBounds(210,275,700,35);
           text.setForeground(Color.white);
           text.setFont(new Font("System",Font.BOLD,16));
           image.add(text);
           
           deposit = new JButton("Deposit");
           deposit.setBounds(170,399,150,30);
           deposit.addActionListener(this);
           image.add(deposit);
           
           withdrawal = new JButton("Cash Withdrawal");
           withdrawal.setBounds(355,399,150,30);
           withdrawal.addActionListener(this);
           image.add(withdrawal);
           
           fastcash = new JButton("Fast Cash");
           fastcash.setBounds(170,432,150,30);
           fastcash.addActionListener(this);
           image.add(fastcash);
           
           ministatement = new JButton("Mini Statement");
           ministatement.setBounds(355,432,150,30);
           ministatement.addActionListener(this);
           image.add(ministatement);
           
           
           
           balanceenquiry = new JButton("Balance Enquiry");
           balanceenquiry.setBounds(170,465,150,30);
           balanceenquiry.addActionListener(this);
           image.add(balanceenquiry);
           
           pinchange = new JButton("Pin Change");
           pinchange.setBounds(355,465,150,30);
           pinchange.addActionListener(this);
           image.add(pinchange);
           
           exit = new JButton("Exit");
           exit.setBounds(355,499,150,30);
           exit.addActionListener(this);
           image.add(exit );
           
           setSize(900,860);
           setLocation(300,0);
           setUndecorated(true);
           setVisible(true);
       }
       
      public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==withdrawal){ 
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }else if(ae.getSource()==fastcash){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource()==ministatement){ 
            new MiniStatement(pin).setVisible(true);
        }else if(ae.getSource()== pinchange){ 
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }else if(ae.getSource()==balanceenquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if(ae.getSource()==exit){ 
            System.exit(0);
        }
    }
       public static void main(String args[]) {
       new Transactions("").setVisible(true);
       
    }
}
