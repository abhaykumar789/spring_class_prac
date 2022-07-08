package com.cgi.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cgi.Employee;

public class ClientCode 
{

    public static void main(String[] args) 
    {
        String path = "application.xml";
//        Resource resource = new ClassPathResource(path);
//        BeanFactory factory = new XmlBeanFactory(resource);
//        Object o = (Employee)factory.getBean("ref");
        
        ApplicationContext context=new ClassPathXmlApplicationContext(path);
        
//        Object o = context.getBean("ref");
        
        Employee employee=(Employee)context.getBean("emp",Employee.class);
        System.out.println(employee);
        
//        Employee emp=context.getBean(Employee.class);
//        Employee emp1=context.getBean("ref",Employee.class);
//      
//        if (o instanceof Employee) 
//        {
//            // downcasting
//            Employee emp = (Employee) o;
//            System.out.println(emp);
//        }
    }

}

