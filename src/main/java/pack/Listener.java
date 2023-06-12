package pack;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class Listener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Server started");
		System.out.println("Context path: " +event.getServletContext().getContextPath());
		System.out.println("---------------");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
	}
	
}
