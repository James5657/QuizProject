import javax.swing.JFrame;
// import javax.swing.ImageIcon;
public class ProjectWindow extends JFrame {
    // create a constructor with no parameters
    // ImageIcon image = new ImageIcon("U:\\AP Comp Sci A\\QuizProject\\quizleticon.png");
    
    public HomePanel home = new HomePanel();
    public GamePanel game = new GamePanel();
    
    public ProjectWindow() {
        setSize(800, 600);
        setTitle("Quiz Project - Harrison");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        // setIconImage(image.getImage());

        // create an object home of HomePanel class


        add(home);
        add(game);
        setVisible(true);
    }
}