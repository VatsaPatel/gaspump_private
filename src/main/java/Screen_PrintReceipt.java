/**
 * Screen for print receipt.
 */
public class Screen_PrintReceipt extends ScreenHelper implements IScreen {

    /**
     * Instantiates a new Screen print receipt.
     * Registers C, D, G & H command command.
     */
    Screen_PrintReceipt()
    {
        super.screenTop = "Print Receipt?";

        registerCommand("C", "Yes", D);
        registerCommand("D", "No",  D);
        registerCommand("G", "Help",D);
        registerCommand("H", "Done",D);
    }

    /**
     * Binds Dcommand() to MenuItem
     */
    MenuItem D = () -> Dcommand();
    void Dcommand() { ScreenController.changeScreen( ScreenController.thanks ); }  // Change to next screen.

}