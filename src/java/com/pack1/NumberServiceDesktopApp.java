
package com.pack1;


import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Azough Mehdi
 */
public class NumberServiceDesktopApp {
 
    public static void main(String[] args) throws NamingException {
        Properties props = new Properties();
       /* props.setProperty("java.naming.factory.initial","com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("java.naming.factory.url.pkgs","com.sun.enterprise.naming");
        props.setProperty("java.naming.factory.state","com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");*/
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost"); 
        InitialContext context = new InitialContext(props);
        NumberService service = (NumberService) context.lookup("NumberServiceJNDIName");
        System.out.printf("Small lucky number : %6.2f.%n",service.getNumber(10));
        System.out.printf("Medium lucky number : %6.2f.%n",service.getNumber(100)); 
        System.out.printf("Big lucky number : %6.2f.%n",service.getNumber(1000));
    }
    
}
