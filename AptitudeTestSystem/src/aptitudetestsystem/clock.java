
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aptitudetestsystem;

import static aptitudetestsystem.ExamPanel.timer;
import static aptitudetestsystem.Stud_Result.stop;
import static aptitudetestsystem.ExamPanel.marks;
import static aptitudetestsystem.Topics.cmbsub;
import java.awt.Toolkit;
import java.awt.Window;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Instructor
 */
public class clock extends Thread
{
   public static int count =1;
   public static Window s;
    
    public void abc(Window a)
    {
        s = a;
    }
    public void run()
    {
        
       try
       {
           
          while(true)
          {
              ExamPanel.timer.setText(count+"");
              count++;
              Thread.sleep(1000);
              
              
              if(count==60)
              {
                   WindowEvent w = new WindowEvent(s,WindowEvent.WINDOW_CLOSING);
                   Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
                   int stud=marks;
        int totalmark=15;
        int per=100;
        int res;
        res =per*stud/totalmark;
        String str1 = String.valueOf(res);
        String str = String.valueOf(marks);
        Stud_Result q = new Stud_Result();
        q.setVisible(true);
        q.lbltopic.setText(cmbsub.getSelectedItem().toString());
        q.lblstudmark.setText(str);
        q.lbltime.setText(timer.getText());
        q.stop.setText(timer.getText());
        Stud_Result.percentage.setText(str1);
                   break;
////                   WindowEvent w = new WindowEvent(s,WindowEvent.WINDOW_CLOSING);
////                  Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
////                  Show q = new Show();
////                  q.setVisible(true);
////                  Show.data.setText(count+"");
////                  
////                  break;    
              }
              
              
          }
       }
       catch(Exception e)
       {
           
       }
        
    }
}
