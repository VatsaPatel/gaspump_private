/**
 * gas select screen.
 */
public class Screen_GasSelect extends ScreenHelper implements IScreen {

    /**
     * Instantiates a new Screen gas select.
     */
    Screen_GasSelect()
    {
        super.screenTop = "Select Grade & Pump Gas...";
    }

    /**
     * Captures the keypad input
     */
    public void key(String keypad)
    {
        // Start pumping()
        ScreenController.changeScreen( ScreenController.printReceipt );  // Change to next screen.
    }

}