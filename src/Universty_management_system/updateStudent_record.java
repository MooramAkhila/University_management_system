package Universty_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class updateStudent_record extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    JButton bt1, bt2;
    JComboBox<String> cm1, cm2;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    JPanel p1, p2, p3;
    String[] a = {"Computer Science", "Math", "Chemistry", "Physics", "Electrical", "Commerce"};
    String[] b = {"B.Tech", "M.Tech", "MCA", "B.A", "B.Sc"};
    Font f, f1;

    updateStudent_record() {
    }

    updateStudent_record(String sm) {
        super("Update Student");
        setSize(350, 570);
        setResizable(false);
        setLocation(250, 80);

        f = new Font("Senserif", Font.BOLD, 35);
        f1 = new Font("Arial", Font.BOLD, 16);

        l1 = new JLabel("Name");
        l2 = new JLabel("Father's Name");
        l3 = new JLabel("Age");
        l4 = new JLabel("DOB");
        l5 = new JLabel("Address");
        l6 = new JLabel("Phone");
        l7 = new JLabel("Email");
        l8 = new JLabel("Class X");
        l9 = new JLabel("Class XII");
        l10 = new JLabel("Roll No");
        l11 = new JLabel("Branch");
        l12 = new JLabel("Course");
        l13 = new JLabel("Enter roll number to update student details");

        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        l7.setFont(f1);
        l8.setFont(f1);
        l9.setFont(f1);
        l10.setFont(f1);
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
        t10 = new JTextField(15);
        t11 = new JTextField(15);
        t12 = new JTextField(15);

        t1.setFont(f1);
        t2.setFont(f1);
        t3.setFont(f1);
        t4.setFont(f1);
        t5.setFont(f1);
        t6.setFont(f1);
        t7.setFont(f1);
        t8.setFont(f1);
        t9.setFont(f1);
        t10.setFont(f1);
        t11.setFont(f1);
        t12.setFont(f1);

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

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img = ii1.getImage().getScaledInstance(150, 370, Image.SCALE_DEFAULT);
        ImageIcon ii2 = new ImageIcon(img);
        l15 = new JLabel(ii2);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.setLayout(new GridLayout(12, 2, 10, 10));
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
        p1.add(l10);
        p1.add(t10);
        p1.add(l11);
        p1.add(cm1);
        p1.add(l12);
        p1.add(cm2);
        p1.add(bt1);
        p1.add(bt2);

        p2.add(l15);

        setLayout(new BorderLayout(30, 30));
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.WEST);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        loadStudentDetails(sm);
    }

    void loadStudentDetails(String rollno) {
        try {
            connection obj = new connection();
            String query = "select * from new_student_add where roll_no='" + rollno + "'";
            ResultSet rs = obj.stm.executeQuery(query);
            if (rs.next()) {
                t10.setText(rs.getString("roll_no"));
                t1.setText(rs.getString("name"));
                t2.setText(rs.getString("father_name"));
                t3.setText(rs.getString("age"));
                t4.setText(rs.getString("dob"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                t8.setText(rs.getString("classx"));
                t9.setText(rs.getString("classxii"));
                cm1.setSelectedItem(rs.getString("department"));
                cm2.setSelectedItem(rs.getString("course"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == bt1) {
            String rollno = t10.getText();
            String name = t1.getText();
            String fathername = t2.getText();
            int age = Integer.parseInt(t3.getText());
            String dob = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            int classX = Integer.parseInt(t8.getText());
            int classXII = Integer.parseInt(t9.getText());
            String branch = (String) cm1.getSelectedItem();
            String course = (String) cm2.getSelectedItem();

            try {
                connection obj = new connection();
                String query = "update new_student_add set name='" + name + "', father_name='" + fathername + "', age=" + age + ", dob='" + dob + "', address='" + address + "', phone='" + phone + "', email='" + email + "', classx=" + classX + ", classxii=" + classXII + ", department='" + branch + "', course='" + course + "' where roll_no='" + rollno + "'";
                obj.stm.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data updated successfully");
                setVisible(false);
                new update_student().setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (ev.getSource() == bt2) {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        new updateStudent_record("r190340").setVisible(true);
    }
}
