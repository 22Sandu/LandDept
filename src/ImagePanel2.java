
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ImagePanel2 extends JPanel{
   
    private BufferedImage img;
    
    public ImagePanel2(){
    
        try {
            img= ImageIO.read(getClass().getResource("/Images/home4.png").toURI().toURL());
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
