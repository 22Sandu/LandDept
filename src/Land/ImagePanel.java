package Land;



import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ImagePanel extends JPanel{
    
    private BufferedImage img;
    
    public ImagePanel(){
    
        try {
            img= ImageIO.read(getClass().getResource("/Images/homen.png").toURI().toURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        }
 
    @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            g.drawImage(img, 400, 200, null);
        
        }  
}        
    
