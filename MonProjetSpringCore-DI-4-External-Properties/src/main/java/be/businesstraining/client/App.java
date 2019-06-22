package be.businesstraining.client;

import be.businesstraining.dao.ComptesDaoImplJDBC;
import be.businesstraining.dao.IComptesDao;
import be.businesstraining.domain.Compte;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;


public class App {
	
	public static void main(String[] args) {
		
		System.out.println("==Illustration d'un DAO JDBC simple ");
		// Start the factory
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Get the bean
		IComptesDao dao = context.getBean(ComptesDaoImplJDBC.class);

		// Test de la création d'un nouveau compte
		 Compte nouveau = new Compte("A200","QWERTY",new
				 BigDecimal("123.456"));
		// dao.create(nouveau);

		Compte compte = dao.findById("A200");
		System.out.println(compte);
		// Close the factory
		context.close();
	}
}
