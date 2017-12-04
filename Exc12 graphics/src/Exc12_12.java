import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class Exc12_12 extends Canvas {

    public void drawTree( Graphics g, int x, int y ) {

        Color brown = new Color(139, 69, 19);
        g.setColor(brown);
        g.fillRect(x + 17, y + 50, 16, 50);
        g.setColor(Color.green);
        Polygon triangle = new Polygon();
        triangle.addPoint( x, y + 75);
        triangle.addPoint( x + 50, y + 75);
        triangle.addPoint( x + 25, y);
        g.fillPolygon(triangle);

    }

    public void paint( Graphics g ){

        Random rng = new Random();

        for( int i = 0; i < 300; i++){
            int x = rng.nextInt( 950 );
            int y = rng.nextInt( 615 );
            drawTree( g, x, y);
        }

    }

    public static void main( String[] args ){

        JFrame win = new JFrame( "The Forest" );
        Canvas canvas = new Exc12_12();
        win.add( canvas );
        win.setSize( 1024, 768 );
        win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        win.setVisible( true );

    }
}