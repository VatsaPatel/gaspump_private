import java.util.HashMap;

/**
 * decorates screen's display.
 * Layout 1
 * ============================================
 *              top screen
 *
     [A]                                  [E]

     [B]                                  [F]

     [C]                                  [G]

     [D]                                  [H]

                bottom screen
 */
public class Layout1Decorator implements IScreen{
    IScreen screen;
    public Layout1Decorator(IScreen screen)
    {
        this.screen = screen;
    }
    /**
     * Pad spaces to Center and Right align text
     *
     * @param num number
     * @return Strung string
     */
    private String padSpaces(int num) {
        StringBuffer spaces = new StringBuffer();
        for ( int i = 0; i<num; i++ )
            spaces.append(" ") ;
        return spaces.toString() ;
    }

    /**
     * Returns center aligned text as per current screen spec.
     * @param s string
     * @return String string
     * TODO: take in screen width if need to support other type of screen too.
     */
    public String centerer(String s)
    {
        StringBuffer out = new StringBuffer();
        String[] lines = s.split("\\r?\\n");
        for(int i = 0; i< lines.length; i++){
            int nameLen = lines[i].length() ;
            if (nameLen < 39 ) {
                int pad = (40 - nameLen) / 2 ;
                out.append(padSpaces( pad )) ;
            }
            out.append(lines[i]);
            if (i<lines.length-1) {
                out.append("\n");
            }
        }
        out.append("\n");
        if(lines.length==1)
            out.append("\n");
        return(out.toString());
    }

    /**
     * Prints Left and right justified Screen commands
     *
     * @param left  the left
     * @param right the right
     * @return the string
     */
    public String menuLine(String left, String right)
    {
        String leftName = screen.getCommandName(left);
        if(leftName == null) leftName = "";
        String rightName = screen.getCommandName(right);
        if(rightName == null) rightName = "";
        left = "[" + left + "] " + leftName;
        right = rightName + " [" + right + "]";
        int pad = 40-(left.length()+right.length());
        return(left + padSpaces(pad) + right + "\n");
    }

    /**
     * Selects and invoke's the command.
     *
     * @param cmd  Command in string
     */
    public void selectMenuItem(String cmd) { screen.selectMenuItem(cmd); }


    /**
     * Print each screen's output.
     */
    public String display()
    {
        String output = "";
        output += "========================================\n" ;
        output += "\n"                                         ;
        output +=         centerer(screen.getScreenTop())           ;
        output += "\n"                                         ;
        output += menuLine("A",                    "E");
        output += "\n"                                         ;
        output += menuLine("B",                    "F");
        output += "\n"                                         ;
        output += menuLine("C",                    "G");
        output += "\n"                                         ;
        output += menuLine("D",                    "H");
        output += "\n"                                         ;
        output +=        centerer(screen.getScreenBottom())         ;
        output += "========================================\n" ;
        return output;
    }

    public String getScreenTop(){ return screen.getScreenTop(); }

    public String getScreenBottom(){ return screen.getScreenBottom(); }

    public String getCommandName(String key) { return screen.getCommandName(key); }

    public void key(String keypad) { screen.key(keypad); }
    
}
