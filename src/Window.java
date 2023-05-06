import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    int r =0;
   int c=0;
    int b=0;
Platform platform;
JPanel east = new JPanel();
JPanel west = new JPanel();
JPanel south = new JPanel();
JPanel north = new JPanel();
JLabel title = new JLabel("Mine sweeper");
    Window(int row , int col , int bomb){
        r = row;
        c= col;
        b= bomb;
        platform = new Platform(r,c,b);
        setTitle("Mine Sweeper");
        setSize(600,600);
        setLocationRelativeTo(null);
        setResizable(false);
        east.setPreferredSize(new Dimension(50,100));
        west.setPreferredSize(new Dimension(50,100));
        south.setPreferredSize(new Dimension(100,50));
        north.setPreferredSize(new Dimension(100,50));
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(south,BorderLayout.SOUTH);
        add(north,BorderLayout.NORTH);
        north.add(title);
        title.setFont(new Font("Arial",Font.BOLD,35));
        add(platform,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
