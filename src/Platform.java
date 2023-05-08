import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Platform extends JPanel implements MouseListener {
    int rows =10000;
    int cols = 10000;
    int count = 0;
    int winBox;

    Random bomb = new Random();
    Tiles[][] tiles = new Tiles[rows][cols];
    int countBomb=0;
    int bombCount=10;
    int bombI=0;
    int bombJ=0;
    Boolean triggered = false;

    Platform(int r, int c , int b){
        rows = r;
        cols = c;
        bombCount = b;
        winBox = rows * cols - bombCount;
        System.out.println("winbox= "+winBox);
        setVisible(true);
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
    void checkWin(){
        if (count==winBox){
            System.out.println("win!!");
        }
    }
    void  createBomb(){
        while (countBomb < bombCount)
        {
            {
                bombI = bomb.nextInt(0, rows);
                bombJ = bomb.nextInt(0, cols);
                if (tiles[bombI][bombJ].isBomb()==false) {
                    tiles[bombI][bombJ].makeBomb();
//                    System.out.println(bombI+" "+bombJ);
                    countBomb++;
                }
            }
        }
        for (int i =0;i<rows;i++){
            for (int j = 0; j < cols; j++) {
                if (tiles[i][j].isBomb()==false){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i=0;i<rows;i++){
            for (int j = 0; j < cols; j++) {
                if (tiles[i][j] == e.getSource()) {
                   triggered= tiles[i][j].boom();
                   if (triggered==true){
                       blastAll();
                   }
                   else {
                       count++;
                   }
                }
            }
        }
        checkWin();
        }
        void blastAll(){
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    tiles[i][j].boom();

                }

            }
            System.out.println("You lose !!");
            Window frame = (Window) SwingUtilities.getWindowAncestor(Platform.this);

            GameOver gg = new GameOver(frame);
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
    void closeGame(){
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Platform.this);
    }
}
