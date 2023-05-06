import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame {
Platform platform = new Platform();
JPanel east = new JPanel();
JPanel west = new JPanel();
JPanel south = new JPanel();
JPanel north = new JPanel();
JLabel title = new JLabel("Mine sweeper");
    Window(){
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
