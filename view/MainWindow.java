package view;

import javax.swing.JFrame;

/**
 * @author Juan David Angarita
 * @email juandaangarita@gmail.com
 */

public class MainWindow extends JFrame{
    
    public MainWindow(){
        initComponents();
    }
    
     private void initComponents(){
        setTitle("Aviones");
        
        ResultsPanel resultsPanel = new ResultsPanel();
        setContentPane(resultsPanel);
        add(new ControlsPanel(resultsPanel));
        
        setSize(1100, 500);
        
        /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize  = getSize();
        setLocation((screenSize.width  - frameSize.width)  / 2, 
                    (screenSize.height - frameSize.height) / 2);*/
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
