package pattern_proxy.remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    //Return types of remote methods must be serializable!
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;

}
