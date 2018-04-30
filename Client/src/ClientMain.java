import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import static java.lang.System.*;

public class ClientMain {

    private ClientMain() {}

    public static void main(String[] args) {
        //out.println("Hello From Client!");

        try {
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(null);

            // Looking up the registry for the remote object
            Loggable stub = (Loggable) registry.lookup("Loggable");

            // Calling the remote method using the obtained object
            //stub.printMsg();

            // System.out.println("Remote method invoked");
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    }





}
