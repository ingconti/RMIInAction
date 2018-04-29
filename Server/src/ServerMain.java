import java.rmi.RemoteException;

public class ServerMain implements Loggable {


    public static void main(String[] args) {
        System.out.println("Hello from Server!");

        Loggable stub = (Loggable) UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public boolean login(String nick) throws RemoteException {
        return false;
    }

    @Override
    public void logout(String nick) throws RemoteException {

    }
}
