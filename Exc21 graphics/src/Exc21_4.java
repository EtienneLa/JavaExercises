import java.awt.*;
import java.awt.geom.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.util.Timer;

public class Exc21_4 extends Canvas
{
    private Point delta;
    private Ellipse2D.Double ball;
    private Rectangle paddle1, paddle2;

    public static void main( String[] args )
    {
        JFrame win = new JFrame("Pong");
        win.setSize(1010,735);
        win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        win.add( new Exc21_4() );
        win.setVisible(true);
    }

    public Exc21_4()
    {
        enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
        requestFocus();

        ball = new Ellipse2D.Double(500,350,20,20);
        delta = new Point(-5,5);
        paddle1 = new Rectangle(50,250,20,200);
        paddle2 = new Rectangle( 940, 250, 20, 200);

        repaint();

        Timer t = new Timer(true);
        t.schedule( new java.util.TimerTask()
        {
            public void run()
            {
                doStuff();
                repaint();
            }
        }, 12, 12);

    }

    public void paint( Graphics g )
    {
        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.black);
        g2.fill(ball);

        g2.setColor(Color.blue);
        g2.fill(paddle1);

        g2.setColor(Color.red);
        g2.fill(paddle2);
    }

    public void processKeyEvent(KeyEvent e)
    {
        if ( e.getID() == KeyEvent.KEY_PRESSED )
        {
            if ( e.getKeyCode() == KeyEvent.VK_W )
            {
                paddle1.y -= 15;
            }
            if ( e.getKeyCode() == KeyEvent.VK_S )
            {
                paddle1.y += 15;
            }
            if ( e.getKeyCode() == KeyEvent.VK_UP)
                paddle2.y -= 15;

            if ( e.getKeyCode() == KeyEvent.VK_DOWN)
                paddle2.y += 15;
        }
    }

    public void doStuff()
    {
        ball.x += delta.x;
        ball.y += delta.y;

        if ( ball.y < 0 || ball.y+20 > 700 )
            delta.y = -delta.y;


        if ( ball.intersects(paddle1) )
            delta.x = -delta.x;
        if ( ball.intersects(paddle2) )
            delta.x = -delta.x;

        // check for scoring
        if ( ball.x > 1000 )
        {
            ball.x = 500;
            ball.y = 350;
            delta = new Point(-5,5);
        }
        if ( ball.x < 10 ) {

            ball.x = 500;
            ball.y = 350;
            delta = new Point( -5, 5);
        }



    }

    public boolean isFocusable() { return true;	}
}