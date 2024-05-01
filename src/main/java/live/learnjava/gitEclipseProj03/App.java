package live.learnjava.gitEclipseProj03;

import live.learnjava.gitEclipseProj03.beans.Consultant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Consultant consultant = new Consultant("Suresh", 99);
        System.out.println(consultant);
    }
}
