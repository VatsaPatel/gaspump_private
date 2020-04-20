import java.util.HashMap;

/**
 * Screen Helper class.
 * Provides helper function to each screens as per spec. New screens can override the methods.
 * All screens extend this class.
 */
public class ScreenHelper {

    private HashMap<String, MenuItem> command = new HashMap<>();
    private HashMap<String, String> commandName = new HashMap<>();
    String screenTop = "";
    String screenBottom = "";

    /**
     * Instantiates a new Display Helper
     */
    ScreenHelper(){
        screenBottom = AdsManager.getAd();
    }

    public String getScreenTop(){ return screenTop; }

    public String getScreenBottom(){ return screenBottom; }

    public String getCommandName(String key) { return commandName.get(key); }

    /**
     * Registers a screen command to Hashmap
     *
     * @param cmd  Command in String
     * @param name Command name
     * @param mi   MenuItem
     */
    void registerCommand(String cmd,String name, MenuItem mi)
    {
        commandName.put(cmd,name);
        command.put(cmd,mi);
    }

    /**
     * Selects and invoke's the command.
     *
     * @param cmd  Command in string
     */
    public void selectMenuItem(String cmd)
    {
        MenuItem mi = command.get(cmd);
        if(mi != null)
            mi.invoke();
    }


    /**
     * Override this to display not-generic layout
     */
    public String display()
    {
        return "";
    }

    public void key(String keypad) { }
}
