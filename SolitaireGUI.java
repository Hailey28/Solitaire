/*
 * @author Jonathan and Whitney
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.util.ArrayList;

public class SolitaireGUI extends JFrame
{
    //Enums
    private static enum MenuString
    {
        File,
        Help
    }

    //Constants
    private static final int NUM_MENUS = MenuString.values().length; 

    public SolitaireGUI()
    {
        JPanel panel = new JPanel();
        {
            Dimension screenSize    = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension preferredSize = new Dimension((int)(screenSize.width * 0.75), (int)(screenSize.height * 0.75));
            
            JMenuBar menuBar;
            ArrayList<JMenu> menus;

            menuBar = new JMenuBar();
            {
                menus = new ArrayList<JMenu>();

                for(MenuString ms : MenuString.values())
                    menus.add(new JMenu(ms.name()));

                for(JMenu menu : menus)
                    menuBar.add(menu);

                panel.add(menuBar);
            }

            BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
            {
                panel.setLayout(layout);
            }

            
            setContentPane(panel);            
            setPreferredSize(preferredSize);
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}