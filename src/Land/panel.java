package land;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lakmal Kandamby
 */
public class panel extends JPanel {
    private BufferedImage img;
    public panel(){
        try {
         img=ImageIO.read(getClass().getResource("backgrndn1.png").toURI().toURL());   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    g.drawImage(img, 0, 0, null);
    
    }
    
    
    
}
