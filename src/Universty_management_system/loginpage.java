package Universty_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class loginpage extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField p;
    JButton b1, b2;
    JPanel p1, p2, p3, p4;
    Font f;

    loginpage() {
        super("Login Page");
        setSize(330, 200);
        setLocation(500, 250);
        setResizable(false);
        f = new Font("Arial", Font.BOLD, 13);
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l1.setFont(f);
        l2.setFont(f);
        b1 = new JButton("Login");
        String imgUrl="Icons/admin_login2.jpg";
        ImageIcon bimg = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image bimg1 = bimg.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(bimg1));

        b2 = new JButton("Cancel");
        ImageIcon bim2 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image bimg2 = bim2.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(bimg2));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b1.setFont(f);
        b2.setFont(f);
        t1 = new JTextField(15);
        p = new JPasswordField(15);
        t1.setFont(f);
        p.setFont(f);

        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img = im1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon imm = new ImageIcon(img);
        l3 = new JLabel(imm);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        setLayout(new BorderLayout());

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(p);

        add(p1, "Center");

        p2.add(b1);
        p2.add(b2);

        add(p2, "South");

        p3.add(l3);

        add(p3, "West");

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == b1) {
            String Username = t1.getText();
            String Password = new String(p.getPassword());
            try {
                connection obj = new connection();
                String q = "select * from login where admin='" + Username + "' and password='" + Password + "'";
                ResultSet res = obj.stm.executeQuery(q);
                if (res.next()) {
                    new homepage().setVisible(true);
                    System.out.println("data");
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ev.getSource() == b2) {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?");
            if (choice == JOptionPane.YES_OPTION) {
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]) {
        new loginpage().setVisible(true);
    }
}
