package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop;
import com.tka.entity.Student;

public class MainClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Laptop.class);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session= factory.openSession();
	
		session.beginTransaction();
		
		Laptop lapi1=new Laptop("Lenovo");
		Laptop lapi2=new Laptop("Dell");
		Laptop lapi3=new Laptop("HP");
		Laptop lapi4=new Laptop("MAC");
		
//		List<Laptop> list=new ArrayList<Laptop>();
//		list.add(lapi1);
//		list.add(lapi2);

//		Laptop lappy1= session.get(Laptop.class, 3);
//		Laptop lappy2= session.get(Laptop.class, 4);
//		List<Laptop> list=new ArrayList<Laptop>();
//		list.add(lappy1);
//		list.add(lappy2);
		
//		Student stud=new Student();
//		stud.setName("Jay");
	//	stud.setLaplist(list);

//		session.persist(lapi1);
//		session.persist(lapi2);
//		session.persist(lapi3);
//		session.persist(lapi4);
		
	//	session.persist(stud);
		
		
		Student s= session.get(Student.class, 1);
		
		List<Laptop> s_laplist= s.getLaplist();
		
		session.getTransaction().commit();
		session.close();
				
		System.out.println(s);
		
		for(Laptop lap_i: s_laplist) {
			System.out.println(lap_i);
		}
	}

}
