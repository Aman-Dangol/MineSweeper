import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.*;

public class GameOver extends JFrame implements ActionListener {
    JButton yes = new JButton("Yes");
    JButton no = new JButton("no");
    JPanel center = new JPanel();
    JPanel south = new JPanel();
    JLabel message = new JLabel("would you like to restart again ?");
    Window window;
    GameOver(Window x){
        window=x;
        setSize(600,100);
        add(center,BorderLayout.CENTER);
        setResizable(false);
        center.add(message);
        add(south,BorderLayout.SOUTH);
        yes.setFocusable(false);
        yes.addActionListener(this);
        south.add(yes);
        no.setFocusable(false);
        no.addActionListener(this);
        south.add(no);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==yes){
            System.out.println("from yes button");
            dispose();

        }
        if (e.getSource()==no){
            System.out.println("from no button");
            window.dispose();
            dispose();
            Menu menu = new Menu();

        }
    }
}
