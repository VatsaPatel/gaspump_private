/**
 * Credit or Debit Screens
 */
public class Screen_CreditDebit extends ScreenHelper implements IScreen {

    /**
     * Instantiates a new Screen credit debit.
     * Registers C & D command.
     */
    Screen_CreditDebit()
    {
        super.screenTop = "Credit or Debit";
        registerCommand("C", "Credit", C);
        registerCommand("D", "Debit",  D);
    }

    /**
     * Binds Ccommand() to MenuItem
     */
    MenuItem C = () -> Ccommand();
    private void Ccommand() { ScreenController.changeScreen(ScreenController.creditInput); }  // Change to next screen.

    /**
     * Binds Dcommand() to MenuItem
     */
    MenuItem D = () -> Dcommand();
    private void Dcommand() { ScreenController.changeScreen( ScreenController.debitInput); }  // Change to next screen.

}