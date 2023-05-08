import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.jar.JarFile;

public class Menu extends JFrame implements ActionListener, MouseListener {
    JPanel panel = new JPanel();
    JPanel playPanel = new JPanel();
    JPanel exitPanel = new JPanel();
    JPanel header = new JPanel();
    JButton play = new JButton("play");
    JButton exit = new JButton("exit");
    JLabel title = new JLabel("MINE SWEEPER");
    Menu(){
        setTitle("Mine Sweeper");
        header.add(title);
        header.setMaximumSize(new Dimension(300,80));
        title.setFont(new Font("Times New Roman",Font.BOLD,30));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        playPanel.setMaximumSize(new Dimension(100,40));
        exitPanel.setMaximumSize(new Dimension(100,40));
        play.addActionListener(this);
        exit.addActionListener(this);
        exit.addMouseListener(this);
        setSize(300,300);
        setLocationRelativeTo(null);
        playPanel.add(play);
        play.addMouseListener(this);
        exitPanel.add(exit);
        add(panel);
        panel.add(header,BorderLayout.CENTER);
        panel.add(playPanel);
        panel.add(exitPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource()==play){
                Generator generator = new Generator();
                panel.add(generator);
                panel.remove(playPanel);
                panel.remove(exitPanel);
                setVisible(true);
            }
            else if (e.getSource()==exit){
                    dispose();
            }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("jojo");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==play){
            play.setBackground(Color.green);
        } else if (e.getSource()==exit) {
            exit.setBackground(Color.red);
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
                play.setBackground(UIManager.getColor("Button.background"));
                exit.setBackground(UIManager.getColor("Button.background"));
    }
}
