package Universty_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class new_student_admission extends JFrame implements ActionListener 
{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l11, l12, l13, l14, l15;
    JButton bt1, bt2;
    JComboBox<String> cm1, cm2;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t11;
    JPanel p1, p2;
    String a[] = {"Computer Science", "Math", "Chemistry", "Physics", "Electrical", "Commerce"};
    String b[] = {"B.Tech", "MCA", "B.Sc", "B.Sc Honors", "B.A"};
    Font f, f1;

    new_student_admission()
    {
        super("Add Student");
        setSize(850, 570);
        setResizable(false);
        setLocation(250, 80);

        f = new Font("senserif", Font.BOLD, 25);
        f1 = new Font("Arial", Font.BOLD, 16);

        l1 = new JLabel("Name");
        l2 = new JLabel("Fathers Name");
        l3 = new JLabel("Age");
        l4 = new JLabel("DOB (yyyy-mm-dd)");
        l5 = new JLabel("Address");
        l6 = new JLabel("Phone");
        l7 = new JLabel("Email");
        l8 = new JLabel("Class X (%)");
        l9 = new JLabel("Class XII (%)");
        l11 = new JLabel("Roll No");
        l12 = new JLabel("Branch");
        l13 = new JLabel("Course");
        l14 = new JLabel("New Student Details");
        l14.setFont(f);
        l14.setHorizontalAlignment(JLabel.CENTER);

        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        l7.setFont(f1);
        l8.setFont(f1);
        l9.setFont(f1);
        l11.setFont(f1);
        l12.setFont(f1);
        l13.setFont(f1);

        t1 = new JTextField(10);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        t4 = new JTextField(15);
        t5 = new JTextField(15);
        t6 = new JTextField(15);
        t7 = new JTextField(15);
        t8 = new JTextField(15);
        t9 = new JTextField(15);
        t11 = new JTextField(15);

        t1.setFont(f1);
        t2.setFont(f1);
        t3.setFont(f1);
        t4.setFont(f1);
        t5.setFont(f1);
        t6.setFont(f1);
        t7.setFont(f1);
        t8.setFont(f1);
        t9.setFont(f1);
        t11.setFont(f1);

        cm1 = new JComboBox<>(a);
        cm2 = new JComboBox<>(b);

        cm1.setFont(f1);
        cm2.setFont(f1);

        bt1 = new JButton("Submit");
        bt2 = new JButton("Cancel");

        bt1.setFont(f1);
        bt2.setFont(f1);
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.WHITE);
        String imgUrl="Icons/admin_login2.jpg";

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img = ii1.getImage().getScaledInstance(150, 370, Image.SCALE_DEFAULT);
        ImageIcon ii2 = new ImageIcon(img);

        l15 = new JLabel(ii2);
        p1 = new JPanel();
        p2 = new JPanel();
        p1.setLayout(new GridLayout(13, 2, 110, 10));
        p2.setLayout(new GridLayout(1, 1));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p1.add(l7);
        p1.add(t7);
        p1.add(l8);
        p1.add(t8);
        p1.add(l9);
        p1.add(t9);

        p1.add(l11);
        p1.add(t11);
        p1.add(l12);
        p1.add(cm1);
        p1.add(l13);
        p1.add(cm2);

        p1.add(bt1);
        p1.add(bt2);

        p2.add(l15);

        setLayout(new BorderLayout(30, 30));
        add(p1, BorderLayout.CENTER);
        add(l14, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource() == bt1)
        {
            String name = t1.getText();
            String father_name = t2.getText();
            int age = Integer.parseInt(t3.getText());
            String dob = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            int classX = Integer.parseInt(t8.getText());
            int classXII = Integer.parseInt(t9.getText());
            String rollno = t11.getText();
            String branch = (String) cm1.getSelectedItem();
            String course = (String) cm2.getSelectedItem();
            try
            {
                connection obj = new connection();
                String q = "insert into new_student_add values('" + rollno + "','" + name + "','" + father_name + "','" + age + "','" + dob + "','" + address + "','" + phone + "','" + email + "','" + classX + "','" + classXII + "','" + branch + "','" + course + "')";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Data inserted successfully...");
                setVisible(false);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if(ev.getSource() == bt2)
        {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION)
            {
                setVisible(false);
            }
        }
    }

    public static void main(String args[])
    {
        new new_student_admission().setVisible(true);
    }    
}

