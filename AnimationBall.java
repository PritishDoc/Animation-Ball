import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnimationBall extends Frame implements Runnable {
    private int x, y, translation_x, translation_y;

    AnimationBall() {
        super("Animation");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing...");
                System.exit(0);
            }
        });

        x = 100;
        y = 100;
        translation_x = translation_y = 1;
        Thread thread = new Thread(this);
        thread.start();

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);
    }

    public void run() {
        while (true) {
            x += translation_x;
            y += translation_y;

            if (x < 0 || x > 450)
                translation_x = translation_x * -1;
            if (y < 20 || y > 350)
                translation_y = translation_y * -1;
            repaint();

            try {
                Thread.sleep(5);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        AnimationBall animationBall = new AnimationBall();
        Image logoImage = Toolkit.getDefaultToolkit().getImage("C://Users//priti//Desktop//Images//gamecube-3.jpg");
        // Resize the logo image
       // int logoWidth = 200; // Desired width
       // int logoHeight = 200; // Desired height
       // Image resizedLogoImage = logoImage.getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
       animationBall.setIconImage(logoImage);
      //  Color frameColor = Color.BLUE;
       // animationBall.setBackground(frameColor);
        animationBall.setBackground(Color.GREEN);
        animationBall.setSize(500, 400);
        animationBall.setVisible(true);
    }
}

