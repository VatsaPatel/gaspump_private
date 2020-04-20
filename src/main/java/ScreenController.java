public class ScreenController
{
    private static IScreen currentScreen;

    static IScreen creditDebit;
    static IScreen creditInput;
    static IScreen debitInput;
    static IScreen pinScreen;
    static IScreen zipScreen;
    static IScreen gasSelect;
    static IScreen printReceipt;
    static IScreen thanks;

    public ScreenController()
    {
        creditDebit = new Layout1Decorator(new Screen_CreditDebit());
        creditInput = new Layout1Decorator(new Screen_CreditInput());
        pinScreen = new Layout1Decorator(new Screen_Pin());
        zipScreen = new Layout1Decorator(new Screen_Zip());
        debitInput = new Layout1Decorator(new Screen_DebitInput());
        gasSelect = new Layout1Decorator(new Screen_GasSelect());
        printReceipt = new Layout1Decorator(new Screen_PrintReceipt());
        thanks = new Layout1Decorator(new Screen_Thanks());

        currentScreen = creditDebit;
    }

    public static void changeScreen(IScreen screen) { currentScreen = screen; }

    public static void selectMenuItem(String cmd) { currentScreen.selectMenuItem(cmd); }

    public void key(String keypad) { currentScreen.key(keypad); }

    public String display() { return currentScreen.display(); }

}
