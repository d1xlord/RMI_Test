/**
 * Created by nafis on 2/23/15.
 */

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer2
        extends UnicastRemoteObject
        implements TestService2 {

    static int port = 2099;

    public RMIServer2() throws RemoteException {
        super();
    }

    public String getString(String val) {
        return "Returned from RMIServer2 with " + val;
    }

    public static void  main(String args[]) throws Exception {
        System.out.println("RMI2 Server Started");

        try {
            LocateRegistry.createRegistry(port);
            System.out.println("java RMI2 registry created.");
        } catch (RemoteException e) {
            LocateRegistry.getRegistry(port);
            System.out.println("java RMI2 registry already exists.");
        }

        RMIServer2 svr = new RMIServer2();

        Naming.rebind("RmiServer2", svr);
        System.out.println("Service2 bound in registry...");
    }
}
