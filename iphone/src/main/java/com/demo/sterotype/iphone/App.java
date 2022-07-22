package com.demo.sterotype.iphone;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Core
 *
 */
public class App
{
    public static void main( String[] args )
    {
      ApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
      Iphone phone=context.getBean(Iphone.class);
      phone.config();
    }

}