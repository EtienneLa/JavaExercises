import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;

public class Exc12_8 extends Canvas  {

    public void paint (Graphics g){

        Random rng = new Random();
        int x1 = 512, x2 = 146, x3 = 876, y1 = 109, y2 = 654, y3 = 654, x = 512, y = 382;
        int dx,dy;

        for(int i = 0; i < 100000; i++){

            g.drawLine(x,y,x,y);

            int r = 1+rng.nextInt(3);

            if(r==1){
                dx = x-x1;
                dy = y-y1;
                x = x - dx/2;
                y = y - dy/2;
            }
            if(r==2){
                dx = x-x2;
                dy = y-y2;
                x = x - dx/2;
                y = y - dy/2;
            }
            if(r==3){
                dx = x-x3;
                dy = y-y3;
                x = x - dx/2;
                y = y - dy/2;
            }

        }
        g.drawString("SIERPINSKI TRIANGLE!",462,484);
    }

    public static void main(String[]args){

        JFrame win = new JFrame();
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Exc12_8 canvas = new Exc12_8();
        win.add(canvas);
        win.setVisible(true);
    }
}
