package de.abiegel.jaxrs.auth.base;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 
 * @author Arjan Tijms
 * 
 */
public class BaseServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        // NOOP
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // NOOP
    }

}
