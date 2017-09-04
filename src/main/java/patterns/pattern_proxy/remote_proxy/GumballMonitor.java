package patterns.pattern_proxy.remote_proxy;

import java.rmi.RemoteException;

public class GumballMonitor {

    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current Inventory: " + gumballMachine.getCount() + " gumballs");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
