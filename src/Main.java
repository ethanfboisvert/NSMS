public class Main
{
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainMenu().setVisible(true);
            }//end run
        });
    }   //end main        
}//end Main
