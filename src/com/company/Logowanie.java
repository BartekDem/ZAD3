package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Logowanie implements ActionListener {

    JFrame frame = new JFrame();
    Container c = frame.getContentPane();
    JButton loginbutton = new JButton("Login");
    JButton cancelbutton = new JButton("Cancel");
    JTextField poleID = new JTextField();
    JPasswordField polehaslo = new JPasswordField();
    JLabel IDuzytkownikaLabel = new JLabel("ID");
    JLabel haslouzytkownikaLabel = new JLabel("haslo:");
    JLabel wiadomiscLabel = new JLabel("");
    HashMap<String,String> logininfo = new HashMap<String,String>();

    Logowanie(HashMap<String,String> loginInfoOriginal){

        logininfo = loginInfoOriginal;

        IDuzytkownikaLabel.setBounds(50,100,75,25);
        haslouzytkownikaLabel.setBounds(50,150,75,25);

        wiadomiscLabel.setBounds(123,250,250,35);

        poleID.setBounds(125,100,200,25);
        polehaslo.setBounds(125,150,200,25);

        loginbutton.setBounds(125,200,100,25);
        loginbutton.addActionListener(this);

        cancelbutton.setBounds(225,200,100,25);
        cancelbutton.addActionListener(this);

        c.setBackground(Color.gray);
        frame.add(cancelbutton);
        frame.add(loginbutton);
        frame.add(polehaslo);
        frame.add(poleID);
        frame.add(IDuzytkownikaLabel);
        frame.add(haslouzytkownikaLabel);
        frame.add(wiadomiscLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==cancelbutton) {
            poleID.setText("");
            polehaslo.setText("");
        }
        if(e.getSource()==loginbutton) {
            String ID = poleID.getText();
            String haslo = String.valueOf(polehaslo.getPassword());

            if(logininfo.containsKey(ID)) {
                if(logininfo.get(ID).equals(haslo)){
                    c.setBackground(Color.GREEN);
                    wiadomiscLabel.setText("logowanie udane");

                }
                else{
                    frame.setBackground(Color.RED);
                    wiadomiscLabel.setText("zle haslo");
                    c.setBackground(Color.red);
                }
            }
            else{
                wiadomiscLabel.setText("nie ma takiego uzytkownika");
                c.setBackground(Color.red);
            }
        }
    }
}
