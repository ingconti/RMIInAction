import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain implements Loggable {

    public ServerMain() {

    }

    static int PORT = 1234;

    public static void main(String[] args) {
        //System.out.println("Hello from Server!");

        try {
            ServerMain obj = new ServerMain();
            Loggable stub = (Loggable) UnicastRemoteObject.exportObject(obj, PORT);

            // Bind the remote object's stub in the registry
           //NO Registry registry = LocateRegistry.getRegistry();
            Registry registry = LocateRegistry.createRegistry(PORT);
            registry.bind("Loggable", stub);
            System.err.println("Server ready");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }

    public boolean login(String nick) throws RemoteException {
        return false;
    }

    public void logout(String nick) throws RemoteException {

    }
}
