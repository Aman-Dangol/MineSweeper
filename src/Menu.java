import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class Menu extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JPanel playPanel = new JPanel();
    JPanel exitPanel = new JPanel();
    JButton play = new JButton("play");
    JButton exit = new JButton("exit");
    Menu(){
        setTitle("Mine Sweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        playPanel.setMaximumSize(new Dimension(100,40));
        exitPanel.setMaximumSize(new Dimension(100,40));
        play.addActionListener(this);
        exit.addActionListener(this);
        setSize(300,300);
        setLocationRelativeTo(null);
        playPanel.add(play);
        exitPanel.add(exit);
        add(panel);
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
}
