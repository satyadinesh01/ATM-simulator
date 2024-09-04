package BankingSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6;
    String pin;
    Transactions(String pin){
        this.pin = pin;

        JLabel l2 = new JLabel();
        l2.setBounds(0, 0, 960, 1080);
        add(l2);

        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.black);
        l1.setFont(new Font("System", Font.BOLD, 16));


        b1 = new JButton("DEPOSIT");
        b2 = new JButton("CASH WITHDRAWL");
        b3 = new JButton("EXIT");
        b4 = new JButton("MINI STATEMENT");
        b5 = new JButton("PIN CHANGE");
        b6 = new JButton("BALANCE ENQUIRY");
       // b7 = new JButton("EXIT");

        setLayout(null);

        l1.setBounds(235,400,700,35);
        l2.add(l1);

        b1.setBounds(170,499,150,35);
        l2.add(b1);

        b2.setBounds(390,499,150,35);
        l2.add(b2);

       b3.setBounds(170,543,150,35);
        l2.add(b3);

        b4.setBounds(390,543,150,35);
        l2.add(b4);

        b5.setBounds(170,588,150,35);
        l2.add(b5);

        b6.setBounds(390,588,150,35);
        l2.add(b6);

      //  b7.setBounds(390,633,150,35);
       // l2.add(b7);


        b1.addActionListener(this);
        b2.addActionListener(this);
       b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
       // b7.addActionListener(this);


        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);



    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);

            this.dispose();
          deposite1  demo=new deposite1();
          demo.toFront();
          this.dispose();

        }else if(ae.getSource()==b2){

            setVisible(false);
            new withdraw2().setVisible(true);


        }else if(ae.getSource()==b3){
            System.exit(0);

        }else if(ae.getSource()==b4){
            new MiniStatement(pin).setVisible(true);
        }else if(ae.getSource()==b5){
            setVisible(false);
            pin2 demo=new pin2();
            demo.toFront();
        }else if(ae.getSource()==b6){
            this.setVisible(false);
            check demo=new check();
            demo.toFront();

        }
    }

    public static void main(String[] args){

        new Transactions("").setVisible(true);
    }
}