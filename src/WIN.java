import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WIN extends JFrame implements ActionListener {
    JPanel win= new JPanel();
    JLabel message = new JLabel("You win!!!! Congrats!!!");
    JPanel b = new JPanel();
     JButton button = new JButton("OK");
     Window window ;
    WIN(Window x){
        window=x;
        setSize(160,100);
        add(win, BorderLayout.CENTER);
        win.add(message);
        add(b,BorderLayout.SOUTH);
        b.add(button);
        setVisible(true);
        button.addActionListener(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.dispose();
        dispose();
        Menu menu = new Menu();

    }
}
