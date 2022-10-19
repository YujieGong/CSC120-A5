/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * TODO: Modify this method to print a decorative banner, resized to fit the message
     */
    public void display() {
        int length = message.length();
        System.out.print("  ");
        for (int n = 0; n < length+6; n++)
            System.out.print("*");
        System.out.print("  ");
    
        System.out.print("\n"+ "***");
        for (int n = 0; n < length+4; n++)
            System.out.print("~");
        System.out.print("***");
        
        System.out.println("\n"+"*** ~"+this.message+"~ ***");

        System.out.print("***");
        for (int n = 0; n < length+4; n++)
            System.out.print("~");
        System.out.println("***");
        
        System.out.print("  ");
        for (int n = 0; n < length-3; n++)
            System.out.print("*");
        System.out.print("     ");
        System.out.println("***");

        System.out.print("    ");
        for (int n = 0; n < length; n++)
            System.out.print("*");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("hello world");
        myBanner.display();
    }
}
