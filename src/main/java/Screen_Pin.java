/**
 * Debit pin input screen.
 */
public class Screen_Pin extends ScreenHelper implements IScreen {

    /**
     * Instantiates a new Screen pin.
     */
    Screen_Pin()
    {
        super.screenTop = "Enter your Pin";
    }

    /**
     * Captures the keypad input
     */
    public void key(String keypad)
    {
        if(keypad.length()==4) {
            //Send value to payment system
            ScreenController.changeScreen( ScreenController.gasSelect );  // Change to next screen.
        }
        else
            super.screenTop = "Please enter 4 digit Pin";  // Changes screen name if validation failed.
    }

}