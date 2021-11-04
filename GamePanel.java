import javax.swing.JPanel;
import javax.swing.plaf.ComponentInputMapUIResource;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;

public class GamePanel extends JPanel {
    private int score = 0;
    private static int currentQuestionNumber = -1;
    private String[] currentQuestion = Questions.chooseQuestion(currentQuestionNumber);
    private static JLabel labelA;
    private static JLabel labelB;
    private static JLabel labelC;
    private static JLabel labelD;
    private static JLabel endLabel;
    private static JLabel labelQuestion;
    private static JLabel labelScore;
    private static JButton continueButton;

    public GamePanel() {
        setSize(800, 600);
        setLocation(0, 0);
        setLayout(null);
        setBackground(new Color(48, 47, 47));

        // Buttom and label on panel

        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");
        JButton buttonD = new JButton("D");

        labelQuestion = new JLabel(currentQuestion[0]);
        labelA = new JLabel(currentQuestion[1]);
        labelB = new JLabel(currentQuestion[2]);
        labelC = new JLabel(currentQuestion[3]);
        labelD = new JLabel(currentQuestion[4]);
        labelScore = new JLabel("Score: " + score);
        
        continueButton = new JButton("Continue");
        continueButton.setBounds(590, 460, 200, 120);
        continueButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
        continueButton.setBackground(new Color(48, 47, 47));
        continueButton.setForeground(new Color(255, 255, 255));
        continueButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 5));
        continueButton.setFocusPainted(false);
        continueButton.setVisible(false);

        endLabel = new JLabel("");
        endLabel.setBounds(10, 380, 200, 25);
        endLabel.setSize(500, 75);
        endLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        endLabel.setForeground(new Color(255, 255, 255));
        endLabel.setVisible(false);
        
        buttonA.setBounds(10, 95,  100, 60);
        buttonB.setBounds(10, 165, 100, 60);
        buttonC.setBounds(10, 235, 100, 60);
        buttonD.setBounds(10, 305, 100, 60);

        buttonA.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        buttonA.setBackground(new Color(48, 47, 47));
        buttonA.setForeground(new Color(255, 255, 255));
        buttonA.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        buttonA.setFocusPainted(false);
        
        buttonB.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        buttonB.setBackground(new Color(48, 47, 47));
        buttonB.setForeground(new Color(255, 255, 255));
        buttonB.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        buttonB.setFocusPainted(false);
        
        buttonC.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        buttonC.setBackground(new Color(48, 47, 47));
        buttonC.setForeground(new Color(255, 255, 255));
        buttonC.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        buttonC.setFocusPainted(false);
        
        buttonD.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        buttonD.setBackground(new Color(48, 47, 47));
        buttonD.setForeground(new Color(255, 255, 255));
        buttonD.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        buttonD.setFocusPainted(false);
        
        labelA.setBounds(120, 110, 660, 35);
        labelB.setBounds(120, 180, 660, 35);
        labelC.setBounds(120, 250, 660, 35);
        labelD.setBounds(120, 320, 660, 35);
        labelQuestion.setBounds(10, 15, 790, 40);
        labelScore.setBounds(10, 510, 600, 40);
        
        labelA.setForeground(new Color(255, 255, 255));
        labelA.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        
        labelB.setForeground(new Color(255, 255, 255));
        labelB.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        
        labelC.setForeground(new Color(255, 255, 255));
        labelC.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        
        labelD.setForeground(new Color(255, 255, 255));
        labelD.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        
        labelQuestion.setForeground(new Color(255, 255, 255));
        labelQuestion.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        
        labelScore.setForeground(new Color(255, 255, 255));
        labelScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        
        // JLabel label = new JLabel("Enter your debit card information");
        // label.setBounds(10, 15, 30, 25);
        // label.setSize(250, 20);
        // label.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        // label.setForeground(new Color(255, 255, 255));
        add(buttonA);
        add(buttonB);
        add(buttonC);
        add(buttonD);
        add(labelA);
        add(labelB);
        add(labelC);
        add(labelD);
        add(labelQuestion);
        add(labelScore);
        add(continueButton);
        add(endLabel);
        // add(label);

        setVisible(false);
        buttonA.addActionListener(e -> {
            matchEnd(currentQuestion[5] == labelA.getText(), "A");
        });
        buttonB.addActionListener(e -> {
            matchEnd(currentQuestion[5] == labelB.getText(), "B");
        });
        buttonC.addActionListener(e -> {
            matchEnd(currentQuestion[5] == labelC.getText(), "C");
        });
        buttonD.addActionListener(e -> {
            matchEnd(currentQuestion[5] == labelD.getText(), "D");
        });
        continueButton.addActionListener(e -> {
            endLabel.setVisible(false);
            continueButton.setVisible(false);
            newMatch();
        });
    }
    public static void setQuestionNumber(int input) {
        currentQuestionNumber = input;
    }
    private void matchEnd(boolean win, String correctLetter) {
        if (win) {
            score += 10;

        }
        else {
            score -= 10;
        }
        endLabel.setText(win ? "Correct!" : "Incorrect! The correct answer was " + Questions.getCorrectAnswerChoice(currentQuestion));
        continueButton.setVisible(true);
        endLabel.setVisible(true);
        labelScore.setText("Score: " + score);
    }
    private void newMatch() {
        currentQuestion = Questions.chooseQuestion(currentQuestionNumber);
        labelQuestion.setText(currentQuestion[0]);
        labelA.setText(currentQuestion[1]);
        labelB.setText(currentQuestion[2]);
        labelC.setText(currentQuestion[3]);
        labelD.setText(currentQuestion[4]);
    }
}
