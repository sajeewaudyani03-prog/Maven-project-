package com.mycompany.app;
import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Ansi.Attribute.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(colorrize(text:"Green text", GREEN_TEXT()));
        System.out.println(colorrize(text:"Red on white", RED_TEXT(), WHITE_BACK()));
        System.out.println( "Hello World!" );
    }
}
