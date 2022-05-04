package com.aman.trainings.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class RequestListener implements ServletRequestListener {

   
    public void requestDestroyed(ServletRequestEvent event)  { 
         System.out.println("destroyed");
    }

	
    public void requestInitialized(ServletRequestEvent event)  { 
         System.out.println("initialized");
    }
	
}
