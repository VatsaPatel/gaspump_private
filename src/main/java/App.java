/**
 *  Main App Class for managing screen.
 */
public class App {

    private ScreenController screenController;

    public App() {
        screenController = new ScreenController();
    }

    public String display() {
        return screenController.display();
    }

    public void key(String keypad) {
        screenController.key(keypad);
    }

    public void cmd(String cmd) {
        ScreenController.selectMenuItem(cmd);
    }
}

