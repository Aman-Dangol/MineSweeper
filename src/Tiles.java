import javax.swing.*;
import java.awt.*;

public class Tiles extends JPanel {
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
}
