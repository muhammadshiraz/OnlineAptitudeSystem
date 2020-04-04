package aptitudetestsystem;

import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.util.Properties;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AptitudeTestSystem {

    public static void main(String[] args)throws Exception {
        try {
            // select Look and Feel
        Properties props = new Properties();
        props.put("logoString", "");
//  AluminiumLookAndFeel
        TextureLookAndFeel.setCurrentTheme(props);
        UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
           
            
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
                
        Splash s=new Splash();
        s.setVisible(true);
        Thread t=Thread.currentThread();
        t.sleep(10000);
        s.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new Login().setVisible(true);
            }
        });
    }
}

