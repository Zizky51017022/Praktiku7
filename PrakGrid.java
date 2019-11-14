/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridlayout;

/**
 *
 * @author ASUS
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class PrakGrid extends JFrame {
    JButton marcia = new JButton ("MARCIA");
    JButton carol = new JButton ("CAROL");
    JButton greg = new JButton ("GREG");
    JButton jan = new JButton ("JAN");
    JButton alice = new JButton ("ALICE");
    JButton peter = new JButton ("PETER");
    JButton cindy = new JButton ("CINDY");
    JButton mike = new JButton ("MIKE");
    JButton bobby = new JButton ("BOBBY");
    
public PrakGrid() {
    super ("GRID LAYOUT BERAKSI");
    setSize (260, 260);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
     GridLayout family = new GridLayout (3, 3, 10, 10);
     pane.setLayout(family);
     pane.add(marcia);pane.add(carol);
     pane.add(greg);pane.add(jan);
     pane.add(alice);pane.add(peter);
     pane.add(cindy);pane.add(mike);
     pane.add(bobby);
     add(pane);
     setVisible(true);
}    
    public static void main (String[] args) {
        PrakGrid frame = new PrakGrid();
    }
}
