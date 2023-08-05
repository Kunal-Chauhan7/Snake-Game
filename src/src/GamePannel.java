import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class GamePannel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNIT = (SCREEN_HEIGHT*SCREEN_WIDTH)/UNIT_SIZE;
    static final int DELAY = 75;

     final int[] x = new int[GAME_UNIT];
     final int[] y = new int[GAME_UNIT];
     int bodyParts = 6;
     int applesEaten;
     int appleX;
     int appleY;
     char direction = 'R';
     boolean running = false;
     Timer timer;
     Random random;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    GamePannel(){

    }
    public void startGame(){

    }
    public void paintComponent(Graphics g){

    }
    public void draw(Graphics g){

    }
    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollision(){

    }
    public void gameOver(Graphics g){

    }
    public class MyKepAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
}
