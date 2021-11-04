public class QuizProject {
    private static ProjectWindow window;
    public static void main(String[] args) {
        window = new ProjectWindow();
    }
    public static void makeGameWindowVisible() {
        window.game.setVisible(true); // makes GamePanel visible
    }
}