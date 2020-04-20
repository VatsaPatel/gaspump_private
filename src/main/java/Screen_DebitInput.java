/**
 * Debit input Screen.
 */
public class Screen_DebitInput extends ScreenHelper implements IScreen {

    /**
     * Instantiates a new Screen debit input.
     */
    Screen_DebitInput()
    {
        super.screenTop = "Scan Debit Card";
    }

    /**
     * Captures the keypad input
     */
    public void key(String keypad)
    {
        if(keypad.length()==16) {
            //Send value to payment system
            ScreenController.changeScreen( ScreenController.pinScreen );  // Change to next screen.
        }
        else
            super.screenTop = "Please enter 16 digit card";  // Changes screen name if validation failed.
    }

}