package com.tka.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.tka.entity.Song;

public class InsertOperation {

	public static void main(String[] args) {

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory=	config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		Song s=new Song();
//		s.setName("Apna Bana Le");
//		s.setArtist("Arjit Singh");
		
//		s.setName("Ishq Tera");
//		s.setArtist("Guru Randhawa");
		
		s.setName("Heeriye");
		s.setArtist("Arjit Singh");
		
		session.persist(s);
		session.getTransaction().commit();
		session.close();
		
	}

}
