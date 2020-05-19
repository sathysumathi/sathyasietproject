package net.codejava.contact.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

public class ContactDaoTest {
	private DriverManagerDataSource dataSource;
	private  ContactDao dao;
	

	@Test
	public void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		dao=new ContactDaoImpl(dataSource);
		Contact contact=new Contact("steve jobs","sathya@gmail.com","pollachi, ca","123234443556");
		int result=dao.save(contact);
		assertTrue(result > 0);
		
		
			
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testList() {
		fail("Not yet implemented");
	}

}
