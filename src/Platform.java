import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Platform extends JPanel implements MouseListener {
    int rows =10;
    int cols = 10;
    Random bomb = new Random();
    Tiles[][] tiles = new Tiles[rows][cols];
    int countBomb=0;
    int bombI=0;
    int bombJ=0;
    Boolean triggered = false;

    Platform(){
        bomb.nextInt(0,rows*cols-1);
        setLayout(new GridLayout(rows,cols));
        setSize(400,400);
        for ( int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                tiles[i][j] = new Tiles(i);
                add(tiles[i][j]);
                tiles[i][j].addMouseListener(this);
            }
        }
        createBomb();
    }
    void  createBomb(){
        while (countBomb < 15) {
            {
                bombI = bomb.nextInt(0, rows-1);
                bombJ = bomb.nextInt(0, cols-1);
                if (tiles[bombI][bombJ].isBomb()==false) {
                    tiles[bombI][bombJ].makeBomb();
                    System.out.println("bomb no "+countBomb+" : "+bombI+" "+bombJ);
                    countBomb++;
                }
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clicking");
        for (int i=0;i<rows;i++){
            for (int j = 0; j < cols; j++) {
                if (tiles[i][j] == e.getSource()) {
                   triggered= tiles[i][j].boom();
                   if (triggered==true){
                       blastAll();

                   }
                }
            }
        }
        }
        void blastAll(){
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    tiles[i][j].boom();

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
