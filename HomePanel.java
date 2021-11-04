import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;

public class HomePanel extends JPanel {
    // create a constructor with no parameters
    
    public HomePanel() {
        setSize(800, 600);
        setLocation(0, 0);
        setLayout(null);
        setBackground(new Color(48, 47, 47));

        // Buttom and label on panel

        JButton button = new JButton("Play");
        button.setBounds(275, 175, 200, 120);
        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 75));
        button.setBackground(new Color(48, 47, 47));
        button.setForeground(new Color(255, 255, 255));
        button.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 5));
        button.setFocusPainted(false);
        JLabel label = new JLabel("Quiz Game");
        label.setBounds(250, 15, 200, 25);
        label.setSize(350, 75);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        label.setForeground(new Color(255, 255, 255));
        add(button);
        add(label);

        button.addActionListener(e -> {
            setVisible(false);
            QuizProject.makeGameWindowVisible(); // used to prevent GamePanel buttons from glitching onto the HomePanel
        });

    }
}