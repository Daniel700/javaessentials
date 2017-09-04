package patterns.pattern_proxy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import patterns.pattern_proxy.protection_proxy.NonOwnerInvocationHandler;
import patterns.pattern_proxy.protection_proxy.OwnerInvocationHandler;
import patterns.pattern_proxy.protection_proxy.PersonBean;
import patterns.pattern_proxy.protection_proxy.PersonBeanImpl;
import patterns.pattern_proxy.remote_proxy.GumballMachine;
import patterns.pattern_proxy.remote_proxy.GumballMonitor;

import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ProxyTest {

    @Before
    public void setUp() throws Exception {

    }


    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testRemoteProxy()  {

        try {
            GumballMachine gumballMachine = new GumballMachine("Nuernberg", 5);
            Naming.rebind("rmi://Nuernberg/gumballMachine", gumballMachine);

            GumballMonitor monitor = new GumballMonitor(gumballMachine);
            monitor.report();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testVirtualProxy() throws Exception {



    }


    @Test
    public void testProtectionProxy() {

        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe");


        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        }
        catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        System.out.println("");

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("cycling");
        }
        catch (Exception e) {
            System.out.println("Can't set interests from non-owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }


    /**
     * proxy class is created dynamically at runtime with the .newProxyInstance() method
     */
    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    /**
     * proxy class is created dynamically at runtime with the .newProxyInstance() method
     */
    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }


}
