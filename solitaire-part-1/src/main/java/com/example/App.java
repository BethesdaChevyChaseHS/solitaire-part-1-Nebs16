package com.example;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) { 
      //add your code here!
      //Create the main frame
      JFrame frame = new JFrame(" ");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      frame.setSize(1000, 800);

      //Creating the top panel (NORTH)
      JPanel topPanel = new JPanel();
      JLabel titleLabel = new JLabel("Nebiyou's Solitare");
      topPanel.add(titleLabel);
      frame.add(topPanel, BorderLayout.NORTH);

      //Left Panel (WEST)
      JPanel leftPanel = new JPanel();
      JLabel pileLabel = new JLabel("Pile");
      leftPanel.add(pileLabel);
      frame.add(leftPanel, BorderLayout.WEST);

      // Main Play Area (CENTER)
        JPanel playArea = new JPanel(new GridLayout(1, 7, 4, 5)); // 1 row, 7 columns
        for (int i = 1; i <= 7; i++) {
            JPanel stackPanel = new JPanel();
            stackPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add a border to each stack
            stackPanel.add(new JLabel("Stack " + i));
            playArea.add(stackPanel);
        }
        frame.add(playArea, BorderLayout.CENTER);

        // Bottom Panel (SOUTH)
        JPanel bottomPanel = new JPanel();
        JLabel infoLabel = new JLabel("Welcome to Nebiyou's Solitatre. Here you will play Solitare and have lots of fun. Look up directions on google, if you don't know how to play.");
        bottomPanel.add(infoLabel);
        frame.add(bottomPanel, BorderLayout.SOUTH);

      
      frame.setVisible(true);

      
    }
}