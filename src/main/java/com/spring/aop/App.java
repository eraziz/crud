package com.spring.aop;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("com\\spring\\aop\\config.xml");
   PaymentService bean = ac.getBean("payment",PaymentService.class);
    
    bean.makePayment();
    
    
    }
}
