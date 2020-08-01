import myRemote.CalcInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Minoofam on 8/11/2019.
 */
public class Main {
    public static void main (String[] args) {
        try {
            CalcInterface calcInterface= (CalcInterface) Naming.lookup ("//localhost/usc");
            System.out.println ("The result is: "+calcInterface.plus (12,8));
            System.out.println ("The result is: "+calcInterface.minus (12,8));
        } catch (NotBoundException e) {
            e.printStackTrace ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        } catch (RemoteException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
