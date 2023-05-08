import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Generator extends JPanel implements ActionListener {
    JLabel r= new JLabel("row size");
    JLabel c = new JLabel("column size");
    JLabel b = new JLabel("no of bombs");
    JTextField bombNum = new JTextField();
    JTextField rowNum = new JTextField();
    JTextField colNum= new JTextField();
    JPanel panel = new JPanel();
    JPanel bomb = new JPanel();
    JPanel row = new JPanel();
    JPanel col = new JPanel();
    JPanel bu = new JPanel();
    int rows=0,cols=0,bombs=0;
    JButton generate = new JButton("generate ");
    Generator(){
        bomb.setMaximumSize(new Dimension(200,30));
        row.setMaximumSize(new Dimension(200,30));
        col.setMaximumSize(new Dimension(200,30));
        bu.setMaximumSize(new Dimension(200,30));
        setSize(300,300);
        rowNum.setPreferredSize(new Dimension(100, 20));
        row.add(r);
        row.add(rowNum);
        panel.add(row);
        add(panel, BorderLayout.CENTER);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        colNum.setPreferredSize(new Dimension(100,20));
        col.add(c);
        col.add(colNum);
        panel.add(col);
        bombNum.setPreferredSize(new Dimension(100,20));
        bomb.add(b);
        bomb.add(bombNum);
        panel.add(bomb);
        generate.addActionListener(this);
        generate.setPreferredSize(new Dimension(95,20));
        bu.add(generate);
        panel.add(bu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int validTiles=0;
        try {
                rows = Integer.parseInt(rowNum.getText());
                cols = Integer.parseInt(colNum.getText());
                bombs = Integer.parseInt(bombNum.getText());

             }catch (Exception x){
                System.out.println("error");
            }
        validTiles = rows * cols-1;
        if (rows==0||  cols == 0) {
            JOptionPane.showMessageDialog(this,"please insert a numerical value in row and col");

        }
         else  if (bombs==0 || bombs >= rows * cols){
                JOptionPane.showMessageDialog(this,"please make sure the value of bombs is between 1 and "+validTiles);
            }
             else {
                Window window = new Window(rows,cols,bombs);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Generator.this);
                frame.dispose();

            }


    }
}
