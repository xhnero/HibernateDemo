package com.hib;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hib.pojo.UserDto;

import com.hib.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		
		UserDto user = new UserDto();
		user.setUsername("root");
		user.setPassword("root");
		user.setEmail("root@admin.com");
		user.setPhoneNo("777777777");
		user.setName("Anh");
		user.setDob(new Date());
		session.save(user);	
		session.getTransaction().commit();	
		session.close();

	}

}
