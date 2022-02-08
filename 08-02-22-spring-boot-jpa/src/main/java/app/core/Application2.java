package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.daos.PersonDao;
import app.core.entities.Person;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(Application2.class, args);
		
		// create an entity object to save in the database
		
		PersonDao dao = ctx.getBean(PersonDao.class);
		
//		// create
//		{
//			Person person = new Person(0, "Moshe", 33);
//			int id = dao.create(person);
//			System.out.println(id);
//		}
		
		// read
		{
			Person p = dao.read(2);
			System.out.println(p);
		}
		
		// update
//		{
//			Person person = new Person(5, "Moshe Levi", 40);
//			dao.update(person);
//		}
		
		// delete
//		{
//			dao.delete(5);
//		}
	}

}
