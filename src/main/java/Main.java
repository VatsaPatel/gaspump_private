
/*
    Sample Program Demonstrating the use of Patterns for an Input Mask
    Uses java.io.Console for ScreenController output and input.

    ref: https://docs.oracle.com/javase/7/docs/api/java/io/Console.html

*/
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        App app = new App() ;
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("\033[H\033[2J") ; // clear the screen
            System.out.flush() ;
            System.out.println( app.display() ) ;
            System.out.print("=> ") ;
            String ch = scanner.nextLine();
            String cmd = ch.toUpperCase();
            cmd = cmd.replaceAll("\\s","") ;
            if(cmd.length() == 1)
            {
                Character c = cmd.charAt(0);
                if(c>='A' && c<='H')
                    app.cmd( cmd ) ;
                else
                    app.key( cmd );
            }
            else
                app.key(cmd);

        }
    }
}