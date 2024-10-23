package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

    

public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        Random ran = new Random();
        random = Math.abs(ran.nextLong()% 9000L + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO."+random);
        
        formno.setFont(new Font("Raley",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personaldetails = new JLabel("page 1: Personal Details");
        personaldetails.setFont(new Font("Raley",Font.BOLD,22));
        personaldetails.setBounds(290,80,400,30);
        add(personaldetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raley",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raley",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raley",Font.BOLD,20));
        fname.setBounds(100,190,400,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raley",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raley",Font.BOLD,20));
        dob.setBounds(100,240,400,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raley",Font.BOLD,20));
        gender.setBounds(100,290,300,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raley",Font.BOLD,20));
        email.setBounds(100,340,300,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Rafel",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel martial = new JLabel("Martial Status:");
        martial.setFont(new Font("Raley",Font.BOLD,20));
        martial.setBounds(100,390,300,30);
        add(martial);
        
        married = new JRadioButton("married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(460,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup martialgp = new ButtonGroup();
        martialgp.add(married);
        martialgp.add(unmarried);
        martialgp.add(other);
                
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raley",Font.BOLD,20));
        address.setBounds(100,440,300,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Rafel",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raley",Font.BOLD,20));
        city.setBounds(100,490,300,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Rafel",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
                 
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raley",Font.BOLD,20));
        pincode.setBounds(100,540,300,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Rafel",Font.BOLD,14));
        pincodeTextField.setBounds(300,540,400,30);
        add(pincodeTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raley",Font.BOLD,20));
        state.setBounds(100,590,300,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Rafel",Font.BOLD,14));
        stateTextField.setBounds(300,590,400,30);
        add(stateTextField);
                
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,700,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno = ""+ random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if (female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String martial = null;
        if(married.isSelected()){
            martial = "Married";
        }else if(unmarried.isSelected()){
            martial = "Unmarried";
        }else if(other.isSelected()){
              martial = "Other"; 
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]) {
        new SignupOne().setVisible(true);
    }
}
