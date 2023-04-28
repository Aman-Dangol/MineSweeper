import javax.swing.*;
import java.awt.*;

public class Tiles extends JPanel {
    Boolean isBomb=false;
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
    Boolean boom(){
        if (isBomb){
            setBackground(Color.red);
            return true;
        }
        else {
            setBackground(Color.green);
            return false;
        }
    }
    void makeBomb(){
        isBomb=true;
    }
    Boolean isBomb(){
        return isBomb;
    }
}
