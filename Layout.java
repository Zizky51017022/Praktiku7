/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;

/**
 *
 * @author ASUS
 */

public class Layout extends JFrame {
    JButton zButton = new JButton ("North");
    JButton iButton = new JButton ("South");
    JButton sButton = new JButton ("East");
    JButton kButton = new JButton ("West");
    JButton yButton = new JButton ("Center");
   
 public Layout () {
     super("Border Layout Beraksi");
     setSize(240, 280);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new BorderLayout ());
     add(zButton, BorderLayout.NORTH);
     add(iButton, BorderLayout.SOUTH);
     add(sButton, BorderLayout.EAST);
     add(kButton, BorderLayout.WEST);
     add(yButton, BorderLayout.CENTER);}
     
  public static void main (String[] args) {
      Layout frame = new Layout ();
      frame.setVisible(true);
  } 
}
