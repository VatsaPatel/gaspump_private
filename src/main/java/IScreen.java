import java.util.HashMap;

public interface IScreen
{
    String getScreenTop();
    String getScreenBottom();
    String getCommandName(String key);
    void key(String keypad) ;             // send key entry to screen

    String display();                    // prints the screen

    void selectMenuItem(String cmd);     //  select the coomand on screen
}
