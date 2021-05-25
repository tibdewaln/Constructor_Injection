package com.springbeans;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

    public static void main(String[] args) throws IOException {
//        load();
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberShip m = ac.getBean("memObj", MemberShip.class);
        display(m);
        
//        BeanFactory a = new XmlBeanFactory(new ClassPathResource("spring.xml"));
    }    

    public static void display(MemberShip m)
    {
        System.out.println(m.getMembershipId() + " " + m.getMembershipType() + " " + m.getVisitsPerYear() + " " + m.getCustomer());
    }
    
    public static void load() throws IOException {
//        System.out.println("Enter Customer Details:");
        Scanner in = new Scanner(System.in);
        String cid = in.next();
        String cname = in.next();
        String cemail = in.next();
        String cno = in.next();
//        System.out.println("Enter Membership Details:");
        String membershipId = in.next();
        String mType = in.next();
        String vyear = in.next();
        Properties pr = new Properties();
        pr.put("id", cid);
        pr.put("cname", cname);
        pr.put("cemail", cemail);
        pr.put("cno", cno);
        pr.put("membershipId", membershipId);
        pr.put("mType", mType);
        pr.put("vyear", vyear);
        String loc = "data.properties";
        FileOutputStream fos = new FileOutputStream(loc);
        pr.store(fos, "abc");
        System.out.println("Properties file created");
    }
}

