/**
 * credit input Screen.
 */
public class Screen_CreditInput extends ScreenHelper implements IScreen {

    /**
     * Instantiates a new Screen credit input.
     */
    Screen_CreditInput()
    {
        super.screenTop = "Scan Credit Card";
    }

    /**
     * Captures the keypad input
     */
    public void key(String keypad)
    {
        if(keypad.length()==16)
            //Send value to payment system
          ScreenController.changeScreen( ScreenController.zipScreen );  // Change to next screen.
        else
            super.screenTop = "Please enter 16 digit card"; // Changes screen name if validation failed.
    }

}