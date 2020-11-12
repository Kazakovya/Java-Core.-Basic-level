package ru.geekbrains;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    protected boolean isAlive = true;

    public App(final int SIZE) {
        setTitle("Bombs and Deaths");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(350, 350, 450, 450);

        boolean[][] bombs = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bombs[i][j] = Math.random() <= 0.25;
            }
        }

        JButton[][] buttons = new JButton[SIZE][SIZE];

        setLayout(new GridLayout(SIZE, SIZE));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton button = new JButton();
                buttons[i][j] = button;
                button.setText("???");
                int ii = i;
                int jj = j;
                button.addActionListener(actionEvent -> {
                    if (!isAlive) return;
                    if (bombs[ii][jj]) {
                        for (int k = 0; k < SIZE; k++) {
                            for (int l = 0; l < SIZE; l++) {
                                if (bombs[k][l]) {
                                    buttons[k][l].setText("\u2620");
                                    buttons[k][l].setFont(button.getFont().deriveFont(50.F));
                                    buttons[k][l].setBackground(Color.yellow);
                                    buttons[k][l].setForeground(Color.RED);
                                }
                            }
                        }
                        button.setText("\u2620");
                        button.setFont(button.getFont().deriveFont(50.F));
                        button.setBackground(Color.RED);
                        button.setForeground(Color.WHITE);
                        isAlive = false;
                    } else {
                        int count = 0;
                        for (int k = ii - 1; k < ii + 2; k++) {
                            for (int l = jj - 1; l < jj + 2; l++) {
                                if (k >= 0 && k < SIZE && l >= 0 && l < SIZE && bombs[k][l]) count++;
                            }
                        }
                        button.setText(Integer.toString(count));
                        button.setFont(button.getFont().deriveFont(20.F));
                        button.setBackground(Color.GREEN);
                    }
                });
                add(button);
            }
        }

        setVisible(true);
    }
}
