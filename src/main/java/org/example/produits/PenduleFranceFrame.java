package org.example.produits;

import org.example.obs_pattern.Observer;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PenduleFranceFrame extends JFrame implements Observer {
    private String nom = this.getClass().getSimpleName();
    private JLabel label;
    public PenduleFranceFrame() {
        setSize(200, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        label = new JLabel("heure");
        Font f = new Font("Arial", Font.BOLD, 20);
        label.setForeground(Color.red);
        label.setFont(f);
        panel.add(label);
        add(panel);
        setSize(200,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void update(String heure) {
        String strPattern = "\\d{2}:\\d{2}:\\d{2}";

        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(heure);
        if(matcher.find()) {
            label.setText(matcher.group());
        }
    }
}
