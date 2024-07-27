
package Universty_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class homepage extends JFrame implements ActionListener 
{
   JLabel l1,l2;
   homepage()
   {
       super("Home Page");
       setVisible(true);
       setSize(1600,690);
        String imgUrl="Icons/admin_login2.jpg";
        ImageIcon bimg = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image bimg1 = bimg.getImage().getScaledInstance(1600, 690, Image.SCALE_DEFAULT);
        ImageIcon bg1=new ImageIcon(bimg1);
        l1=new JLabel(bg1);
        
        JMenuBar mb=new JMenuBar();
        JMenu men1=new JMenu("User");
        JMenuItem mt1=new JMenuItem("New Faculty");
        JMenuItem mt2=new JMenuItem("New Student Addmission");
        
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img1 = ii1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt1.setIcon(new ImageIcon(img1));
        mt1.setMnemonic('M');
        mt1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        ImageIcon ii2 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img2 = ii2.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt2.setIcon(new ImageIcon(img2));
        mt2.setMnemonic('S');
        mt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt1.addActionListener(this);
        mt2.addActionListener(this);
        
        JMenu men2=new JMenu("Details");
        JMenuItem mt19=new JMenuItem("Details");
        
        ImageIcon ii19 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img18 = ii19.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt19.setIcon(new ImageIcon(img2));
        mt19.setMnemonic('H');
        mt19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt19.addActionListener(this);
        
        JMenu men3=new JMenu("Attendence");
        JMenuItem mt3=new JMenuItem("Student Attendence");
        JMenuItem mt4=new JMenuItem("Teacher Attendence");
        
        
        ImageIcon ii3 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img3 = ii3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt3.setIcon(new ImageIcon(img3));
        mt3.setMnemonic('T');
        mt3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        
        ImageIcon ii4 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img4 = ii4.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt4.setIcon(new ImageIcon(img4));
        mt4.setMnemonic('D');
        mt4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        
        mt3.addActionListener(this);
        mt4.addActionListener(this);
        
        
        JMenu men4=new JMenu("Attendence Details");
        JMenuItem mt5=new JMenuItem("Student all details");
        JMenuItem mt6=new JMenuItem("Teacher all details");
        
        ImageIcon ii5 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img5= ii5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt5.setIcon(new ImageIcon(img5));
        mt5.setMnemonic('A');
        mt5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        ImageIcon ii6 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img6= ii6.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt6.setIcon(new ImageIcon(img6));
        mt6.setMnemonic('Q');
        mt6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt5.addActionListener(this);
        mt6.addActionListener(this);
        
        JMenu men5=new JMenu("Examination");
        JMenuItem mt7=new JMenuItem("Examination Details");
        JMenuItem mt8=new JMenuItem("Enter Marks");
        
        ImageIcon ii7 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img7= ii7.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt7.setIcon(new ImageIcon(img7));
        mt7.setMnemonic('E');
        mt7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        ImageIcon ii8 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img8= ii8.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt8.setIcon(new ImageIcon(img8));
        mt8.setMnemonic('R');
        mt8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        
        mt7.addActionListener(this);
        mt8.addActionListener(this);
        
        
        JMenu men9=new JMenu("Update Details");
        JMenuItem mt10=new JMenuItem("Update Student");
        JMenuItem mt11=new JMenuItem("Update teacher");
        
        ImageIcon ii10= new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img9= ii10.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt10.setIcon(new ImageIcon(img9));
        mt10.setMnemonic('T');
        mt10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        ImageIcon ii11= new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img10= ii11.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt11.setIcon(new ImageIcon(img10));
        mt11.setMnemonic('Y');
        mt11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt10.addActionListener(this);
        mt11.addActionListener(this);
        
        JMenu men10=new JMenu("Fee Details");
        JMenuItem mt12=new JMenuItem("Fee Structure");
        JMenuItem mt13=new JMenuItem("Student fee form");
        
        ImageIcon ii12 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img11= ii12.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt12.setIcon(new ImageIcon(img11));
        mt12.setMnemonic('U');
        mt12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        ImageIcon ii13 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img12= ii13.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt13.setIcon(new ImageIcon(img12));
        mt13.setMnemonic('E');
        mt13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt12.addActionListener(this);
        mt13.addActionListener(this);
        
        JMenu men11=new JMenu("Utility");
        JMenuItem mt14=new JMenuItem("Notepad");
        JMenuItem mt15=new JMenuItem("Chrome");
        JMenuItem mt16=new JMenuItem("Calculator");
        
        ImageIcon ii14 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img13= ii14.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt14.setIcon(new ImageIcon(img13));
        mt14.setMnemonic('V');
        mt14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        ImageIcon ii15 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img14= ii15.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt15.setIcon(new ImageIcon(img14));
        mt15.setMnemonic('O');
        mt15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        
        ImageIcon ii16 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img16= ii16.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt16.setIcon(new ImageIcon(img16));
        mt16.setMnemonic('V');
        mt16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt14.addActionListener(this);
        mt15.addActionListener(this);
        mt16.addActionListener(this);
        
        JMenu men12=new JMenu("About");
        JMenuItem mt17=new JMenuItem("About Page");
        
        ImageIcon ii17 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img17= ii17.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt17.setIcon(new ImageIcon(img17));
        mt17.setMnemonic('L');
        mt17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt17.addActionListener(this);
        
        JMenu men13=new JMenu("Exit");
        JMenuItem mt18=new JMenuItem("Exit Page");
        men13.setForeground(Color.RED);
        
        ImageIcon ii18 = new ImageIcon(ClassLoader.getSystemResource(imgUrl));
        Image img19= ii18.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        mt18.setIcon(new ImageIcon(img19));
        mt18.setMnemonic('K');
        mt18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        mt18.addActionListener(this);
        
        men1.add(mt1);
        men1.add(mt2);
        men2.add(mt19);
        men3.add(mt3);
        men3.add(mt4);
        men4.add(mt5);
        men4.add(mt6);
        men5.add(mt7);
        men5.add(mt8);
        men9.add(mt10);
        men9.add(mt11);
        men10.add(mt12);
        men10.add(mt13);
        men11.add(mt14);
        men11.add(mt15);
        men11.add(mt16);
        men12.add(mt17);
        men13.add(mt18);
        
        
        mb.add(men1);
        mb.add(men2);
        mb.add(men3);
        mb.add(men4);
        mb.add(men5);
        mb.add(men9);
        mb.add(men10);
        mb.add(men11);
        mb.add(men12);
        mb.add(men13);
        
        setJMenuBar(mb);
        add(l1);
   }
   public void actionPerformed(ActionEvent ev)
   {
       String comnd=ev.getActionCommand();
       if(comnd.equals("New Faculty"))
       {
           new new_faculty().setVisible(true);
       }
       else if(comnd.equals("New Student Addmission"))
       {
           new new_student_admission().setVisible(true);
       }
       else if(comnd.equals("Details"))
       {
           new fee_details().setVisible(true);
       }
       else if(comnd.equals("Student Attendence"))
       {
           new student_attendence().setVisible(true);
       }
       else if(comnd.equals("Teacher Attendence"))
       {
           new teacher_attendence().setVisible(true);
       }
       else if(comnd.equals("Student all details"))
       {
           new student_all_details().setVisible(true);
       }
       else if(comnd.equals("Teacher all details"))
       {
           new teacher_all_student().setVisible(true);
       }
       else if(comnd.equals("Examination Deatils"))
       {
           new examination_details().setVisible(true);
       }
       else if(comnd.equals("Enter Marks"))
       {
           new enter_marks().setVisible(true);
       }
       else if(comnd.equals("Update Student"))
       {
           new update_student().setVisible(true);
       }
       else if(comnd.equals("Update teacher"))
       {
           new update_teacher().setVisible(true);
       }
      
else if(comnd.equals("Student fee form"))
       {
           new student_fee_form().setVisible(true);
       }
       else if(comnd.equals("Notepad"))
       {
           System.out.println("notepad");
       }
       else if(comnd.equals(" Chrome"))
       {
           System.out.println("chrome");
       }
       else if(comnd.equals("Caculator"))
       {
           System.out.println("calculator");
       }
       else if(comnd.equals("About Page"))
       {
          new about_page().setVisible(true); 
       }
        else if(comnd.equals("Exit Page"))
       {
         System.exit(0);
       }
       else
        {
            JOptionPane.showMessageDialog(null,"sorry you press wrong button");
            setVisible(false);
        }
       
   }
   public static void main(String args[])
   {
       new homepage().setVisible(true);
   }
}
