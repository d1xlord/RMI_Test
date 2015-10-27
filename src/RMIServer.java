/**
 * Created by nafis on 2/23/15.
 */

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer
        extends UnicastRemoteObject
        implements TestService {

    static int port = 1099;

    public RMIServer() throws RemoteException {
        super();
    }

    public int getSquare(int val) {
        return val*val;
    }

    public static void  main(String args[]) throws Exception {
        System.out.println("RMI Server Started");

        try {
            LocateRegistry.createRegistry(port);
            System.out.println("java RMI registry created.");
        } catch (RemoteException e) {
            LocateRegistry.getRegistry(port);
            System.out.println("java RMI registry already exists.");
        }

        RMIServer svr = new RMIServer();

        Naming.rebind("RmiServer", svr);
        System.out.println("Service bound in registry...");
    }
}
