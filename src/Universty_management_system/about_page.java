package Universty_management_system;

import java.awt.*;
import javax.swing.*;

public class about_page extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    Font f1, f2, f3, f4, f5;
    JPanel p1, p2, p3;

    about_page() {
        super("About Us");
        setSize(990, 480);
        setLocation(100, 100);
        setResizable(false);
        this.setBackground(Color.WHITE);

        l1 = new JLabel("University Management System");
        l1.setHorizontalAlignment(JLabel.CENTER);

        l2 = new JLabel("v5.6.2.6");
        l3 = new JLabel("Developed by: M. Akhila");
        l4 = new JLabel("Roll No:");
        l5 = new JLabel("Email:");
        l6 = new JLabel("Education:");
        l7 = new JLabel("University:");
        l8 = new JLabel("Phone:");

        l2.setHorizontalAlignment(JLabel.CENTER);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l4.setHorizontalAlignment(JLabel.CENTER);
        l5.setHorizontalAlignment(JLabel.CENTER);
        l6.setHorizontalAlignment(JLabel.CENTER);
        l7.setHorizontalAlignment(JLabel.CENTER);
        l8.setHorizontalAlignment(JLabel.CENTER);

        l9 = new JLabel("akhila@example.com");  // Example email
        l10 = new JLabel("B.Tech in Computer Science");  // Example education
        l11 = new JLabel("XYZ University");  // Example university

        f1 = new Font("Arial", Font.BOLD, 35);
        l1.setFont(f1);
        l1.setForeground(Color.BLACK);

        f2 = new Font("SansSerif", Font.BOLD, 30);
        l3.setFont(f2);
        l3.setForeground(Color.RED);

        f3 = new Font("SansSerif", Font.BOLD, 16);
        l4.setFont(f3);
        l5.setFont(f3);
        l6.setFont(f3);
        l7.setFont(f3);
        l8.setFont(f3);

        f4 = new Font("SansSerif", Font.BOLD, 20);
        l2.setFont(f4);
        l2.setForeground(Color.BLUE);

        f5 = new Font("SansSerif", Font.BOLD, 20);
        l9.setFont(f5);
        l10.setFont(f5);
        l11.setFont(f5);
        l9.setForeground(Color.ORANGE);
        l10.setForeground(Color.RED);
        l11.setForeground(Color.BLUE);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1, 10, 10));
        p1.add(l1);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(7, 1, 10, 10));
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);
        p2.add(l6);
        p2.add(l7);
        p2.add(l8);
        p2.add(l2);

        p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 3, 10, 10));
        p3.add(l9);
        p3.add(l10);
        p3.add(l11);

        setLayout(new BorderLayout(30, 30));
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new about_page().setVisible(true);
    }
}
