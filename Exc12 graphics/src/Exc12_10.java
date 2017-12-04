import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

class Exc12_10 extends Canvas{

    public void paint(Graphics v){

        Random rng = new Random();

        for(int i = 0; i < 10; i++){

            int r = rng.nextInt(256),g = rng.nextInt(256),b = rng.nextInt(256);
            int x = 20+rng.nextInt(600), y = 20+rng.nextInt(450);
            int h = 40+rng.nextInt(200), w = 40+rng.nextInt(200);

            Color color = new Color(r,g,b);

            Viereck(v, color, x, y, w, h);
        }
    }

    public void Viereck(Graphics v, Color b, int x, int y, int h, int w){

        v.setColor(b);
        v.fillRect(x,y,w,h);
        v.setColor(Color.WHITE);
        v.fillRect(x+10,y+10,w-20,h-20);
    }
    public static void main(String[]args){

        Canvas canvas = new Exc12_10();
        JFrame win = new JFrame("random boxes");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add(canvas);
        win.setVisible(true);

    }
}
