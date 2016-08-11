
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanelOne extends JPanel{

    private BufferedImage i1;

    public ImagePanelOne() {
        try {
            i1 = ImageIO.read(getClass().getResource("/Images/backgrndn1.png").toURI().toURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(i1, 20, 15, null);
    }
   
}
