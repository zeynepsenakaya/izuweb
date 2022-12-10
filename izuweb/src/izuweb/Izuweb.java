
package izuweb;

public class Izuweb {

   
    public static void main(String[] args) throws InterruptedException {
     
        Splash a = new Splash();
        a.setVisible(true);
        Thread.sleep(3500);
        a.setVisible(false);
        Home b = new Home();
        b.setVisible(true);
       
        
    }
    
}
