import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

class Exc12_9 extends Canvas
{
    public void paint( Graphics window )
    {
        Random rng = new Random();

        for(int i=0;i<10;i++) {

            int r=rng.nextInt(256),g=rng.nextInt(256),b=rng.nextInt(256);
            int x=rng.nextInt(801),y=rng.nextInt(601);

            drawBox(window, new Color(r, g, b), x, y);
        }
    }

    public void drawBox( Graphics window, Color c, int x, int y )
    {

        //this code draws a 100x100 box in color c at (x,y)
        window.setColor(c);
        window.fillRect(x,y,100,100);
        window.setColor(Color.WHITE);
        window.fillRect(x+10,y+10,80,80);
    }


    public static void main( String[] args )
    {
        Canvas canvas = new Exc12_9();
        JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}