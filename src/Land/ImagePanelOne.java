package Land;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ImagePanelOne extends JPanel{
    
    private BufferedImage img;
    
    public ImagePanelOne(){
    
        try {
            img= ImageIO.read(getClass().getResource("/Images/backgrndn1.png").toURI().toURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        } 
    
    @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 16, 16, null);
    }
    
}
