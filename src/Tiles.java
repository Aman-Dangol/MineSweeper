import javax.swing.*;
import java.awt.*;

public class Tiles extends JPanel {
    int isBomb=0;
    Tiles(int n){
        setSize(80,80);
        if (n%2==0){
            setBackground(Color.darkGray);
        }
        else {
            setBackground(Color.lightGray);
        }
        setBorder(BorderFactory.createLineBorder(Color.white));
    }
    void boom(){
        if (isBomb==1){
            setBackground(Color.red);
        }
        else {
            setBackground(Color.green);
        }
    }
    void makeBomb(){
        isBomb=1;
    }
    int isBomb(){
        return isBomb;
    }
}
