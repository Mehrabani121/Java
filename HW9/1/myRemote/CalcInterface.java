package myRemote;

import java.rmi.Remote;

/**
 * Created by Minoofam on 8/11/2019.
 */
public interface CalcInterface extends Remote {
    int plus (int x, int y)throws Exception;
    int minus (int x, int y)throws Exception;
}
