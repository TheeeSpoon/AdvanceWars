
package de.dhbw.advancewars.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import de.dhbw.advancewars.AdvanceWars;

import java.awt.event.*;
import java.util.ArrayList;



public class GUI2 {
    private static final int ANIMATION_DELAY = 10;
    
    MouseAdapter mAdapter = new MouseAdapter(){
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
    };

    public void createAndShowGUI() {

        JFrame frame = new JFrame("Advance Wars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 580);

        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int panelWidth = getWidth();
                int panelHeight = getHeight();

                g.setColor(Color.decode("#7aad55"));
                g.fillRect(0, 0, panelWidth, panelHeight);
                
            }
        };
        frame.add(drawingPanel);

        /*Timer timer = new Timer(ANIMATION_DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.repaint();
            }
        });
        timer.start();*/

        frame.setVisible(true);
    }

    ActionListener insertAction =  new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            insertionFrame();
        }
    };

    public void insertionFrame(){

        JFrame insCar = new JFrame();
        insCar.setSize(200, 350);
    }

    public GUI2(AdvanceWars aw){
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}