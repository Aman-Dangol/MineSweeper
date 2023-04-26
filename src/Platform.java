import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Platform extends JPanel implements MouseListener {
    Random bomb = new Random();
    Tiles[][] tiles = new Tiles[8][8];
    int i=0;
    Platform(){
        bomb.nextInt(0,63);
        setLayout(new GridLayout(8,8));
        setSize(400,400);
        for ( i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                tiles[i][j] = new Tiles(i);
                add(tiles[i][j]);
                tiles[i][j].addMouseListener(this);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (i=0;i<8;i++){
            for (int j = 0; j < 8; j++) {
                if (tiles[i][j] == e.getSource()) {
                    tiles[i][j].setBackground(Color.green);
                }
            }
        }
        }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
