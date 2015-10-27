import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TestService extends Remote {
    // Return the square of a number
    public int getSquare(int val) throws RemoteException;
}
