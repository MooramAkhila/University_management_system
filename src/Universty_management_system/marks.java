
package Universty_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class marks extends JFrame
{
    JPanel p1;
    JTextArea t1;
    marks()
    {
        
    }
    marks(String sm)
    {
        setSize(300,400);
        setLocation(100,100);
        setLayout(new BorderLayout());
        
        p1=new JPanel();
        t1=new JTextArea();
        JScrollPane jsp=new JScrollPane(t1);
        t1.setFont(new Font("senseif",Font.ITALIC,15));
        
        add(p1,"North");
        add(jsp,"Center");
        mark(sm);
        
        
    }
    public void mark(String sa)
    {
        try
        {
            connection obj=new connection();
            t1.setText("\tResult of Examination\n");
            
            ResultSet rest=obj.stm.executeQuery("select * from student_subject where rollno='"+sa+"'");
            
            if(rest.next())
            {
                t1.append("\n\t"+rest.getString("subject1"));
                t1.append("\n\t"+rest.getString("subject2"));
                t1.append("\n\t"+rest.getString("subject3"));
                t1.append("\n\t"+rest.getString("subject4"));
                t1.append("\n\t"+rest.getString("subject5"));
                t1.append("\n------------------------------");
                t1.append("\n");
            }
            ResultSet rest2=obj.stm.executeQuery("select * from student_marks where rollno='"+sa+"'");
            
            if(rest2.next())
            {
                int marks1=Integer.parseInt(rest2.getString("marks1"));
                int marks2=Integer.parseInt(rest2.getString("marks2"));
                int marks3=Integer.parseInt(rest2.getString("marks3"));
                int marks4=Integer.parseInt(rest2.getString("marks4"));
                int marks5=Integer.parseInt(rest2.getString("marks5"));
                int total=marks1+marks2+marks3+marks4+marks5;
                
                t1.append("\n\t"+rest2.getString("marks1"));
                t1.append("\n\t"+rest2.getString("marks2"));
                t1.append("\n\t"+rest2.getString("marks3"));
                t1.append("\n\t"+rest2.getString("marks4"));
                t1.append("\n\t"+rest2.getString("marks5"));
                t1.append("\n------------------------------");
                
                t1.append("\nTotal Marks:             ");
                t1.append(total+"/500");
                
            }
        }
        catch(Exception ex)
        {
                
               ex.printStackTrace();
                
         }  
                
   }
        public static void main(String args[])
        {
            new marks().setVisible(true);
        }
    }

