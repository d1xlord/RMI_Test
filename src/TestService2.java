import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by nafis on 2/24/15.
 */
public interface TestService2 extends Remote{
    public String getString(String val) throws RemoteException;
}
