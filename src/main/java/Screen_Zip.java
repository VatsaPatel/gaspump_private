/**
 * Screen for zip.
 */
public class Screen_Zip extends ScreenHelper implements IScreen {

    /**
     * Instantiates a new Screen zip.
     */
    Screen_Zip()
    {
        super.screenTop = "Enter your Zip Code";
    }

    public void key(String keypad)
    {
        if(keypad.length()==5) {
            //Send value to payment system
            ScreenController.changeScreen( ScreenController.gasSelect );  // Change to next screen.
        }
        else
            super.screenTop = "Please enter 5 digit Zip code.";  // Changes screen name if validation failed.
    }

}